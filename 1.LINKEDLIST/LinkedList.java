package com.aditya;

import java.util.Scanner;
public class LinkedList {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head = null; //pointer

    public void creation(){
        int data,m=1,pos;
        Scanner sc = new Scanner(System.in);
        while(m!=-1) {
            System.out.println("Enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node; // 10
            } else {
                System.out.println("Enter 1 to insert  " +data+ " at Beginning");
                System.out.println("Enter 2 to insert  " +data+ " at End");
                System.out.println("Enter 3 to insert  " +data+ " at Particular Location");
                System.out.println("Enter -1 to Exit");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;

                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
                        break;

                    case 3:
                        System.out.println("Enter The Pos");
                        pos = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (pos - 1); i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                }
            }

        }
        sc.close();
    }

    public void delete(){
        int data,n,m,p;
        Scanner sc =new Scanner(System.in);
        do {
            if (head == null) {
                System.out.println("LL is empty");
            } else {
                System.out.println("");
                System.out.println("Enter 1 to delete at Beginning");
                System.out.println("Enter 2 to delete at End");
                System.out.println("Enter 3 to delete at Particular Location");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        break;
                    case 2:
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        while (ptr.next != null) {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = null;
                        break;
                    case 3:
                        System.out.println("Enter The postion of node to be deleted");
                        p = sc.nextInt();
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        for (int i = 0; i < p - 2; i++) {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = ptr1.next;
                        break;
                }
            }
            System.out.println("Do u want to delete more , press 1");
            n = sc.nextInt();
        }
        while(n==1);
        sc.close();
    }

    public void traverser(){
        Node temp = head; // pointer
        if(head==null){
            System.out.println("LL does not exist");
        }
        else{
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.creation();
        ll.delete();
        ll.traverser();
    }
}
