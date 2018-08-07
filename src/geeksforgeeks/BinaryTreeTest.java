package geeksforgeeks;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {

	@Test
	void test() {
		BinaryTree binaryTree = new BinaryTree();
		 
		binaryTree.add(6);
		binaryTree.add(4);
		binaryTree.add(8);
		binaryTree.add(1);
		binaryTree.add(3);
		binaryTree.add(5);
	   	binaryTree.add(9);
		
	   	assertTrue(binaryTree.containsNode(9));
		binaryTree.delete(9);
		assertFalse(binaryTree.containsNode(9));
		binaryTree.traverseInOrder(binaryTree.root);
		System.out.println("");
		binaryTree.traverseLevelOrder();
	}
	
}
