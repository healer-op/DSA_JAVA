package com.aditya;


import java.util.Scanner;

class Queue{
    int f = -1,r=-1;
    int n=10;
    int q[]=new int [n];
    void enqueue(Scanner sc){
        if(r==(n-1)){
            System.out.println("OVERFLOW");
        }
        else{
            System.out.println("ENTER DATA");
            int i = sc.nextInt();
            if(f==-1 && r==-1){
                f=0;
                r=0;
                q[r]=i;
            }
            else{
                r=r+1;
                q[r]=i;
            }
        }
    }
    void dequeue(){
        if(f==-1 && r==-1){
            System.out.println("UNDER FLOW");
        }
        else{
            f=f+1;
        }
    }
    void display(){
        System.out.println("ITEMS ARE:");
        for(int i =f;i<=r;i++){
            System.out.print(q[i]+" ");
        }
        System.out.println(" ");
    }
}
public class QueueUsingArr  {
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        Queue s = new Queue();
        int l;
        do{
            System.out.println("PRESS 1 TO ENQUEUE {INSERT)");
            System.out.println("PRESS 2 TO DEQUEUE (DELETE)");
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
