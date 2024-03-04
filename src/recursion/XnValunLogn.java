package recursion;

import java.util.Scanner;

public class XnValunLogn {
	public static int findOfXpowerNValunLogn(int x, int n, int c) {
		if (n == 1) {
			return x;
		} else if (x == 0 || n == 0) {
			return 1;
		}
		if (n % 2 == 0) {
			System.out.println(c);
			c++;
			return findOfXpowerNValunLogn(x, n / 2, c) * findOfXpowerNValunLogn(x, n / 2, c);

		} else {

			System.out.println(c);
			c++;
			return findOfXpowerNValunLogn(x, n / 2, c) * findOfXpowerNValunLogn(x, n / 2, c) * x;

		}
	}

	
}
