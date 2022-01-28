package com.aditya;

import java.util.Scanner;

class Stack{
    int top = -1;
    int n=10;
    int a[]=new int [n];
    void push(){
        if(top==(n-1)){
            System.out.println("Overflow");
        }
        else {
            System.out.println("Enter data");
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            top = top + 1;
            a[top] = i;
            System.out.println(i + " Inserted");
        }
    }
    void pop(){
        if(top==-1){
            System.out.println("Underflow");
        }
        else{
            top=top-1;
            System.out.println("Item Deleted");
        }
    }
    void display(){
        System.out.println("Items are ::");
        for(int j=top;j>=0;j--){
            System.out.print(a[j]+" ");
        }
        System.out.println(" ");
    }
}
public class StackUsingArr {
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
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
                    s.push();
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
