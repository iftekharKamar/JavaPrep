package leacture.LinkedList;

public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public  Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public void addFirst(int data){
        //step1 =create new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }

        //step2 = newNode next =head
        newNode.next =head; //link

        //step3 head==newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next = newNode;
        tail =newNode;
    }

    public void printll(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addIndex(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next= newNode;
    }

    public  void size(){
        if(head==null){
            System.out.println("0");
        }
        Node temp =head;
        int c=0;
        while(temp.next==null){
            temp = temp.next;
            c++;
        }
        System.out.println(c);
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val =head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }

        //previous data
        Node prev =head;
        for(int i =0;i<size-2;i++){
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail= prev;
        size--;
        return val;
    }

    public int search(int val){
        Node temp = head;
        int i =0;
        while(temp!=null){
            if(temp.data==val){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;

        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recuSearch(int key){
        return helper(head,key);
    }

    public void reversell(){
        Node prev = null;
        Node curr = tail=head;
        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        head = prev;
    }

    public void deleteNthfromEnd(int n){
        int sz = 0;
        Node temp =head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }

        if(n==sz){
            head = head.next;
            return;
        }

        //sz-n
        int i =1;
        int iToFind = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome(){
        if(head==null||head.next==null){
            return true;
        }
        //step1 - find mid
       Node midNode = findMid(head);
        //step2 - reverse 2nd half
           Node prev = null;
           Node curr = midNode;

           while(curr!=null){
              Node next = curr.next;
               curr.next =prev;
               prev=curr;
               curr = next;
           }
           Node right = prev;//right half head
           Node left = head;

        //step3 - check left half & right half
           while(right!=null){
               if(left.data !=right.data){
                   return false;
               }
               left=left.next;
               right = right.next;
           }
           return true;

    }

    public static boolean floysdsAlgorithm(){
        Node slow =head;
        Node fast = head;

        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return true;
            }

        }
        return false;
    }

    public static void removeCycle(){
        Node slow =head;
        Node fast = head;
        boolean cycle = false;

        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                    cycle = true;
                    break;
                }
            }
        if(cycle==false){
            return;
        }
        //find meeting point
            slow = head;
        Node prev = null;
        while (slow!=fast){
            prev = fast;
            slow = slow.next;
            fast=fast.next;
        }
        //remove cycle
            prev.next=null;

        }

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast!=null&&fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

        public Node mergeSort(Node head){
        if(head==null|| head.next ==null){
            return head;
        }
        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next =null;
       Node newLeft= mergeSort(head);
        Node newright =mergeSort(rightHead);

        return merge(newLeft,newright);
        }
        private Node merge(Node head1,Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (head1!=null && head2 !=null){
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
        }

        public void zigZag(){

        //find mid
            Node slow = head;
            Node fast = head.next;
            while(fast!=null&&fast.next !=null){
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid = slow;

        //reverse 2nd half
            Node prev=null;
            Node curr= mid.next;
            mid.next=null;

            Node next;
            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;

            }
            //alternate merging
            Node left = head;
            Node right=prev;
            Node nextL,nextR;
            while(left!=null&&right!=null){
                nextL=left.next;
                left.next=right;
                nextR = right.next;
                right.next=nextL;
                left = nextL;
                right =nextR;
            }
        }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String[] args) {

   LinkedList ll =  new LinkedList();
   ll.addFirst(1);
   ll.addFirst(2);
   ll.addFirst(3);
   ll.addFirst(4);
   ll.addFirst(5);
   ll.printll();
   ll.zigZag();
   ll.printll();







    }
}


