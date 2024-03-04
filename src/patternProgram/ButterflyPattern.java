package patternProgram;

import java.util.*;

public class ButterflyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);
		
//		System.out.println("Enter no of Row");
//		int r = var.nextInt();
		System.out.println("Enter no of column");
		int c = var.nextInt();
		
	for(int i = 1; i<=c; i++) {
		for(int j=1; j<=2*c; j++) {
		 if(j<=(2*c-i)&&!(j<=i)){
			System.out.print(" ");
		}else {
			System.out.print("*");
		}		
			
		}
		System.out.println();
	}
//	invert
	for(int i = c; i>=1; i--) {
		for(int j=1; j<=2*c; j++) {
		 if(j<=(2*c-i)&&!(j<=i)){
			System.out.print(" ");
		}else {
			System.out.print("*");
		}		
			
		}
		System.out.println();
	}
	
	}}

