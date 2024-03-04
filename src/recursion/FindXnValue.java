package recursion;

import java.util.Scanner;

public class FindXnValue {

	public static int findStackHightOfXpowerN(int x, int n) {
		if (n == 1 || n == 0) {
			return x;
		}else if( x == 0) {
			return 1;
		}

	

		return x * findStackHightOfXpowerN(x, n-1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);
		System.out.println("Please Value of x and power ");

		int x = var.nextInt();
		int n = var.nextInt();
		
		int xn = findStackHightOfXpowerN(x, n);;

		System.out.println(xn);
	}

}
