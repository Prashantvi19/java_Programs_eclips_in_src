package patternProgram;

import java.util.Scanner;

public class SolidRhombus {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);
		
//		System.out.println("Enter no of Row");
//		int r = var.nextInt();
		System.out.println("Enter no of column");
		int c = var.nextInt();
		
	for(int i = c; i>=1; i--) {
		for(int j=1; j<=2*c; j++) {
			if(j<i) {
			System.out.print("1");	
			}else if(!(j<=i)&&(j<=c+i)) {
			System.out.print("*");
			}
		}
		System.out.println();
	}

	}}
