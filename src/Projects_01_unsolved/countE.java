package Projects_01_unsolved;

import java.util.Scanner;

public class countE {

	/*
	 * Kullanici tarafindan girilen inputda kac tane 'b' karakteri oldugunu belirle
	 * ve print et.
	 * 
	 * input: Test output b: 0 output 0 olmali
	 * 
	 * 
	 * input: bucket b:1 output 1 olmali
	 */

	// hint: .charAt, length(), for, index, counter,

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String text = input.nextLine();

		// code start here
		// kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin
		int sayac=0;
		
		
		for (int i = 0; i < text.length(); i++) {
			if(text.charAt(i)=='b')
				sayac++;
		}
		
		System.out.println(sayac);
		
		input.close();
	}
}
