package com.NIK.HASH;

//
// Array of nodelist of documents
//
public class NodeListArray {
    public NodeList array[];
    public int size = 5;

    NodeListArray() {
        expand();
    }

    //
    // Pushing element to
    //
    public void pushElement(Document element) {
        String str = Integer.toString(element.getId_());
        int hashMod = str.hashCode() % size;
        array[hashMod].push(element.getId_(), element.getSrc_());
    }

    //
    // Expanding array to size * 2 and clear it
    //
    public void expand() {
        size *= 2;
        array = new NodeList[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new NodeList();
        }
    }

    //
    // Expanding array to size * 2 with recalculating hashCodes
    //
    public void expandSave() {
        NodeList[] saveArray = new NodeList[size];
        for (int i = 0; i < array.length; i++) {
            saveArray[i] = array[i];
        }

        expand();

        for (int i = 0; i < saveArray.length; i++) {
            Node cur = saveArray[i].head;
            while (cur != null){
                String str = Integer.toString(cur.val.getId_());
                int hashMod = str.hashCode() % size;
                array[hashMod].push(cur.val);
                cur = cur.next;
            }
        }
    }

    public Document getElement(int id) {
        String ptr = Integer.toString(id);
        int hashMod = ptr.hashCode() % size;
        Node cur = array[hashMod].head;
        while (cur != null){
            if (cur.val.getId_() == id)
                return cur.val;
        }
        return null;
    }

    public void show() {
        for (int i = 0; i < array.length; i++) {
            Node cur = array[i].head;
            System.out.println(i);
            while (cur != null){
                System.out.print(" :: ");
                cur.val.show();
                cur = cur.next;
            }
        }
    }
}
