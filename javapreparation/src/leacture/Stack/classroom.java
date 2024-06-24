package leacture.Stack;

import java.util.ArrayList;
import java.util.*;

public class classroom {
    /*
    Stack implementation using ArrayList
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size() ==0;
        }

        //push
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top =list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static void peek(){
            if(isEmpty()){
                System.out.println(-1);
            }
            int top =list.get(list.size()-1);
            System.out.println(top);
        }
    }

     */

    //Stack implemetation using LinkedList
//    public static class Node{
//        int data;
//        Node next;
//
//       Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//    static class Stack{
//        static Node head = null;
//
//        public static boolean isEmpty(){
//            return head==null;
//        }
//        //push
//        public static void push(int data){
//            Node newNode = new Node(data);
//            if(isEmpty()){
//                head=newNode;
//                return;
//            }
//            newNode.next=head;
//            head = newNode;
//        }
        //pop
        /*
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static void peek(){
            if(isEmpty()){
                System.out.println("-1");
            }
            int top = head.data;
            System.out.println(top);
        }
    }

         */

    public static void pushFirst(Stack<Integer> s,int data){
if(s.isEmpty()){
    s.push(data);
    return;
}
int top = s.pop();
pushFirst(s,data);
s.push(top);
    }

    public static void stockSpan(int stock[],int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] =1;
        s.push(0);
        for(int i =1;i<stock.length;i++){
            int currPrice = stock[i];
            while(!s.isEmpty()&&currPrice>stock[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }else{
                int prevHigh = s.peek();
                span[i]=i-prevHigh;
            }
            s.push(i);
        }
    }

    public static int[] nextGreater(int arr[], int ans[]){
        Stack<Integer> s = new Stack<>();
       for(int i = arr.length-1;i>=0;i--) {
           while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
               s.pop();
           }
           if (s.isEmpty()) {
               ans[i] = -1;
           } else {
               ans[i] = arr[s.peek()];
           }

           s.push(i);
       }
        return ans;
    }

    public static boolean validParenthesis(String str){
        Stack<Character> s = new Stack<>();

        for(int i =0;i<str.length();i++){
           char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek()=='('&&ch==')')||
                        s.peek()=='{'&&ch=='}'||
                        s.peek()=='['&&ch==']'){
                    s.pop();
                }else {
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }

    public static boolean dublicateParanthesis(String str){
        Stack<Character> s = new Stack<>();
        for(int i =0;i<str.length();i++){
            char ch =str.charAt(i);

            ///closing
            if(ch==')'){
                int c=0;
                while (s.peek()!='('){
                    s.pop();
                    c++;
                }if(c<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
      String str ="(((a+(b))+c))";
      System.out.println(dublicateParanthesis(str));
          }
    }


