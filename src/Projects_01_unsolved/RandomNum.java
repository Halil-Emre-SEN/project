package Projects_01_unsolved;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {

	/*
	 * 
	 * Veri tipi integer olan max sayisi verildiginde
	 * 
	 * 0 ile max sayisi arasindan random bir sayi elde et(olustur)
	 * 
	 * output tipi int olmali
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("bir sasyi giriniz : ");
		int max = scanner.nextInt();

		for (int i = 0; i < 1; i++) { // 1 tane uretecek (ne kadar uretmesini istiyorsak)

			Random rnd = new Random();

			System.out.print(rnd.nextInt(max) + "\t"); // 0 ile max arasinda rastgele sayi uretecek
		}
	scanner.close();
	}
}