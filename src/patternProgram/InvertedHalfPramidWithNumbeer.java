package patternProgram;

import java.util.Scanner;

public class InvertedHalfPramidWithNumbeer {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);
		System.out.print("Enter Number of row ");
		int r = var.nextInt();
		System.out.print("Enter Number of colum");
		int c = var.nextInt();
		
		for(int i=r; i>=1; i--){
			for(int j=1; j<=i; j++) {				
					System.out.print(" "+j);
			}
			for(int j=1; j<=(r-i); j++) {				
				System.out.print(" ");
		}
			
			System.out.println();
			
		}

	}


}
