package Projects_01_unsolved;

import java.util.Scanner;

public class getTotal {

	/*
	 * 3 tane pozitif String verildiginde sayisal olmayan tum karakterleri kaldirin.
	 * Stringleri int e cevirin ve total print edin
	 * 
	 * Ornek: String num1 = "$15"; String num2 = "$20"; String num3 = "$30"; output
	 * ----> 65; olmali
	 * 
	 * NOT : Eger output 0 dan kucuk ise outputu -1 e cevir
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String allElements = scanner.nextLine();

		String[] elements = allElements.split(" ");

		String num1 = elements[0];

		String num2 = elements[1];

		String num3 = elements[2];

		// code Start here don't change before this line
		// use String num1 , num2 , num3

		// kodu burdan baslain ve bu satirdan onceki kodlari degistirmeyin
		// String num1,num2,num3 kullanin

		int sayi1=Integer.parseInt(num1.replaceAll("\\D",""));
		int sayi2=Integer.parseInt(num2.replaceAll("\\D",""));
		int sayi3=Integer.parseInt(num3.replaceAll("\\D",""));		
		int toplam=sayi1+sayi2+sayi3;
		System.out.println(toplam<0? -1 : toplam);
		
scanner.close();
}
}
