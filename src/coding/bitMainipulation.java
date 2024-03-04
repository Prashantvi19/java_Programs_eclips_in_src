package coding;

import java.util.*;

public class bitMainipulation {
	public static void getBit(int pop, int bit) {

		int bitMark = 1 << pop;

		if ((bitMark & bit) == 0) {
			System.out.println("It is that bit : 1");
		} else {
			System.out.println("It is that bit : 0");
		}

	}

	public static void setBit(int n, int bit) {
		int bitMark = 1 << n;

		int bitSet = bit | bitMark;
		System.out.println("There is set bit : " + bitSet);
	}

	public static void clearBit(int n, int bit) {
		int bitMark = 1 << n;

		int bitClear = ~(bitMark) & bit;

		System.out.println("There is set bit : " + bitClear);
	}

	public static void updateBit(int n, int bit) {
		int bitMark = 1 << n;

		if ((bitMark & bit) == 0) {

			int bitSet = bit | bitMark;
			System.out.println("There is set bit : " + bitSet);
		} else {
			int bitClear = ~(bitMark) & bit;

			System.out.println("There is set bit : " + bitClear);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please Select operation a)Get Bit b)Set Bit c)Clear Bit And d) Update Bit");
		String op = input.next();

		System.out.println("Please Enter bit Posision");
		int n = input.nextInt();

		System.out.println("Please Enter bit");
		int bit = input.nextInt();

		switch (op) {
		case "a": {
			getBit(n, bit);
			break;
		}
		case "b": {
			setBit(n, bit);
			break;
		}
		case "c": {
			clearBit(n, bit);
			break;
		}
		case "d": {
			updateBit(n, bit);
			break;
		}
		default:
			System.out.println("Please choose 'a','b','c' and 'd' ");

		}

	}

}
