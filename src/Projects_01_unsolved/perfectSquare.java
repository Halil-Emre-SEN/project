package Projects_01_unsolved;

import java.util.Scanner;

public class perfectSquare {

	/*
	 * Pozitif bir int num verildiginde, return edildigi zaman num tamkare ise true
	 * veren degilse false veren bir foksiyon yazin.
	 * 
	 *          Not: sqrt gibi fonksiyonlari kullanmayin.
	 * 
	 * Example 1: Input: 16 Output: true Note: bu sayi tamkare cunku 4*4 = 16
	 * 
	 * Example 2: Input: 25 Output: true Note: bu sayi tamkare cunku 5*5=25
	 * 
	 * 
	 * Example 3: Input: 14 Output: false
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("bir tam sayi giriniz : ");
		int input = scanner.nextInt();

		// code Start here don't change before this line
		// kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin
			boolean sonuc=false;
		for (int i = 0; i <input; i++) {
			if(i*i==input) {
				sonuc=true;
			}
		}
		System.out.println(sonuc);
		
		scanner.close();
}
}
