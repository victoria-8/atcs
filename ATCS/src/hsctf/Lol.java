package hsctf;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Lol {
//	Keith has discovered a mysterious piece of paper, 
	//containing a mysterious formula:
//		x^2 + (5/3)x^3 + (23/12)x^4 + (119/60)x^5 ... 
	//+ (2*[5000!-1]/[5000!])x^5000
//
//5.088459783680012518903325270
//		Keith was curious, and so decided to evaluate the expression for x=0.7893
//		What number was returned, to the nearest 20 decimal places?

	public static void main(String[] args)
	{
		BigDecimal summation = new BigDecimal(0);
		BigDecimal max = new BigDecimal(5000);
		BigDecimal x = new BigDecimal(0.7893);
		//double summation=0;
		int counter = 2;
		for (BigDecimal n = new BigDecimal(2); n.compareTo(max) < 0; n=n.add(new BigDecimal(1)))
		{
			BigDecimal toAdd = new BigDecimal(2).multiply( 
							(factorial(n).subtract(new BigDecimal(1))).divide
							(factorial(n),2)
						    .multiply(x.pow(counter)));
			summation = summation.add(toAdd);
			counter++;

		}
		System.out.println("summation = " + summation);

	}
	
	public static BigDecimal factorial(BigDecimal n)
	{
		BigDecimal num=n;
		//BigDecimal one = new BigDecimal(1);
		int num2 = n.intValue();
		
		for (BigDecimal i = new BigDecimal(num2-1); i.compareTo(new BigDecimal(0)) > 0; i=i.subtract(new BigDecimal(1)))
		{
			num=num.multiply(i);
		}
		//System.out.println(n + " factorial = " + num);
		return num;
	}
}
