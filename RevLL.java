import java.util.Scanner;

public class RevLL{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RevLL LL1 = new RevLL();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            LL1.addNode(m);
        }

        LL1.reverseIterate();
        LL1.display();
    }

    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display(){
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Node of Singly LL: ");

        while(current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }

        System.out.println("null");
    }

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }

        head.next = null;
        head = prevNode;
    }    
}