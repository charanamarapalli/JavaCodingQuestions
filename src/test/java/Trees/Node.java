package Trees;

import java.util.*;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        Node left1 = root.left;
        Node right1 = root.right;

        left1.left = new Node(4);
        left1.right = new Node(5);

        right1.left = new Node(6);
        right1.right = new Node(7);

        left1.right.left = new Node(8);

        right1.right.left = new Node(9);
        right1.right.right = new Node(10);

        //inOrderTraversal(root);
        preOrderTraversalItervative(root);
        //preOrderTraversal(root);
        //postOrderTraversal(root);
        //System.out.println(sumOfLeftLeafs(root));

    }

    public static void inOrderTraversalIterative(Node node) {

    }

    public static void inOrderTraversal(Node node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.println(node.data);
        inOrderTraversal(node.right);
    }

    public static void preOrderTraversalItervative(Node root) {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        List<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.peek().data);
            root = stack.pop();

            if(root.right!=null) stack.add(root.right);
            if(root.left!=null) stack.add(root.left);
        }

        for(Integer i: list){
            System.out.println(i);
        }
    }


    public static void preOrderTraversal(Node node) {
        if (node == null) return;
        System.out.println(node.data);
        inOrderTraversal(node.left);
        inOrderTraversal(node.right);
    }

    public static void postOrderTraversal(Node node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        inOrderTraversal(node.right);
        System.out.println(node.data);
    }

    public static int sumOfLeftLeafs(Node root) {
        if (root == null) return 1;
        int sum = 0;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {


            for (int i = 0; i < queue.size(); i++) {
                if (queue.peek().left != null) {
                    System.out.println("entered here");
                    sum = sum + queue.peek().left.data;
                    queue.add(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    System.out.println("entered there");
                    queue.add(queue.peek().right);
                }
                ((LinkedList<Node>) queue).pop();
            }


        }
        System.out.println(queue.size());

        return sum;
    }

    public static void SumRootToLeafNumbers(Node root){


    }

    public static void recursiveFunction(Node root, int currentPathValue, int soFarValue, List<Integer> list) {

    }
}


