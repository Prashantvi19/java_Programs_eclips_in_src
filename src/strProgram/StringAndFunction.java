
package strProgram;

import java.util.Scanner;

public class StringAndFunction {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		System.out.println(" Please enter the Your String");
		String name = input.nextLine();
		System.out.println(" Please enter the Your 2nd String");
		String nameLast = input.nextLine();
		System.out.println(name );
		System.out.println(nameLast );
		System.out.println("-------> Some Operations");
		
		System.out.println(" 1 - Concatenation of strings");
		
		String concatenation = name + " " + nameLast;
		
		System.out.println(concatenation);
		System.out.println("2 - Sinding length");
		System.out.println(name+" = "+ name.length()+ " and " +nameLast + " = "  + nameLast.length());
		System.out.println(concatenation + " = " + concatenation.length());
		
		System.out.println("3 Use compareTo Function");
		System.out.println(name + "vs" + nameLast);
		System.out.println(name.compareTo(nameLast));
		
		System.out.println("4 Use == for comparing to nomPremative tring Declaration");
		System.out.println(concatenation +"vs non-premative Prashant Vishwakarma");
		if(concatenation == new String("Prshant Vishwakarma"))
		System.out.println("True");
		else
			System.out.println("False");
		System.out.println("5 substrin finde please enter starting index and (last instring + 1) of -----------> \n " +concatenation);
		System.out.println("\n---> \n " + concatenation.substring(input.nextInt(), input.nextInt()));
		

	}

}
