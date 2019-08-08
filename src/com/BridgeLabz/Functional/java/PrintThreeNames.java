package com.BridgeLabz.Functional.java;

import java.util.Scanner;

public class PrintThreeNames {
	public static void main(String args[])
	{
		String firstName,secondName,thirdName;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the First number");
		firstName=scanner.next();
		
		System.out.println("enter the Second number");
		secondName=scanner.next();
		
		System.out.println("enter the Third number");
		thirdName=scanner.next();
		
		System.out.println("hi "+thirdName+","+secondName+" and "+firstName);
		scanner.close();
	}
	

}
