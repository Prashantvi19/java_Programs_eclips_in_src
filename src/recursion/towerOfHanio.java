package recursion;

//import java.util.Scanner;


// abc acb bac ->> s to d
public class towerOfHanio {
	public static void tHania(String s,String h,String d,int n) {
		if(n==1) {
			System.out.println("Disk "+n+" Transfer "+s +" to "+d  );
			return;
		}
		
		
		tHania(s,d,h,n-1);
		
		System.out.println("Disk "+n+" Transfer "+s +" to "+d  );
		tHania(h,s,d,n-1);
		
	}
	
	public static void main(String[] args){
		int n = 3;
		tHania("A","B","C",n);
	}

	
}
