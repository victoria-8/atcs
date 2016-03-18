package morseCode;
import hashMap.ClassMap;
import hashMap.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import binarySearchTrees.BinarySearchTree;

public class MorseTree extends BinarySearchTree
{
	private MorseNode root;
	public MorseTree()
	{
		root = new MorseNode("start");
	}
	
	public void add(MorseNode node)
	{
		add(node, 0);
	}
	
	public void add(MorseNode node, int index)
	{
		if (index == node.getMorse().length()-1)
		{
			
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		try(BufferedReader br = new BufferedReader(new FileReader("File/morse")))
		{
			MorseTree tree = new MorseTree();
			String line;
			while((line = br.readLine()) != null) 
			{
				String[] a = line.split("\t");
				
				MorseNode node = new MorseNode(a[1]);
				node.setLetter(a[0]);
				tree.add(node);				   
			}
			
		}
	}

}
