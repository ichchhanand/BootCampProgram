package com.BridgeLabz.Functional.java;

public class KDM {
	public static void main(String args[])
	{
		int star1=2;
		int star2=3;
		int space=4;
		int row=5;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<star1;j++)
			{
				System.out.print("*");
			}
			for(int k=0;k<space;k++)
			{
				System.out.print(" ");
			}
			
			for(int l=0;l<star2;l++)
			{
				System.out.print("*");
			}
			space=space-1;
			System.out.println();
		}
		for(int p=0;p<row-1;p++)
		{
			for(int q=0;q<star1;q++)
			{
				System.out.print("*");
			}
			for(int r=0;r<=p;r++)
			{
				System.out.print(" ");
			}
			for(int s=0;s<star2;s++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
