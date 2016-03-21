package morseCode;
import hashMap.ClassMap;
import hashMap.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import binarySearchTrees.BinarySearchTree;
import binarySearchTrees.TreeNode;

public class MorseTree extends BinarySearchTree
{
	private MorseNode root;
	public MorseTree()
	{
		//root = new MorseNode("start");
		String morse = "0-9O.8M Q G Z7T Y K C  N X D B6/1J W P A   R L E2- U F I3V S4H5";
		add(morse);
	}
	
	public void add(String s)
	{
		String[] arr = new String[72];
		for (int i = 1; i < s.length(); i++)
		{
			arr[i-1] = s.substring(i-1,i);
		}
		
		add(arr);
		balance(arr);
	}
	

	private MorseNode add(Comparable val, MorseNode node)
	{
	   if(node == null)
			node = new MorseNode(val);
	   else
	   {
		   Comparable treeValue = node.getValue();
			int dirTest = val.compareTo(treeValue);
			
			if(dirTest <= 0)
				node.setLeft(add(val, node.getLeft()));
			else if(dirTest > 0)
				node.setRight(add(val, node.getRight()));
	   }
	   
	   return tree;
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
      MorseNode newNode = new MorseNode(arr[middle]);
      
    
      newNode.setLeft(balance(arr, start, middle-1));
	  newNode.setRight(balance(arr, middle + 1, end));
	  
	    return newNode;
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
		tree.levelOrderTraversal();
	}

}
