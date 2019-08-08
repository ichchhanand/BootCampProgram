
/**
 * @purpose Addition of two numbers
 * @author ichchhanad kasture
 * @version 1.0
 * @since  07/08/2019
 */

package com.BridgeLabz.Functional.java;

import java.util.Scanner;

import com.Utility.java.Utility;

public class SumOfTwoNumbers {
	public static void main(String args[])
	{
	Utility utility=new Utility();
	int firstNumber, secondNumber,result;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the first number");
	firstNumber=scanner.nextInt();
	
	System.out.println("Enter the second number");
	secondNumber=scanner.nextInt();
	
	result=utility.additionOfTwoNumbers(firstNumber, secondNumber);
	System.out.println("Addition of Two Numbers="+result);
	scanner.close();
	}

}
