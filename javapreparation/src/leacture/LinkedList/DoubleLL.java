package leacture.LinkedList;

public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next =null;
            this.prev = null;
        }

    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail=newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head ==null){
            head=tail=newNode;
            return;
        }
        newNode.prev =tail;
        tail.next = newNode;
        tail = newNode;

    }
    public int removeFirst(){
        if(head==null){
            System.out.println("Dll is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head= tail=null;
            size--;
            return val;

        }
        int val = head.data;
        head= head.next;
        head.prev=null;
        size--;
        return val;
    }
    public int removeLast(){
        if(head==null){
            System.out.println("Dll is Empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head=tail =null;
            size--;
            return val;
        }
        int val =tail.data;
        tail=tail.prev;
        tail.next=null;
        size--;
        return val;
    }
    public void reverse(){
        Node curr =head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            curr.prev=next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void print(){
        Node temp = head;
        System.out.print("null"+"<->");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp  = temp.next;
        }
        System.out.println("null");
    }

    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String[] args) {
        DoubleLL ll = new DoubleLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);
        ll.addFirst(7);
        ll.print();
        ll.reverse();
        ll.print();

    }
}
