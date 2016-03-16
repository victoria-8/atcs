package binarySearchTrees;

public class BalancedTree extends BinarySearchTree{
	public BalancedTree(int[] data){
		setRoot((balance(data)));
	}
	public TreeNode balance(int arr[])
	{
		return balance(arr, 0, arr.length-1, null);
	}
	private TreeNode balance(int[] arr, int start, int end, TreeNode node)
	{
	  if (root == null)
	  {
		  root = new TreeNode(arr[(start + end) / 2]);
	  }
	  
	  int middle = (start + end)/2;
      TreeNode newNode = new TreeNode(arr[middle]);
	  
    	  node.setLeft(balance(arr, start, middle, newNode));
	      node.setRight(balance(arr, middle, end, newNode));
	  
	    return newNode;
    }
	
	
	public static void main(String[] args)
	{
		int[] data = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		BalancedTree x = new BalancedTree(data);
		System.out.println("InOrder");
		x.inOrder();
		TreeNode temp = x.getRoot();
		System.out.println("Right Branch");
		while(temp!=null)
		{
			System.out.print(temp+" ");
			temp=temp.getRight();
		}
		
	}
}
	   
	    



	

