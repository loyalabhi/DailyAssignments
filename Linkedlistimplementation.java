class Node {
    public Object item;
    public Node next;// pointing to next node
}

public class Linkedlistimplementation {
    private int size;
    private Node head;

    public Linkedlistimplementation() {
        this.size = 0;
        this.head = null;
    }

    public void insertingnode(String i) {
        Node node = new Node();
        node.item = i;
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

    public void addAtStarting(String i) {
        Node n = new Node();
        n.item = i;
        n.next = this.head;
        this.head = n;
    }

    public void addAtMiddle(String i, int pos) {
        Node node = new Node();
        Node current = this.head;
        if (this.head != null && pos <= this.size) {
            for (int j = 0; j < pos; j++) {
                current = current.next;
            }
            node.item = i;
            node.next = current.next;
            current.next = node;
            this.size += 1;
        } else {
            System.out.println("position is greater than size");
        }
    }

    public void deleteAtEnd() {
        if (this.head == null || this.head.next == null) {
            this.head = null;
            return;
        }
        Node current = this.head;
        this.head = null;
        while (current.next != null) {
            this.head = current;
            current = current.next;
        }
        this.head.next = null;
        this.size -= 1;
    }

    public void deleteAtStart() {
        if (this.head == null)
            return;
        this.head = this.head.next;
    }

    public void deleteAtMid(int pos) {
        if (this.head == null || pos <= 1)
            return;
        Node current = this.head;
        this.head = null;
        int curpos = 1;
        while (current != null && curpos < pos) {
            this.head = current;
            current = current.next;
            curpos++;
        }
        if (current == null)
            return;// position greater than list size

        this.head.next = current.next;
    }
    public void find(String value) 
    {
        Node current = this.head;
        boolean flag = false;
        for(int i = 0; i < size; i++) {
            if (current.item.equals(value)) {
                System.out.println("Element present at index " + i);
                flag = true;
                // break;
            }
            
            current = current.next;

        }
        if (!flag) {
            System.out.println("Element not present in Linked List");
        }

    }
    public void display()
    {
        Node current=this.head;
        for(int i=0;i<size;i++)
        {
            System.out.println(current.item);
            current=current.next;
        }

    }
    public static void main(String[] args) {
        Linkedlistimplementation llist=new Linkedlistimplementation();
        llist.insertingnode("Kavya");
        llist.insertingnode("Sri");
        llist.insertingnode("Sai");
        llist.insertingnode("Dheera");
        llist.addAtStarting("Lali");
        llist.addAtMiddle("hari",2);
        llist.addAtMiddle("Puppy",3);
        llist.deleteAtStart();
        llist.find("Kavya");
        //llist.deleteAtEnd();
        llist.deleteAtMid(2);
        llist.display();
}
}