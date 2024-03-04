package array;
import java.util.Scanner;
public class TwoDiArray {
public static void main(String args[]) {
	
			Scanner input = new Scanner(System.in);
			System.out.println(" Please enter the Row array size");
			int a = input.nextInt();
			System.out.println(" Please enter the Colunm array size");
			int b = input.nextInt();
			int intArray[][] = new int[a][b];
			
						
		for(int i = 0; i< a; i++ ) {
			System.out.println("Enter array row "+(i+1)+" Value");
			for(int j = 0; j < b; j++ ) {
//				System.out.println(" Please enter the intiger array (" +(i+1)+","+(j+1)+  ") value");
				
				intArray[i][j] = input.nextInt();
			}
			System.out.println();
		}
		
		for(int i = 0; i< a; i++ ) {
			for(int j = 0; j < b; j++ ) {
//				System.out.println(" Please enter the intiger array (" +(i+1)+","+(j+1)+ ") value = " +intArray[i][j]);
				System.out.print(intArray[i][j] +" ");
			}
			System.out.println();
		}
		
		
		
	
}
}
