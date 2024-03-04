package recursion;

import java.util.Scanner;

public class sumOfNnaturalNum {

		public static int sumNumber(int n, int sum){
		if(n == 1) {
			sum += 1;
			return sum;
		}

		sum +=n;		
		
		
		return sumNumber(n-1,sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner var = new Scanner(System.in);
		System.out.println("Please enter value of n ");
		 
		int n = var.nextInt();
		int sum = sumNumber(n, 0);
		System.out.println(sum);

	}

}
