class Node {
    int item;
    Node next;
    public Node(int item) {
        this.item=item;
    }
}

public class StackUsingLL {
    int size=0;
    Node head=null;
    Node tail=null;
    public void push(int item) {
        Node node = new Node(item);
       // node.item = item;
        Node current = this.head;

        if (this.head == null) {
            this.head = node;
            this.head.next = null;
            this.size = 1;
            System.out.println(this.head.toString());
        } else {

            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            node.next = null;
            this.size += 1;
        }
    }
    public void deleteAtLast() {
        if(this.head==null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if(head.next==null) {
            head=null;
            return;
        }
//        Node node=new Node();
        Node prevNode=this.head;
        Node current=this.head.next;
        while(current.next!=null) {
            prevNode=prevNode.next;
            current=current.next;
        }
        prevNode.next=null;
    }
    public void display() {
        Node current=this.head;
        for(int i=0;i<size;i++) {
            System.out.println(current.item +"->");
            current=current.next;
        }
    }
    public static void main(String[] args) {
        StackUsingLL S=new StackUsingLL();
        S.push(10);
        S.push(20);
        S.push(30);
        S.push(40);
        S.push(50);
        S.display();
    }

}