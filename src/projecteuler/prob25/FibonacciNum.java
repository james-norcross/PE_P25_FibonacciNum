package projecteuler.prob25;

import java.math.BigInteger;

public class FibonacciNum {

	/**
	 * Author: James Norcross
	 * Date: 12/1/14
	 * Purpose: Project Euler Problem 25
	 * Description: Calculates the terms in the Fibonacci sequence and returns the first term with 1000 digits
	 */
	public static void main(String[] args) {

		BigInteger f, f1, f2;
		int termNum = 3;
		
		f1 = BigInteger.ONE;
		f2 = BigInteger.ONE;
		
		f = f1.add(f2);
		
		while (f.toString().length() < 1000) {
			f2 = f1;
			f1 = f;
			f = f1.add(f2);
			termNum++;
			
			//System.out.println(f + " " + termNum);
		}
		
		System.out.println(f + " " + termNum);
		
	}

}
