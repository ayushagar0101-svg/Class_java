public class Node {
    int data;
    Node next;

     Node(int data) {
        this.data = data;
        this.next = null;
    }
    public static void main(String[] args) {
        Node n = new Node(16);
        Node n1 = new Node(25);
        Node n2 = new Node(26);
        Node n3 = new Node(40);
        Node n4 = new Node(32);
        n.next=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
       Node temp = n;
       while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
       }
    }
}