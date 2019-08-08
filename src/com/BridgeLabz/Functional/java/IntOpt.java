


/**
 * @purpose  Performing set of operations
 * @author Ichchhanand Kasture
 *@since 07/08/2019
 */
package com.BridgeLabz.Functional.java;

import java.util.Scanner;

public class IntOpt {
	public static void main(String args[])
	{
	int a,b,c;
	
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the value of a");
	a=scanner.nextInt();
	
	System.out.println("enter the value of b");
	b=scanner.nextInt();
	
	System.out.println("enter the value of c");
	c=scanner.nextInt();
	
	 System.out.println("performing following operation");
	 System.out.println("a+b*c = "+(a+b*c));
	 System.out.println("a*b+c = "+(a*b+c));
	 System.out.println("c+a/b = "+(c+a/b));
	 System.out.println("a%b+c = "+(a%b+c));
	 scanner.close();
	
	
	}
}
