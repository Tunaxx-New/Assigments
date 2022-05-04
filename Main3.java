package com.NIK.HASH;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        NodeListArray arr = new NodeListArray();
        int input = 0;
        Scanner sc = new Scanner(System.in);
        while(true) {
            input = sc.nextInt();
            if (input == -1)
                break;
            sc.nextLine();
            String src = sc.nextLine();

            Document element = new Document(input, src);
            arr.pushElement(element);
        }
        arr.show();
        arr.expandSave();
        arr.show();
        input = sc.nextInt();
        System.out.println(arr.getElement(input).getSrc_());
    }
}
