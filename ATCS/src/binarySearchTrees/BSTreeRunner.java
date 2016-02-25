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
 		System.out.println("width = " + tree.getWidth());



 		
 		
 		
 		
 		
 		
 		
 
   }
}