package com.velocity.tejal;

import java.util.Scanner;

public class Multiplication 
{
	public static void main(String[] args) 
	{
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter first value");
			int x=sc.nextInt();
			
			System.out.println("Enter second value");
			int y=sc.nextInt();
			
			int mul=x*y;
			System.out.println("Multiplication of x*y  ::  "+mul);
			
			sc.close();
	}
}
