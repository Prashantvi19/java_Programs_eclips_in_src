package patternProgram;

import java.util.Scanner;

public class BinaryTringle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);
		System.out.print("Enter Number of row ");
		int r = var.nextInt();
		System.out.print("Enter Number of colum");
		int c = var.nextInt(),n=1;
		
		for(int i=1; i<=r; i++){
			for(int j=1; j<=i; j++) {				
				if((i+j)%2==0){
					System.out.print(1);
					
				}
				else {
					System.out.print(0);
				}
					
			
		}
			System.out.println();

	}


}

}
