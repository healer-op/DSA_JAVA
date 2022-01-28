package com.aditya;

import java.util.Scanner;
// CICULAR LINKED LIST JAVA
public class CLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head = null;
    Node tail = null;

    public void creation() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter Data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = head;
                new_node.next=head;
            } else {
                System.out.println("ENTER 1 TO INSERT AT BEG, 2 TO INSET AT END , 3 TO ENTER AT POS");
                m=sc.nextInt();
                switch(m){
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        tail.next=head;
                        break;

                    case 2:
                        tail.next=new_node;
                        tail=new_node;
                        new_node.next=head;
                        break;

                    case 3:
                        System.out.println("Enter the pos");
                        p= sc.nextInt();
                        Node temp1=head;
                        for(int i=1;i<(p-1);i++){
                            temp1=temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next=new_node;
                        break;


                }

            }
            System.out.println("Do u want to add more data.If Yes, Press 1");
            n = sc.nextInt();
        }
        while(n==1);
    }

    public void delete(){
        int data,n,m,p;
        Scanner sc=new Scanner(System.in);
        do{
            if(head==null){
                System.out.println("LL DOES NOT EXIST");
            }
            else{
                System.out.println("ENTER 1 TO DEL AT BEG, 2 TO DEL AT END, 3 TO DEL FROM POS");
                m= sc.nextInt();
                switch (m){
                    case 1:
                        Node temp=head;
                        temp = temp.next;
                        head=temp;
                        tail.next=head;
                        break;
                    case 2:
                        Node temp1=head;
                        Node ptr=temp1.next;
                        while(ptr.next!=head){
                            temp1=ptr;
                            ptr=ptr.next;
                        }
                        temp1.next=head;
                        tail=temp1;
                    case 3:
                        System.out.println("ENTER THE POS");
                        p=sc.nextInt();
                        Node temp2=head;
                        Node ptr1=temp2.next;
                        for(int i=1;i<p-1;i++){
                            temp2=ptr1;
                            ptr1=ptr1.next;
                        }
                        temp2.next=ptr1.next;
                        break;
                }
            }
            System.out.println("Do u want to add more data.If Yes, Press 1");
            n = sc.nextInt();
        }
        while(n==1);
    }


    public void traverse(){
        Node temp=head;
        if(head==null){
            System.out.println("LL DOES NOT EXIST");
        }
        else{
            do{
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            while(temp!=head);
        }
    }

    public static void main(String[] args) {
        CLL ll = new CLL();
        ll.creation();
        ll.delete();
        ll.traverse();
    }
}
