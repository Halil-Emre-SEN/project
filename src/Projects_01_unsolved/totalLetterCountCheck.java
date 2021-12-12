package Projects_01_unsolved;

import java.util.Scanner;

public class totalLetterCountCheck {
	/*
	 * Bir String verildiginde
	 * 
	 * Eger String harf sayisi tek ise true print et degilse false print et
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String word = scanner.nextLine();

		// code Start here don't change before this line
		// kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin
		
		System.out.println(word.length()%2==0? false : true);
		
		scanner.close();
}
}
