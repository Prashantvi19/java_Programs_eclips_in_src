package recursion;

import java.util.Scanner;

public class printNumberNtoM {
		public static void printNumber(int n, int m){
		if(n==m) {
			System.out.print(n +" ");
			return;
		}
		
		System.out.print(n +" ");
		printNumber(n+1,m);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);
		System.out.println("Please start number and ending number ");
		 
		int n = var.nextInt();
		int m= var.nextInt();
		printNumber(n,m);
	}

}
