package com.NIK.HASH;

public class NodeList {
    public Node head;
    private Node current;

    public void push(int id, String src) {
        current = head;
        Node newn = new Node();
        newn.val = new Document(id, src);
        newn.next = current;
        head = newn;
    }

    public void push(Document doc) {
        current = head;
        Node newn = new Node();
        newn.val = new Document(doc.getId_(), doc.getSrc_());
        newn.next = current;
        head = newn;
    }
}
