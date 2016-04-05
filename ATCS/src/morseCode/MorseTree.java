package morseCode;

public class MorseTree
{
	private MorseNode root;
	private String[] arr;
	public MorseTree()
	{
		root = null;
		String morse = "0-9O8. M Q G7Z T Y K C N X D B6/1J W P A   R L E2- U F I3V S4H5";
		add(morse);
	}
	
	public void add(String s)
	{
		String[] arr = new String[s.length()];
		for (int i = 1; i <= s.length(); i++)
		{
			arr[i-1] = s.substring(i-1,i);
		}
		root = (balance(arr));
		
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
			System.out.println("");
	else if(level==0)
			System.out.print(tree + " ");
		else
		{
			display(tree.getLeft(), level-1);
			display(tree.getRight(), level-1);

		}
	}
	public String reverseTranslate(String m)
	{
		String trans = "";
		String morse = "0-9O8. M Q G7Z T Y K C N X D B6/1J W P A   R L E2- U F I3V S4H5";
		int searchIndex;
		for (int i = 1; i <= m.length(); i++)
		{
			for (int j = 1; j <= morse.length(); j++)
			{
				if (morse.substring(j-1,j).equals(m.substring(i-1,i)))
				{
					searchIndex = j-1;
					String s = reverseTranslate(root,searchIndex,"");
					trans = trans + " " + s;
					break;
				}
				else if (m.substring(i-1,i).equals(" "))
				{
					trans = trans + "/";
					break;
				}
				
			}
		}
		return trans;
	}
	private String reverseTranslate(MorseNode node, int index, String trans)
	{
		if (node == null)
			return trans;
		if (node.getIndex() == index)
			return trans;
		else if (node.getIndex() > index)
			return reverseTranslate(node.getLeft(),index,trans+"_");
		else if (node.getIndex() < index)
			return reverseTranslate(node.getRight(),index,trans+".");
		return null;
			
		
	}
	public String translate(String morse)
	{
		MorseNode currentNode;
		String message = "";
		int lastIndex = 0;
		for(int i = 1; i < morse.length(); i++)
		{
			//System.out.println("msg = " + message);

			
			if (morse.substring(i-1, i).equals(" ") || i == morse.length()-1 || morse.substring(i-1, i).equals("/"))
			{
				currentNode = translate(morse.substring(lastIndex, i),1, root);
				if (currentNode != null)
					message += currentNode.getValue();
				lastIndex = i;
			}
			
		}
		return message.replaceAll("/"," ");
	}
	
	private MorseNode translate(String morse, int index, MorseNode node)
	{
		if (index >= morse.length())
			return node;
		else if (morse.substring(index-1, index).equals("_"))
			return translate(morse,index+1,node.getLeft());
		else if (morse.substring(index-1, index).equals("."))
			return translate(morse,index+1,node.getRight());
		return null;
			
	}
	
	

	
	public static void main(String[] args)
	{
		MorseTree tree = new MorseTree();
		tree.display();
		String s = tree.translate("__ _.__/ .._. . . _/ ... __ . ._.. ._../ ._ _. _../ __ _.__/ _. ___ ... ./ ._. .._ _. ...  ");
		System.out.println(s);
		System.out.println(tree.reverseTranslate(s));
		
		
	}

}