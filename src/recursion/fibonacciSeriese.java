package recursion;

import java.util.Scanner;

public class fibonacciSeriese {

	public static void printfibinacciSiriese(int n,int m, int fact){
		if(fact == 1) {
			
			System.out.println(m);
			return ;
		}
		System.out.println(n);
		
		printfibinacciSiriese(m,n+m,fact-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);
		System.out.println("Please enter value of n ");
		 
		int n = var.nextInt();
		
	
	  printfibinacciSiriese(0,1,n);
	
	}

}
