package geeksforgeeks;

import java.util.LinkedList;
import java.util.Queue;

public class PrintLeftViewBinaryTree {

	public static void main(String[] args) 
	{
		
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.add(6);
		binaryTree.add(4);
		binaryTree.add(8);
		binaryTree.add(1);
		binaryTree.add(3);
		binaryTree.add(5);
	   	binaryTree.add(9);
		
	   	Queue<NodeLevel> queue = new LinkedList();
	   	queue.add(new NodeLevel(binaryTree.root, 0));
	   	NodeLevel current;
 	   	int currentLevel  = -1;
 	   	int nextLevel;
 	   	
	   	while(!queue.isEmpty()) {
	   		current = queue.remove();
	   		if(currentLevel < current.level) 
	   		{
	   			currentLevel = current.level;
	   			System.out.println(currentLevel + " " + current.value);
	   		}
	   		nextLevel = currentLevel + 1;
	   		if (current.node.left != null )
	   			queue.add(new NodeLevel(current.node.left, nextLevel));
	   		if (current.node.right != null )
	   			queue.add(new NodeLevel(current.node.right, nextLevel));
	   	}
	}


}
