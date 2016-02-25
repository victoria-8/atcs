package binarySearchTrees;
import static java.lang.System.*;
import java.util.LinkedList;

public class BinarySearchTree
{
	private TreeNode root;

	public BinarySearchTree()
	{
		root = null;
	}

	public void add(Comparable val)
	{
		root = add(val, root);
	}

	private TreeNode add(Comparable val, TreeNode tree)
	{
	   if(tree == null)
			tree = new TreeNode(val);
	   else
	   {
		   Comparable treeValue = tree.getValue();
			int dirTest = val.compareTo(treeValue);
			
			
			if(dirTest <= 0)
				tree.setLeft(add(val, tree.getLeft()));
			else if(dirTest > 0)
				tree.setRight(add(val, tree.getRight()));
	   }
	   
	   return tree;
	}

   public void inOrder()
	{
		inOrder(root);
		System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree)
	{
		if (tree != null){
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
		}
	}
	
	public void preOrder()
	{
		preOrder(root);
	}
	
	public void preOrder(TreeNode tree)
	{
		if (tree == null)
			return;
		System.out.print(tree.getValue() + " ");
		preOrder(tree.getLeft());
		preOrder(tree.getRight());
		
	}

	//add preOrder, postOrder, and revOrder
	public void postOrder()
	{
//		TreeNode node = root;
//		while (root.getLeft() != null)
//			node = root.getLeft();
//		System.out.println("o");
		
		postOrder(root);

	}
	public void postOrder(TreeNode tree)
	{
		if(root == null)
		{
			return;
		}
	
		preOrder(tree.getLeft());
		preOrder(tree.getRight());
		System.out.print(tree.getValue() + " ");
	}
	
	
	public void reverseOrder()
	{
		reverseOrder(root);
	}
	
	
	public void reverseOrder(TreeNode tree)
	{
		if (tree != null){
			reverseOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
			reverseOrder(tree.getLeft());
		}
	}
	



	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree)
	{
		if(tree==null)
			return 0;
		else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight()))
			return 1+getNumLevels(tree.getLeft());
		else
			return 1+getNumLevels(tree.getRight());
	}
	
	public int getNumLeaves()
	{
		return getNumLeaves(root);
	}
	
	public int getNumLeaves(TreeNode tree)
	{
		if (tree.getLeft() == null && tree.getRight() == null)
			return 1;
		
		return getNumLeaves(tree.getLeft()) + getNumLeaves(tree.getRight());
	}
	
	public int getWidth()
	{
		return getWidth(root);
	}
	
	private int getWidth(TreeNode tree)
	{
		
		if (tree == null)
			return 1 + getWidth(tree.getLeft()) + getWidth(tree.getRight());
		else if (getWidth(tree.getLeft()) > getWidth(tree.getRight()))
			return 1 + getWidth(tree.getLeft());
		else
			return 1 + getWidth(tree.getRight());
	
			
	}

	//search
	
	//maxNode
	
	//minNode
	
	//level order
	
	//display like a tree
	
	//remove


	public String toString()
	{
		return "";
	}

	private String toString(TreeNode tree)
	{
		return "";
	}
}