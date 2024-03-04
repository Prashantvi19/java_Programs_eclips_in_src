package patternProgram;

import java.util.Scanner;

public class InvertHalfPramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of row ");
		int r = sc.nextInt();
		System.out.print("Enter Number of colum");
		int c = sc.nextInt();
		
		for(int i = r; i>=1; i--){
			for(int j=1; j<=i; j++) {				
				System.out.print("*");
		}
		System.out.println();
		
	}

}

}
