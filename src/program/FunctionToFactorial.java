package program;

import java.util.Scanner;

public class FunctionToFactorial {

	public static int findFactorial(int a) {
		int f = 1;
		for (int i = a; i >= 1; i--) {
			if(i > 1)
			System.out.print(i + " * ");
			else
				System.out.print(i + " = ");
			f *= i;
		}
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);

		System.out.println("Enter a number which you want to find factoral");
		int f = var.nextInt();

		int ans = findFactorial(f);
		
		System.out.println( ans);

	}

}
