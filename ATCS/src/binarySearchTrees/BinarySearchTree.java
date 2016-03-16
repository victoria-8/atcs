package binarySearchTrees;
import static java.lang.System.*;

public class BinarySearchTree
{
	public TreeNode root;

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
		System.out.println("\n");
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

	public void postOrder()
	{
		postOrder(root);
	}
	
	public void postOrder(TreeNode tree)	
	{
		if (tree!= null)
		{
			postOrder(tree.getLeft());
			postOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
		}
	
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
		int i = getNumLevels();
		int maxWidth = 0;

		while (i>0)
		{
			if (getWidth(root, i) > maxWidth)
				maxWidth = getWidth(root, i);
			System.out.println(maxWidth);
			i--;
		}

		return maxWidth;
		
	}
	
	private int getWidth(TreeNode tree, int depth)
	{
		if (tree == null)
			return 0;
		if (depth == 1)
			return 1;
		else
			return getWidth(tree.getLeft(), depth - 1) + getWidth(tree.getRight(), depth - 1);
	
	}
	
	public int getHeight()
	{
		return getNumLevels() - 1;
	}
	
	public int getNumNodes()
	{
		return getNumNodes(root);
	}
	
	private int getNumNodes(TreeNode tree)
	{
		if (tree.getLeft() == null && tree.getRight() == null)
			return 1;
		
		return 1 + getNumNodes(tree.getLeft()) + getNumNodes(tree.getRight());
	
	}
	
	public TreeNode remove(Comparable val)
	{
		return remove(val, root);
	}
	
	private TreeNode remove(Comparable val, TreeNode tree)
	{
	
		if(tree!=null)
		{
			int dirTest = val.compareTo(tree.getValue());
			if (dirTest<0)
				tree.setLeft(remove(val, tree.getLeft()));
			else if (dirTest>0)
				tree.setRight(remove(val, tree.getRight()));
			else
			{
				if (tree.getRight()==null)
				{
					tree = tree.getLeft();
					
				}
				else
				{
					TreeNode successor = (TreeNode)(getSmallest(tree.getRight()));
					tree.setValue(successor.getValue());
					tree.setRight(remove(successor.getValue(), tree.getRight()));
				}
			}
		}
		return tree;
	}
	
	
//	private String toTree(TreeNode tree)
//	{
//	
////		if (tree.getLeft() != null && tree.getRight() != null)
////			return "" + tree.getValue() + "\t" + toTree(tree.getLeft()) + "\t"
////					+ toTree(tree.getRight());
//		if (tree.getLeft() != null && tree.getRight() != null)
//			return "" + tree.getValue() + "\n" + tree.getLeft().getValue() + "\t" 
//		+ tree.getRight().getValue() + "\t" + toTree(tree.getLeft()) + toTree(tree.getRight());
////					+ toTree(tree.getRight());;
//	else if (tree.getLeft() == null && tree.getRight() == null)
//			return "\n" + tree.getValue() + "\t";
//	
//		
//		return toTree(tree.getLeft()) + toTree(tree.getRight());
//	
//	}
	
	public boolean isFullTree()
	{
		return isFullTree(root);
	}
	private boolean isFullTree(TreeNode tree)
	{
		return (tree.getLeft() != null && tree.getRight() != null);
	}
	
	public boolean search(Comparable value)
	{
		return search(root, value);
	}
	//search
	private boolean search(TreeNode tree, Comparable value)
	{
		if (tree != null && tree.getValue() == value)
		{
			return true;
		}
		else if (tree==null)
			return false;
		return search(tree.getLeft(), value) || search(tree.getRight(), value);	
	}
	public Comparable getLargest()
	{
		return getLargest(root);
	}
	private Comparable getLargest(TreeNode tree)
	{
		if (tree.getRight() == null)
			return tree.getValue();
		else
			return getLargest(tree.getRight());
	}
	public TreeNode getSmallest()
	{
		return getSmallest(root);
	}
	private TreeNode getSmallest(TreeNode tree)
	{
		if (tree.getLeft() == null)
			return tree;
		else
			return getSmallest(tree.getLeft());
	}
	
	public void levelOrderTraversal()
	{
		for (int i=0;i<getNumLevels();i++)
		{
			levelOrderTraversal(root,i);
			System.out.println();
		}
		
	}
	
	private void levelOrderTraversal(TreeNode tree, int level)
	{
		if (tree==null)
			System.out.println();
		else if(level==0)
			System.out.print(tree.getValue() + " ");
		else
		{
			levelOrderTraversal(tree.getLeft(), level-1);
			levelOrderTraversal(tree.getRight(), level-1);

		}
	}
	
	public void setRoot(TreeNode root)
	{
		this.root = root;
	}
	public TreeNode getRoot()
	{
		return root;
	}

	

}