package recursion;

import java.util.Scanner;

public class reverseString {
	
	static String reversStr(String str, int n, String newStr ) {
		if(n == 0) {
			newStr += str.charAt(n);
//			System.out.print(newStr);
			return newStr;
		}

//		newStr += str.charAt(n);
//		System.out.print(newStr);
		String reStr = reversStr(str,n-1,newStr);
//		return reversStr(str,n-1,newStr);
//		return reStr;
		return reversStr(str,n-1,newStr+str.charAt(n));		
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner var = new Scanner(System.in);
		System.out.println("Please enter String ");

		String str = var.nextLine();
//		int in = str.length()-1;
		
//		String strReturn = reversStr(str,in,"");

		System.out.println(reversStr(str,str.length()-1,""));
	}

}
