package binarySearchTrees;

import static java.lang.System.*;

public class HistoTree
{
   private HistoNode root;

	public HistoTree( )
	{
		root = null;
	}

	public void addData(Comparable data)
	{
		root = add(data, root);
	}

	private HistoNode add(Comparable data, HistoNode tree)
	{
		if (tree == null)
			tree = new HistoNode(data,1, null,null);
		else {
			
			if (search(data) != null) {
				HistoNode x=search(data);
				x.setDataCount(x.getDataCount()+1);
			}
			
			
			else{
			Comparable info = tree.getData();
			int dirTest = data.compareTo(info);

			if (dirTest <= 0)
				tree.setLeft(add(data, tree.getLeft()));
			else if (dirTest > 0)
				tree.setRight(add(data, tree.getRight()));
			}
			
		}

		return tree;
	}

	public HistoNode search(Comparable data)
	{
		return search(data,root);
	}

	private HistoNode search(Comparable data, HistoNode tree)
	{
		if (tree == null)
			return null;
		if (tree.getData().equals(data))
			return tree;
		else if (tree.getLeft() == null && tree.getRight() == null) {
			return null;
		} else {
			if (data.compareTo(tree.getData()) > 0)
				return search(data, tree.getRight());
			else
				return search(data, tree.getLeft());
		}
	}

	public String toString()
	{
		return toString(root);
	}

	private String toString(HistoNode tree)
	{
		String x = "";
		if (tree != null) {
			x += tree.getData() + " - "+ tree.getDataCount()+"\t";
			x += toString(tree.getLeft());
			x += toString(tree.getRight());

		}
		return x;
	}
}