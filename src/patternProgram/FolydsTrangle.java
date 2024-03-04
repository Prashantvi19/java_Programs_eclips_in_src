package patternProgram;

import java.util.*;
public class FolydsTrangle {

	public static void main(String[] argsargs) {
			// TODO Auto-generated method stub
			Scanner var = new Scanner(System.in);
			System.out.print("Enter Number of row ");
			int r = var.nextInt();
			System.out.print("Enter Number of colum");
			int c = var.nextInt(),n=1;
			
			for(int i=1; i<=r; i++){
				for(int j=1; j<=i; j++) {				
					System.out.print(" "+n);
					n++;
			}
				
				System.out.println();
				
			}
	
		}
	
	
	}
	

