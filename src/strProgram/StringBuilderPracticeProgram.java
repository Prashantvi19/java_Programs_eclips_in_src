package strProgram;

import java.util.*;

public class StringBuilderPracticeProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
//		System.out.println("Enter Str value");
//		StringBuilder str = new StringBuilder(input.nextLine());
//		System.out.println(str);
//		System.out.println("Enter Index Value to find A char\n");
//		System.out.println(str.charAt(input.nextInt()));
//
//		System.out.println("Enter Index to Insert \n");
//		int a = input.nextInt();
//		System.out.println("Enter Index Value to find A char\n");
//		String b = input.next();
//		str.insert(a, b);
//		System.out.println(str);
//		
//		System.out.println("Enter Index satrt and end index to Delete  \n");
//		a = input.nextInt();
//		int c = input.nextInt();
//		str.delete(a, c);
////		System.out.println("Enter Index Value to find A char\n");
////		b = input.next();
//		System.out.println(str);
//		
//		System.out.println("Enter Value to append");
//		
////		b = input.nextLine();
//		
//		b = "Hello";
//		str.append(b);		
//		System.out.println(str);
//		
	
		
		System.out.println("Enter name Suffal name ");
		
		StringBuilder s = new StringBuilder(input.nextLine());
		int aa = s.length();	
		for(int i = 0; i<= aa/2; i++) {			
			
			char bb = s.charAt(i);
			int cc = aa - i -1;
			char dd = s.charAt(cc);
			
		     s.setCharAt(i, dd);
		     s.setCharAt(cc, bb);
		     
			
		}
		System.out.println(s);
		
//		 for(int i=0; i<s.length()/2; i++) {
//		       int front = i;
//		       int back = s.length() - i - 1;
//
//		       char frontChar = s.charAt(front);
//		       char backChar = s.charAt(back);
//
//		       s.setCharAt(front, backChar);
//		       s.setCharAt(back, frontChar);
//		     }
//
//		     System.out.println(s);
//

				
	}

}
