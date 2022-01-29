package com.aditya;

import java.util.Scanner;

class Queue2 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node f =null;
    Node r = null;

    void enqueue(Scanner sc) {
        System.out.println("ENTER DATA");
        int data = sc.nextInt();
        Node new_node = new Node(data);
        if (f == null && r == null) {
            f=new_node;
            r=new_node;
        }
        else{
            r.next=new_node;
            r=new_node;
        }
    }


    void dequeue(){
        if(f==null && r==null){
            System.out.println("UNDERFLOW");
        }
        else{
            f=f.next;
        }
    }


    void display(){
        Node temp=f;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        System.out.println(" ");
    }
}


public class QueueUsingLL {
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        Queue2 s = new Queue2();
        int l;
        do{
            System.out.println("PRESS 1 TO PUSH {INSERT)");
            System.out.println("PRESS 2 TO POP (DELETE)");
            System.out.println("PRESS 3 TO DISPLAY");
            System.out.println("ENTER YOUR CHOICE");
            d=sc.nextInt();
            switch (d){
                case 1:
                {
                    s.enqueue(sc);
                    break;
                }
                case 2:
                {
                    s.dequeue();
                    break;
                }
                case 3:
                {
                    s.display();
                    break;
                }
            }
            System.out.println("ENTER 0 TO GO TO MENU");
            System.out.println("ENTER ANY KEY TO EXIT");
            l= sc.nextInt();
        }
        while(l==0);
        System.out.println("EXIT SUCCESSFUL");
    }
}
