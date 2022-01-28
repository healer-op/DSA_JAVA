package com.aditya;

import java.util.Scanner;

class Stack2 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        Node top =null;

        void push(Scanner sc) {
            System.out.println("ENTER DATA");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (top == null) {
                top=new_node;
            }
            else{
                new_node.next=top;
                top=new_node;
            }
        }


        void pop(){
            if(top==null){
                System.out.println("UNDERFLOW");
            }
            else{
                top=top.next;
            }
        }


        void display(){
            Node temp=top;
            while(temp!=null){
                System.out.print(temp.data + " ");
                temp=temp.next;
            }
            System.out.println(" ");
        }
    }


public class StackUsingLL {
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        Stack2 s = new Stack2();
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
                    s.push(sc);
                    break;
                }
                case 2:
                {
                    s.pop();
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
