package program;

public class FactorialS {
	public static int fN(int n) { 
		if(n==0) {
			return 1;
		}
		
		n *=  fN(n-1);
		
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 6;
		
 System.out.println(fN(n));
	}

}
