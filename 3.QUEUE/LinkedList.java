import java.util.Scanner;
public class InsertAtBegLL {

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
        int data,n,m,pos;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter data");
            data=sc.nextInt();
            Node new_node=new Node(data);
            if(head==null){
                head=new_node; // 10
            }
            else{
                System.out.println("Enter 1 to insert the insert the item at Beginning");
                System.out.println("Enter 2 to insert the insert the item at End");
                System.out.println("Enter 3 to insert the insert the item at Particular Location");
                m=sc.nextInt();
                switch(m){
                    case 1:
                        new_node.next = head;
                        head = new_node;
                    break;
                    
                    case 2:
                        Node temp = head;
                        while(temp.next!=null){
                            temp=temp.next;
                        }
                        temp.next=new_node;
                    break;

                    case 3:
                        System.out.println("Enter The Pos");
                        pos = sc.nextInt();
                        Node temp1 = head;
                        for(int i=0;i<(pos-1);i++){
                            temp1=temp1.next;
                        }
                        new_node.next=temp1.next;
                        temp1.next=new_node;
                    break;
                }
            }
            System.out.println("Do u want add more data if yes press 1");
            n=sc.nextInt();
        }
        while (n==1);
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
        InsertAtBegLL ll = new InsertAtBegLL();
        ll.creation();
        ll.traverser();
    }
}
