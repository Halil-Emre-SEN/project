package Projects_01_unsolved;

import java.util.Scanner;

public class age {

	

	/*
	 * Eger age 10 dan kucuk veya esit ise facebook hesabi acmak icin cok gencsin
	 * print yapin.
	 * 
	 * Eger age 16 dan kucuk veya esit ise ehliyet almak icin cok gencsin print
	 * yapin.
	 * 
	 * Eger age 18 den kucuk veya esit ise dovme yaptirmak icin cok gencsin print
	 * yapin.
	 * 
	 * Eger age 21 den kucuk veya esit ise alkol icmek icin cok gencsin print yapin.
	 * 
	 * Eger age 21 den buyuk ise istedigini yapabilirsin print yapin.
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int myAge = scanner.nextInt();

		// kodu burdan baslatin ve bu satirdan onceki kodlari degistirmeyin
		if(myAge<=10) {
				System.out.println("facebook hesabi acmak icin cok gencsin");
		}else if(myAge<=16) {
				System.out.println("ehliyet almak icin cok gencsin");
		}else if(myAge<=18) {
				System.out.println("dovme yaptirmak icin cok gencsin");
		}else if(myAge<=21) {
				System.out.println("alkol icmek icin cok gencsin");
		}else {
				System.out.println("istedigini yapabilirsin");
		}
scanner.close();
	}
}
