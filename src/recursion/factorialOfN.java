package recursion;

import java.util.Scanner;

public class factorialOfN {
	
		public static int printfactorialOfN(int n, int fact){
		if(n == 1) {
			
			return fact * n;
		}
		fact *= n;
		
		return printfactorialOfN(n-1,fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);
		System.out.println("Please enter value of n");
		 
		int n = var.nextInt();
	
	int fact = printfactorialOfN(n,1);
	System.out.println(fact);
	}
	}

