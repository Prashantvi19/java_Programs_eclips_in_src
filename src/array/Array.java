package array;

import java.util.Scanner;

public class Array {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println(" Please enter the intiger array size");
		int a = input.nextInt();
		int intArray[] = new int[a];
		System.out.println(" Please enter the string array size");
//		int b = input.nextInt();
		String[] srtArray = new String[ input.nextInt()];
		
	for(int i = 0; i< a; i++ ) {
		System.out.println(" Please enter the intiger array " +(i+1)+ " value");
		intArray[i] = input.nextInt();
	}
	
	
	for(int i = 0; i< a; i++ ) {
		System.out.println( intArray[i] +" \n");
		
	}
	for(int i = 0; i < srtArray.length; i++ ) {
System.out.println(" Please enter the string array " +(i+1)+ " value");
		srtArray[i] = input.next();
	}
	
	
	for(int i = 0; i< srtArray.length; i++ ) {
		System.out.print( srtArray[i] +" \n");
		
	}
	
	int preDifineArray[] = {1,2,23,21,12,2,331,1122,313,23};
	
	for(int i = 0; i< preDifineArray.length; i++ ) {
		System.out.println(preDifineArray[i] +" ");
		
	}
	
	}

}
