package Projects_01_unsolved;

import java.util.Scanner;

public class twoString {

	public static void main(String[] args) {
		/*
		 * Scanner class kullanilarak verilen iki tane Stringi birbirlerine ekle .
		 * 
		 * Eger ilk kelimenin son harfi ikinci kelimenin ilk harfi ile ayni ise ayni
		 * olan harflerin birisini kalirin
		 * 
		 * Ornek: "abc", "cat" --> "abcat" "abc", "dog" -->"abcdog"
		 * 
		 * 
		 */
		Scanner dp = new Scanner(System.in);

		String allElements = dp.nextLine();

		String[] elements = allElements.split(" ");

		String s1 = elements[0];

		String s2 = elements[1];

		// code start here use s1 and s2 as words
		// kodu burdan baslatin ve s1 ve s2 kelime olarak kullanin
		if(s1.substring(s1.length()-1).equals(s2.substring(0,1))) {
			System.out.println(s1+s2.substring(1));
		}
		else {System.out.println(s1+s2);}

		
		dp.close();
}
}
