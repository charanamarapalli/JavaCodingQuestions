package Trees;

import java.util.*;

import org.apache.commons.lang3.tuple.Pair;

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
		 /** 
		 * right1.right.left = new Node(9); right1.right.right = new Node(10);
		 */

		// inOrderTraversalIterative(root);
		// inOrderTraversal(root);
		// preOrderTraversalItervative(root);
		// preOrderTraversal(root);
		// postOrderTraversalIterativeUsing1Stack(root);
		// postOrderTraversal(root);
		// System.out.println(sumOfLeftLeafs(root));
		// levelOrderTraversal(root);
		//System.out.println(recursiveMaximumDepthTree(root));
		//System.out.println(returnTreeBalancedOrNot(root));
		/*
		 * int arr[]= {0}; diameterOfBinaryTree(root, arr); System.out.println(arr[0]);
		 * //Diameter means number of edges between nodes.
		 */		
		 
		/*
		 * int arr[]= {0}; maximumPathSum(root, arr); System.out.println(arr[0]);
		 */
		 
		 zigzagTraversal(root);
		
		
	}

	public void insert() {

	}

	public static void inOrderTraversalIterative(Node node) {

		if (node == null) {
			return;
		}
		ArrayList<Integer> list = new ArrayList<>();
		Stack<Node> stack = new Stack<>();
		while (true) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				if (stack.isEmpty()) {
					break;
				}
				Node current = stack.pop();
				list.add(current.data);
				node = current.right;
			}
		}
		list.stream().forEach(e -> System.out.println(e));
	}

	public static void inOrderTraversal(Node node) {
		if (node == null)
			return;
		inOrderTraversal(node.left);
		System.out.println(node.data);
		inOrderTraversal(node.right);
	}

	public static void preOrderTraversalItervative(Node node) {
		if (node == null)
			return;
		Stack<Node> stack = new Stack<>();
		stack.add(node);
		List<Integer> list = new ArrayList<>();
		while (!stack.isEmpty()) {
			Node current = stack.peek();
			list.add(stack.pop().data);
			if (current.right != null)
				stack.add(current.right);
			if (current.left != null)
				stack.add(current.left);
		}

		for (Integer a : list) {
			System.out.println(a);
		}
	}

	public static void preOrderTraversal(Node node) {
		if (node == null)
			return;
		System.out.println(node.data);
		inOrderTraversal(node.left);
		inOrderTraversal(node.right);
	}

	public static void postOrderTraversal(Node node) {
		if (node == null)
			return;
		inOrderTraversal(node.left);
		inOrderTraversal(node.right);
		System.out.println(node.data);
	}

	public static void postOrderTraversalIterativeUsing1Stack(Node node) {
		if (node == null)
			return;
		Stack<Node> stack = new Stack<>();
		stack.add(node);
		List<Integer> list = new ArrayList<>();
		while (!stack.isEmpty()) {
			Node current = stack.pop();
			list.add(current.data);
			if (current.left != null)
				stack.add(current.left);
			if (current.right != null)
				stack.add(current.right);
		}
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
	}

	public static void levelOrderTraversal(Node root) {
		if (root == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int currentLevelSize = queue.size();
			ArrayList<Integer> subList = new ArrayList<Integer>();
			for (int i = 0; i < currentLevelSize; i++) {
				if (queue.peek().left != null)
					queue.add(queue.peek().left);
				if (queue.peek().right != null)
					queue.add(queue.peek().right);
				subList.add(queue.poll().data);
			}
			list.add(subList);
		}
		list.stream().forEach(e -> System.out.println(e));

	}

	public static int sumOfLeftLeafs(Node root) {
		if (root == null)
			return 0;
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

	public static int recursiveMaximumDepthTree(Node node) {
		if (node == null)
			return 0;
		return 1 + Math.max(recursiveMaximumDepthTree(node.left), recursiveMaximumDepthTree(node.right));
	}
	
	public static void allTraversalsItr(Node node) {
		if(node==null) return;
		
		
	}
	public static boolean returnTreeBalancedOrNot(Node node) {
		if(checkBalancedTree(node)!=1) return true;
		return false;
	}
	public static int checkBalancedTree(Node node) {
		if(node==null) return 0;
		int lh = checkBalancedTree(node.left);
		if(lh==-1) return -1;
		int rh = checkBalancedTree(node.right);
		if(rh==-1) return -1;
		if(Math.abs(lh-rh)>1) return -1;
		return 1+Math.max(lh, rh);
	}
	
	public static int diameterOfBinaryTree(Node node, int arr[]) {
		if(node==null) return 0;
		int lh = diameterOfBinaryTree(node.left, arr);
		
		int rh = diameterOfBinaryTree(node.right, arr);
		
		arr[0]= Math.max(arr[0], lh+rh);
		
		return 1+ Math.max(lh, rh);
	}
	
	public static int maximumPathSum(Node node, int arr[]) {
		if(node==null) return 0;
		int leftSum= Math.max(0, maximumPathSum(node.left, arr));
		int rightSum=Math.max(0,maximumPathSum(node.right, arr));
		arr[0]=Math.max(arr[0], rightSum+leftSum+node.data);
		return node.data + Math.max(leftSum, rightSum);
	}
	
	public static void zigzagTraversal(Node node) {
		if(node==null) return;
		Queue<Node> queue = new LinkedList<>();
		ArrayList<List<Integer>> finalList = new ArrayList<>();
		boolean flag=true;
		queue.add(node);
		while(queue.size()!=0) {
	    List<Integer> rowList = new ArrayList<>();
	    int currSize=queue.size();
		for(int i=0; i<currSize;i++) {
			if(queue.peek().left!=null) {queue.add(queue.peek().left);}
			if(queue.peek().right!=null) {queue.add(queue.peek().right);}
			if(flag==true) {
				rowList.add(queue.remove().data);
			}
			else {
				rowList.add(0, queue.remove().data);

			}
			}
		finalList.add(rowList);
		flag=!flag;
		}
		
		finalList.stream().forEach(e-> System.out.println(e));
		}
		
	
	
}


