package patternProgram;

import java.util.*;

public class HalfPramidWithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);
		System.out.print("Enter Number of row ");
		int r = var.nextInt();
		System.out.print("Enter Number of colum");
		int c = var.nextInt();
		
		for(int i=1; i<=r; i++){
			for(int j=1; j<=i; j++) {				
					System.out.print(j);
			}
			
			System.out.println();
			
		}

	}

}
