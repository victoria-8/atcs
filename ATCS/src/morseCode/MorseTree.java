package morseCode;
import hashMap.ClassMap;
import hashMap.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import phones.PhoneEntry;
import binarySearchTrees.BinarySearchTree;
import binarySearchTrees.TreeNode;

public class MorseTree extends BinarySearchTree
{
	private MorseNode root;
	private String[] arr;
	public MorseTree()
	{
		//root = new MorseNode("start");
		root = null;
		String morse = "0-9O.8M Q G Z7T Y K C  N X D B6/1J W P A   R L E2- U F I3V S4H5";
		
		add(morse);
	}
	
	public void add(String s)
	{
		String[] arr = new String[s.length()];
		for (int i = 1; i < s.length(); i++)
		{
			arr[i-1] = s.substring(i-1,i);
		}
		root = (balance(arr));
		
//		System.out.println(arr[0]);
//		int index = 1;
//		while (index < 72)
//		{
//			add(arr[index], add(arr[index-1],root,index-1), index);
//			index++;
//		}
		
	}
	

	private MorseNode add(String val, MorseNode node, int index)
	{
		//System.out.println(val);

		if(node == null)
		{
			node = new MorseNode(val,index);
		}
	   else
	   {
		   MorseNode n = new MorseNode(val, index);
			int dirTest = node.compareTo(n);
			
			if(dirTest <= 0)
				node.setLeft(add(arr[index+1], node.getLeft(),index++));
			else if(dirTest > 0)
				node.setRight(add(arr[index+1], node.getRight(),index++));
	   }
	   
	   return node;
	}
	
	
	public MorseNode balance(String arr[])
	{
		return balance(arr, 0, arr.length-1);
	}
	
	private MorseNode balance(String[] arr, int start, int end)
	{
	  if (start > end)
	  {
		  return null;
	  }
	  
	  int middle = start + (end-start)/2;
     MorseNode newNode = new MorseNode(arr[middle],middle);
	  
    	  newNode.setLeft(balance(arr, start, middle-1));
	      newNode.setRight(balance(arr, middle + 1, end));
	  
	    return newNode;
    }
	
//	private MorseNode balance(MorseNode node, String[] arr, int start, int end)
//	{
//	  if (start > end)
//	  {
//		  return null;
//	  }
//	  int middle = start + (end-start)/2;
//	  MorseNode newNode = new MorseNode(arr[middle],middle);
//
//	  if (root == null)
//		  root = newNode;
//	  else
//	  {
//	      //System.out.println(arr[middle]);
//
//	     // System.out.println(newNode);
//	    
//	      node.setLeft(balance(node, arr, start, middle-1));
//		  node.setRight(balance(node, arr, middle + 1, end));
//	  }
//	  	System.out.println(newNode);
//	    return newNode;
//    }
	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	private int getNumLevels(MorseNode tree)
	{
		if(tree==null)
			return 0;
		else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight()))
			return 1+getNumLevels(tree.getLeft());
		else
			return 1+getNumLevels(tree.getRight());
	}
	public void display()
	{
		for (int i=0;i<getNumLevels();i++)
		{
			display(root,i);
			System.out.println();
		}
		
	}
	
	private void display(MorseNode tree, int level)
	{
		if (tree==null)
			return;
	else if(level==0)
			System.out.print(tree + " " );
		else
		{
			display(tree.getLeft(), level-1);
			display(tree.getRight(), level-1);

		}
	}

	

	
	public static void main(String[] args) throws IOException
	{
//		try(BufferedReader br = new BufferedReader(new FileReader("File/morse")))
//		{
//			MorseTree tree = new MorseTree();
//			String line;
//			while((line = br.readLine()) != null) 
//			{
//				String[] a = line.split("\t");
//				
//				MorseNode node = new MorseNode(a[1]);
//				node.setLetter(a[0]);
//			}
//			
//		}
		MorseTree tree = new MorseTree();
		tree.display();
	}

}
