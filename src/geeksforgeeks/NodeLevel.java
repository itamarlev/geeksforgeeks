package geeksforgeeks;

public class NodeLevel extends Node{
	Node node;
	int level;
	
	public NodeLevel(Node node, int level)
	{
		super(node.value);
		this.node = node;
		this.level = level;
	}
}
