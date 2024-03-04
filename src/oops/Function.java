package oops;

import java.util.*;
public class Function {
	
	public static void sum(int d,  int e) {
//		return d + e;
		System.out.println(d + " + " + e + " = " +( d + e));
	}
	
	public static void main(String args[]) {
		Scanner var = new Scanner(System.in);
		System.out.println("Enter 1st Number ");
		int a = var.nextInt();
		System.out.println("Enter 2nd Number  ");
		int b = var.nextInt();
				
//		int c = sum(a,b);	
//		System.out.println(a + "+" + b + "=" + c);
		
		sum(a,b);	
	}

}
