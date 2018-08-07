package geeksforgeeks;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}

	public void add(int value) {
		root = addRecursive(root, value);
	}

	public boolean containsNode(int value) {
		return containsNodeRecursive(root, value);
	}

	public void delete(int value) {
		deleteRecursive(root, value);
	}

	public void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.println(" " + node.value);
			traverseInOrder(node.right);
		}
	}

	public void traverseLevelOrder() {
		if (root == null) {
			return;
		}

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		Node current;
		while (!queue.isEmpty()) {
			current=queue.remove();
			System.out.println(" " + current.value);
			if(current.left != null) queue.add(current.left);
			if(current.right != null) queue.add(current.right);
		}
	}

	private Node addRecursive(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.value) {
			current.left = addRecursive(current.left, value);
		} else if (value > current.value) {
			current.right = addRecursive(current.right, value);
		}
		return current;
	}

	private boolean containsNodeRecursive(Node current, int value) {
		if (current == null) {
			return false;
		}
		if (value == current.value) {
			return true;
		}
		return value < current.value ? containsNodeRecursive(current.left, value)
				: containsNodeRecursive(current.right, value);
	}

	private Node deleteRecursive(Node current, int value) {

		if (current == null)
			return null;

		if (current.value == value) {
			if (current.left == null && current.right == null)
				return null;
			if (current.right == null)
				return current.left;
			if (current.left == null)
				return current.right;
			current.value = findSmallestValue(current.right);
			current.right = deleteRecursive(current.right, current.value);
			return current;
		}

		if (value < current.value) {
			current.left = deleteRecursive(current.left, value);
			return current;
		}
		current.right = deleteRecursive(current.right, value);
		return current;
	}

	private int findSmallestValue(Node root) {
		return root.left == null ? root.value : findSmallestValue(root.left);
	}

}
