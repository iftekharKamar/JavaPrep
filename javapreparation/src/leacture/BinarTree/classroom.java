package BinarTree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class classroom {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

//    static class BinaryTree {
//        static int idx = -1;
//
//        public static Node buildTree(int nodes[]) {
//            idx++;
//            if (nodes[idx] == -1) {
//                return null;
//            }
//
//            Node newNode = new Node(nodes[idx]);
//            newNode.left = buildTree(nodes);
//            newNode.right = buildTree(nodes);
//
//            return newNode;
//        }
//
//        public static void preorder(Node root) { //O(n
//            if (root == null) {
//
//                return;
//            }
//            System.out.print(root.data + " ");
//            preorder(root.left);
//            preorder(root.right);
//        }
//
//        public static void inorder(Node root) {
//            if (root == null) {
//                return;
//            }
//            inorder(root.left);
//            System.out.print(root.data + " ");
//            inorder(root.right);
//        }
//
//        public static void postorder(Node root) {
//            if (root == null) {
//                return;
//            }
//            postorder(root.left);
//            postorder(root.right);
//            System.out.print(root.data + " ");
//
//        }
//
//        public static void LevelOrder(Node root) {
//            Queue<Node> q = new LinkedList<>();
//            q.add(root);
//            q.add(null);
//            while (!q.isEmpty()) {
//                Node currNode = q.remove();
//                if (currNode == null) {
//                    System.out.println();
//                    if (q.isEmpty()) {
//                        break;
//                    } else {
//                        q.add(null);
//                    }
//                } else {
//                    System.out.print(currNode.data + " ");
//                    if (currNode.left != null) {
//                        q.add(currNode.left);
//                    }
//                    if (currNode.right != null) {
//                        q.add(currNode.right);
//                    }
//                }
//            }
//        }
//
//        public static int height(Node root) {
//            if (root == null) {
//                return 0;
//            }
//            int lh = height(root.left);
//            int rh = height(root.right);
//
//            return Math.max(lh, rh) + 1;
//        }
//
//        public static int sumNodes(Node root) {
//            if (root == null) {
//                return 0;
//            }
//            int ls = sumNodes(root.left);
//            int rs = sumNodes(root.right);
//
//            return ls + rs + root.data;
//        }
//
//        public static int Diameter(Node root) {
//            if (root == null) {
//                return 0;
//            }
//
//            int leftDiam = Diameter(root.left);
//            int leftHt = height(root.left);
//            int rightDiam = Diameter(root.right);
//            int rightHt = height(root.right);
//
//            int selfDiam = leftHt + rightHt + 1;
//
//            return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
//        }
//    }
//
//    static class Info {
//        int diam;
//        int ht;
//
//        public Info(int diam, int ht) {
//            this.diam = diam;
//            this.ht = ht;
//        }
//    }
//
//    public static Info diameter(Node root) {
//        if (root == null) {
//            return new Info(0, 0);
//        }
//        Info leftInfo = diameter(root.left);
//        Info rightInfo = diameter(root.right);
//        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
//        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
//
//        return new Info(diam, ht);
//    }
//
//    public static boolean isIdentical(Node node, Node Subroot) {
//        if (node == null && Subroot == null) {
//            return true;
//        } else if (node == null || Subroot == null || node.data != Subroot.data) {
//            return false;
//        }
//
//        if (!isIdentical(node.left, Subroot.left)) {
//            return false;
//        }
//        if (!isIdentical(node.right, Subroot.right)) {
//            return false;
//        }
//        return true;
//    }
//
//    public static boolean isSubtree(Node root, Node Subroot) {
//        if (root == null) {
//            return false;
//        }
//        if (root.data == Subroot.data) {
//            if (isIdentical(root, Subroot)) {
//                return true;
//            }
//            ;
//        }
//        return isSubtree(root.left, Subroot) || isSubtree(root.right, Subroot);
//    }
//
//    static class Info2 {
//        Node node;
//        int hd;
//
//        public Info2(Node node, int hd) {
//            this.node = node;
//            this.hd = hd;
//        }
//    }
//
//    public static void topView(Node root) {
//        Queue<Info2> q = new LinkedList<>();
//        HashMap<Integer, Node> map = new HashMap<>();
//        int min = 0, max = 0;
//        q.add(new Info2(root, 0));
//        q.add(null);
//        while (!q.isEmpty()) {
//            Info2 curr = q.remove();
//            if (curr == null) {
//                if (q.isEmpty()) {
//                    break;
//                } else {
//                    q.add(null);
//                }
//            } else {
//                if (!map.containsKey(curr.hd)) {
//                    map.put(curr.hd, curr.node);
//                }
//
//                if (curr.node.left != null) {
//                    q.add(new Info2(curr.node.left, curr.hd - 1));
//                    min = Math.min(min, curr.hd - 1);
//                }
//                if (curr.node.right != null) {
//                    q.add(new Info2(curr.node.right, curr.hd + 1));
//                    max = Math.max(max, curr.hd + 1);
//                }
//            }
//
//        }
//        for (int i = min; i <= max; i++) {
//            System.out.print(map.get(i).data + " ");
//        }
//        System.out.println();
//    }
    public static void kth(Node root,int l,int k){
        if(root==null){
            return;
        }
        if(l==k){
            System.out.print(root.data +" ");
            return;
        }
        kth(root.left,l+1,k);
        kth(root.right,l+1,k);
    }
    public static boolean getPath(Node root,int n,ArrayList<Node> path){
        if(root==null){
            return false;
        }
            path.add(root);
        if(root.data==n){
            return true;
        }
        boolean foundLeft = getPath(root.left,n,path);
        boolean foundRight = getPath(root.right,n,path);
        if(foundLeft||foundRight){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
        public static Node LCA(Node root,int n1,int n2){
        ArrayList<Node> l1 = new ArrayList<>();
        ArrayList<Node> l2 = new ArrayList<>();
        getPath(root,n1,l1);
        getPath(root,n2,l2);

        //Last common Ancestor
            int i=0;
            for(;i<l1.size()&&i<l2.size();i++){
                if(l1.get(i)!=l2.get(i)){
                    break;
                }
            }

            //last equal node -> i-1th
            Node lca = l1.get(i-1);
            return lca;
        }
        public static Node LCA2(Node root,int n1,int n2) {
            if (root == null || root.data == n1 || root.data == n2) {
                return root;
            }
            Node leftlca = LCA2(root.left, n1, n2);
            Node rightlca = LCA2(root.right, n1, n2);

            if (rightlca == null) {
                return leftlca;
            }
            if (leftlca == null) {
                return rightlca;
            }
            return root;
        }

        public static int lcaDis(Node root,int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int leftDist = lcaDis(root.left,n);
        int rightDist = lcaDis(root.right,n);

        if(leftDist==-1&&rightDist==-1){
            return -1;
        } else if (leftDist==-1) {
           return rightDist+1;
        }else{
         return leftDist+1;
            }
        }
        public static int minDistance(Node root,int n1,int n2){
        Node lca= LCA2(root,n1,n2);

       int dis1= lcaDis(lca,n1);
       int dis2 = lcaDis(lca,n2);

       return dis1+dis2;

        }

        public static int KthAncestor(Node root,int n,int k){
        if(root ==null){
            return -1;
        }
        if(root.data ==n){
            return 0;
        }
        int leftDist = KthAncestor(root.left,n,k);
        int rightDist = KthAncestor(root.right,n,k);

        if(leftDist==-1&&rightDist==-1){
            return -1;
        }
        int max = Math.max(leftDist,rightDist);
        if(max+1==k){
            System.out.println(root.data);
        }
        return max+1;
        }

        public static int Sum(Node root){
        if(root ==null){
            return 0;
        }
        int leftsum=Sum(root.left);
       int rightsum =  Sum(root.right);

       int newLeft = root.left ==null?0:root.left.data;
            int newRight = root.right ==null?0:root.right.data;

        int data = root.data;
        root.data = newLeft+leftsum+newRight+rightsum;


        return data;
        }

        public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        }
          public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right =new Node(3);
            root.right.left =new Node(6);
            root.right.right =new Node(7);

            Node Subroot = new Node(3);
              Subroot.left = new Node(6);
//              Subroot.right = new Node(7);

                    int k =3;
            Sum(root);
            preorder(root);
        }
}
