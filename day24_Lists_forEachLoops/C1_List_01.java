package day24_Lists_forEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C1_List_01 {

	public static void main(String[] args) {
		
		/*
		1)Kullanicidan isimler isteyin ve bunlari bir list�te depolayin. Kullanici yeter yazana kadar isim istemeye devam edin.
    	Kullanici isim girmeyi bitirdiginde toplam kac isim girdigini ve bunlardan kac tanesinin asagidaki listede olan isimlerden oldugunu yazdirin
    	isimList=Ali , Veli, Ayse, Fatma, Zeki, Kemal
    	Not : yeter icin kucuk buyuk harf onemli degil, ancak isimler icin �nemli.
    	*/
		
		Scanner scan = new Scanner(System.in);
		List <String> girilenIsimler = new ArrayList<>();
		String isim = "";
		
		do {
			System.out.println("L�tfen listeye eklemek icin isim giriniz. \nBitirmek icin 'yeter' yaziniz.");
			isim = scan.nextLine();
			
			if (!isim.equalsIgnoreCase("yeter")) { // yeter degilse ismi listeye ekledim.
				girilenIsimler .add(isim);
			}
	
		} while (!isim.equalsIgnoreCase("yeter")); // Kullanici yeter yazmadigi s�rece tekrar ettim.
			
		// Karsilastirmak istedigimiz listeyi olusturalim.
		// Listenin uzunlugu degismeyeci icin Array olusturup, list'e cevirebilirim. B�ylece 6 ismi tek tek eklemek zorunda kalmam.
		
		String isimler[] = {"Ali", "Veli", "Ayse", "Fatma", "Zeki", "Kemal"};
		List <String> isimList = Arrays.asList(isimler);
		
		// Elimizde 2 tane liste var. 1- Kullanicidan aldigimiz isimlerin oldugu  girilenIsimler | 2- Karsilastiracagimiz liste  isimList
		
		System.out.println("Toplam : " + girilenIsimler.size() + " isim girdiniz.");
		int count = 0;
		
		for (int i=0 ; i<girilenIsimler.size() ; i++) { // loop ile girilen isimleri tek tek cagirdim.
			isimList.contains(girilenIsimler.get(i));
			
		if (isimList.contains(girilenIsimler.get(i))) {
			count++; // cagirdigim isim isimList'de varsa count'u bir artirdim.
		}
	
		}
			System.out.println("Girdiginiz isimlerden " + count + " tanesi bendeki listede kayitli.");
			
			scan.close();
	
	}

}
