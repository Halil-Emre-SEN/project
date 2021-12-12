package Projects_01_unsolved;

import java.util.Scanner;

public class checkNumberEven {

	/*
	 * Veri tipi int olan number verildiginde, number cift mi tek mi kontrol et
	 * 
	 * E�er number cift ise print true
	 * 
	 * Eger number tek ise print false
	 * 
	 * result true ya da false olmali.
	 * 
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();

		// code Start here don't change before this line
		// Kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin
		System.out.println(number%2==0);
		
		scanner.close();
	}

}
