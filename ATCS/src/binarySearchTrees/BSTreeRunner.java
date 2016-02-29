package binarySearchTrees;

import static java.lang.System.*;

public class BSTreeRunner
{
   public static void main( String args[] )
   {
 		BinarySearchTree tree = new BinarySearchTree();
 		tree.add(90);
 		tree.add(100);
 		tree.add(80);
 		tree.add(70);
 		tree.add(120);
 		tree.add(85);
 		tree.add(98);
 		tree.inOrder();
 		tree.preOrder(); 	
 		System.out.println();
 		//tree.postOrder();
 		System.out.println();
 		tree.reverseOrder();
 		System.out.println();
 		System.out.println("numLeaves = " + tree.getNumLeaves());
 		System.out.println("numLevels = " + tree.getNumLevels());
 		//System.out.println("width = " + tree.getWidth());
 		System.out.println("height = " + tree.getHeight());
 		System.out.println("num nodes = " + tree.getNumNodes());
 		System.out.println("tree = ");
 		System.out.println("full = " + tree.isFullTree());
 		System.out.println("search(90)= " + tree.search(90));
 		//System.out.println("search(100)= " + tree.search(100));
 		System.out.println("getLargest= " + tree.getLargest());
 		System.out.println("getSmallest= " + tree.getSmallest());










 		
 		
 		
 		
 		
 		
 		
 
   }
}