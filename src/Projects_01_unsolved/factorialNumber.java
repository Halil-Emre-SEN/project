package Projects_01_unsolved;

import java.util.Scanner;

public class factorialNumber {

	public static void main(String[] args) {

		
		/*
		 * Scanner class araciligiyla girilen herhangi bir sayinin faktoriyel degerini
		 * bulmak icin bir program yazin.
		 * 
		 * number:6 factorial:1*2*3*4*5*6=720 output ---> 720
		 * 
		 * 
		 */

		Scanner dp = new Scanner(System.in);

		String strNum = dp.nextLine();

		int number = Integer.parseInt(strNum);

		// code start here use int number
		// kodu burdan baslatin ve int number kullanin.
		int factorial=1;
		for (int i = 2; i <=number; i++) {
			factorial*=i;
		}
		
		System.out.println(factorial);
		
		
		dp.close();
	}
}
