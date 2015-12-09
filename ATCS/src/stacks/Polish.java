package stacks;

import java.util.Stack;

public class Polish {
	
	private Stack<String> operators = new Stack<String>();
	private Stack<String> numbers = new Stack<String>();
	private String equation;
	
	public Polish(String equation)
	{
		this.equation = equation + " ";
	}
	
	public void preSolve()
	{
		String op = "^*/+-";
		String par = "()";
		int lastSpace = 0;
	
		for(int x = 0; x < equation.length(); x++)
		{			
			if(equation.charAt(x) == ' ' || equation.charAt(x) == ('('))
			{		
				if(equation.charAt(x) == '(')
				{
					while(equation.charAt(lastSpace) != ')')
						lastSpace++;
					
					String temp = equation.substring(x+1, lastSpace);
					Polish neweq = new Polish(temp);
					neweq.preSolve();
					numbers.push(""+neweq.solve());
					lastSpace++;
					x = lastSpace;
				}
		
				if(op.contains(equation.substring(lastSpace, x)))
					{
					String ops = equation.substring(lastSpace, x);
					boolean wasEmpty = false;
					
					if(operators.isEmpty())
					{
						operators.push(ops);
						wasEmpty = true;
						lastSpace = x+1;

					}
					
					String prevOp = operators.peek();
					
					if(!wasEmpty)
					{
						
						while(!hasPrecedence(ops) && numbers.size() >=2)
						{
							int num1 = Integer.parseInt(numbers.pop());
							int num2 = Integer.parseInt(numbers.pop());
							operators.pop();
							if (prevOp.equals("+"))
								numbers.push(""+ (num1+num2));
							else if(prevOp.equals("-"))
								numbers.push("" + (num2 - num1));
							else if(prevOp.equals("*"))
								numbers.push(""+ (num1 * num2));
							else if(prevOp.equals("/"))
								numbers.push("" + (num2 / num1));
							else if(prevOp.equals("^"))
								numbers.push("" + (int)(Math.pow(num2, num1)));
						}
						operators.push(ops);
						lastSpace = x+1;
					}
				
				}
					
				else
				{
					numbers.push(equation.substring(lastSpace, x));
					lastSpace = x+1;
				}
			}
			
		}
	}
	
	public boolean hasPrecedence(String ops)
	{
		if (ops.equals("^"))
		{
			
			return true;
		}
		else if (ops.equals("*") || ops.equals("/"))
		{
			if (!operators.isEmpty() && operators.peek().equals("^"))
			{
				return false;				
			}
			else
			{
				return true;
			}
				
		}
		else
		{
			if (!operators.isEmpty() && (operators.peek().equals("^") || operators.peek().equals("*") || operators.peek().equals("/")))
				return false;
			else
			{
				return true;
			}

		}
	}
	
	public int solve()
	{
//		Stack<String> numbers2 = new Stack<String>();
//		while (!numbers.isEmpty())
//		{
//			numbers2.push(numbers.pop());
//		}
//		Stack<String> ops2 = new Stack<String>();
//		while (!operators.isEmpty())
//		{
//			ops2.push(operators.pop());
//		}
		
		int x = Integer.parseInt(numbers.pop());

		while (!operators.isEmpty() && !numbers.isEmpty())
		{
			String ops = operators.pop();
			if (ops.equals("+"))
				x += Integer.parseInt(numbers.pop());
			else if(ops.equals("-"))
				x = Integer.parseInt(numbers.pop()) - x;
			else if(ops.equals("*"))
				x *= Integer.parseInt(numbers.pop());			
			else if(ops.equals("/"))
				x = Integer.parseInt(numbers.pop()) / x;
			else if(ops.equals("^"))
				x = (int)Math.pow(Integer.parseInt(numbers.pop()), x);
		}
		return x;
	}
}
