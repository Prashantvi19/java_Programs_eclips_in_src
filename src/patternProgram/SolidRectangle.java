package patternProgram;

import java.util.*;

public class SolidRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of row ");
		int r = sc.nextInt();
		System.out.print("Enter Number of column");
		int c = sc.nextInt();
		 for(int i = 1; i <= r; i++) {
			 
			 for(int j = 1; j <= c; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }

	}

}
