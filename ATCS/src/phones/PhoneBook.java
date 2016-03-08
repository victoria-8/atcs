package phones;
import static java.lang.System.*;

public class PhoneBook
{
	private PhoneEntry root;

	public PhoneBook()
	{
		root = null;
	}

	public void add(String name, String num)
	{
		root = add(name, num, root);
	}
//	public void add(Comparable name, Comparable num)
//	{
//		root = add(name, num, root);
//	}

	private PhoneEntry add(Comparable name, Comparable num, PhoneEntry tree)
	{
	   if(tree == null)
			tree = new PhoneEntry(name, num);
	   else
	   {
		   Comparable treeValue = tree.getValue();
			int dirTest = name.compareTo(treeValue);
			
			if(dirTest <= 0)
				tree.setLeft(add(name, num, tree.getLeft()));
			else if(dirTest > 0)
				tree.setRight(add(name, num, tree.getRight()));
	   }
	   
	   return tree;
	}

   public void inOrder()
	{
		inOrder(root);
		System.out.println("\n");
	}

	private void inOrder(PhoneEntry tree)
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
	
	public void preOrder(PhoneEntry tree)
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
	
	public void postOrder(PhoneEntry tree)	
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
	
	public void reverseOrder(PhoneEntry tree)
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

	private int getNumLevels(PhoneEntry tree)
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
	
	public int getNumLeaves(PhoneEntry tree)
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
	
	private int getWidth(PhoneEntry tree, int depth)
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
	
	private int getNumNodes(PhoneEntry tree)
	{
		if (tree.getLeft() == null && tree.getRight() == null)
			return 1;
		
		return 1 + getNumNodes(tree.getLeft()) + getNumNodes(tree.getRight());
	
	}
	
//	public PhoneEntry remove(Comparable val)
//	{
//		return remove(val, root);
//	}
	
//	private PhoneEntry remove(Comparable val, PhoneEntry tree)
//	{
//	
//		if(tree!=null)
//		{
//			int dirTest = val.compareTo(tree.getValue());
//			if (dirTest<0)
//				tree.setLeft(remove(val, tree.getLeft()));
//			else if (dirTest>0)
//				tree.setRight(remove(val, tree.getRight()));
//			else
//			{
//				if (tree.getRight()==null)
//				{
//					tree = tree.getLeft();
//					
//				}
//				else
//				{
//					PhoneEntry successor = (PhoneEntry)(getSmallest(tree.getRight()));
//					tree.setValue(successor.getValue());
//					tree.setRight(remove(successor.getValue(), tree.getRight()));
//				}
//			}
//		}
//		return tree;
//	}
	
	
//	private String toTree(PhoneEntry tree)
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
	private boolean isFullTree(PhoneEntry tree)
	{
		return (tree.getLeft() != null && tree.getRight() != null);
	}
	
	public boolean search(Comparable value)
	{
		return search(root, value);
	}
	//search
	private boolean search(PhoneEntry tree, Comparable value)
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
	private Comparable getLargest(PhoneEntry tree)
	{
		if (tree.getRight() == null)
			return tree.getValue();
		else
			return getLargest(tree.getRight());
	}
	public PhoneEntry getSmallest()
	{
		return getSmallest(root);
	}
	private PhoneEntry getSmallest(PhoneEntry tree)
	{
		if (tree.getLeft() == null)
			return tree;
		else
			return getSmallest(tree.getLeft());
	}
	
	public void display()
	{
		for (int i=0;i<getNumLevels();i++)
		{
			display(root,i);
			System.out.println();
		}
		
	}
	
	private void display(PhoneEntry tree, int level)
	{
		if (tree==null)
			System.out.println();
		else if(level==0)
			System.out.print(tree + " " );
		else
		{
			display(tree.getLeft(), level-1);
			display(tree.getRight(), level-1);

		}
	}
	
	

	

}