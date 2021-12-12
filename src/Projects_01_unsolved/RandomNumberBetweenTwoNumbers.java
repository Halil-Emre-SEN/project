package Projects_01_unsolved;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberBetweenTwoNumbers {


	/*
	 * İki tane pozitif integer sayısı verildiğinde
	 * 
	 * sayı 1 min degerinde
	 * 
	 * sayı 2 max degerinde
	 * 
	 * min ve max arasinda random sayi elde et(olustur)
	 * 
	 * output veri tipi int olmali
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String s1 = scanner.nextLine();

		String[] elements = s1.split(" ");

		int min = Integer.parseInt(elements[0]);
		int max = Integer.parseInt(elements[1]);

		Random r=new Random();							//rastgele sayı bulmak için Random classından 2 yöntemimiz var
		int rastgele= r.nextInt(max-min)+min;			//1.si r.nextInt(int)>>> bu methodla 0'dan başlayarak parantez içinde belirttiğimiz sayıya kadar olan sayılar arasından
		System.out.println(rastgele);					//rastgele bir sayı çağırıyor. 2 sayı arasından sayı çağırmak için ise <<<int rastgele= r.nextInt(max-min)+min;>>> kodunu kullanmamız gerekiyor.
														//örneğin: 20-30 arasında bir sayı bulabilmemiz için bakmamız gereken sayı 10 tanedir(30-20) yani (max-min), ilk önce 0 dan 10 a kadar olan sayılardan 
														//bir rastgele sayı bulacağız((r.nextInt(int) ile) ve bu sayının 20 ile 30 arasında olması için 20(yani "min") ekleyeceğiz.
        
				
		/*int randomInRange=min+(int)(Math.random()*((max-min)+1));		//2. yöntem Math.random() kullanarak rastgele sayı bulmak: bu method bize 0 ile 1 arasında rastgele bir double sayı verir.
        System.out.println(randomInRange);								//bu yöntemde de Math.random()'u "(max-min)+1" ile çarparak sayının alabileceği değerlerin genişliğini belirliyoruz 
		 */																//ve "min" sayıyı ekleyerek istediğimiz rastgele sayıyı elde etmiş oluyoruz.	
																
															//NOT: Biren fazla sayı üretmek istiyorsak başına for döngüsü oluştururuz.
		
		
		
scanner.close();
	}
}
