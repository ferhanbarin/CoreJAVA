package day48_Set;

import java.util.Arrays;
import java.util.HashSet;

public class C1_Set_01 {
	
	/*
	Set : 1) unique(benzersiz tek) elemanlardan olusur, Set'lerin icinde bir eleman sadece bir kere kullanilabilir. m�kerrer(duplicate) eleman olmaz.
		  2) sadece bir null degeri alabilir.(treeSet hari�).Java elementleri unique yapmak icin HASH ALGORITMASI kullanir.
    Java her data icin hashing teknigini kullanarak bir code uretir.Bu code'u almak icin HashCode() methodu kullanilir.
    Hashing, farkli b�y�kl�kteki girdilerden sabit b�y�kl�kte bir �ikti olusturma s�recine verilen isimdir.
    Universitelerdeki �grenci numaralari gibi bir ogrenci ismi soruldugunda numarasini bulursaniz onunla ilgili tum datalara ulasilabilir.
    
       Set     --> HashSet         : 1) HashSet, duplication�a(tekrarli eleman) izin vermez. Eger bir elemani tekrar HashSet�e eklemek isterseniz eski olan silinip, yeni olan uzerine yazilir.
                           		  2) Haset'ler Set'ler arasinda en hizli olanidir. bir algoritmaya g�re kayit eder. Degerlerin giris sirasina dikkat edilmez. (LinkedHashSet hari�)
                                  3) HashSet "null" object'ini eleman olarak kullanabilir.  Ancak birden fazla null degerini bir HashSet�e eklemek isterseniz sadece bir tane null degeri olur.
                                  
                        
       LinkedHashset   : 1) Tekrarli eleman kabul etmezler. Elemanlari ekleme sirasina(insertion order) gore dizerler.
                         2) LinkedHashSet, HashSet'den daha yavas calisir.
                         3) LinkedHashSet "null" object'ini eleman olarak kullanabilir.
                         4) Ekleme ve remove islemlerinde hizlidirlar.
       TreeSet         : 1) TreeSet tekrarli eleman kabul etmez, cunku Set'dir.
                         2) Elemanlari natural Order'a(String ise alfabetik, sayi ise kucukten buyuge) gore dizer.
                         3) TreeSet, setlerin en yavasidir. Bu yuzden TreeSet kullanirken dikkatli olunmali...
                         4) TreeSet "null" object'ini eleman olarak kullanilamaz.
                         
	   Set Methods :
	.add(eleman);-->Set�e eleman ekler
	.addAll(collection);-->istenen collection�in tum elemanlarini ekler
	.contains(eleman);-->istenen eleman sett�te varsa true, yoksa false dondurur.
	.containsAll(collection);-->istenen collection�in tumu aranan sette var ise true, yoksa false dondurur
	.remove(eleman);-->istenen eleman bulursa siler ve true dondurur, bulamazsa false dondurur
	.removeAll(collection);-->istenen collection�in tum elemanlarini bulursa siler ve true dondurur, bulamazsa false dondurur
	.equlas(set2);-->istenen set2�le tum elemanlar ayni ise true, yoksa false dondurur
	.retainAll(collection1);-->collection1�nin elemanlarinin disindaki tum elemanlari siler, silme islemi yapti ise true, yoksa false dondurur(kesisen ortak elemanlari d�nd�r�r.)
	.clear();-->sett'teki Tum elemanlari siler
	.isEmpty();-->Sette hic eleman yoksa true, varsa false dondurur
	.size();-->set�in eleman sayisini verir
*/


	public static void main(String[] args) {
		
		HashSet <String> hs1 = new HashSet<>(Arrays.asList("Erdem", "Furkan", "Samet", "Hakan"));
		
		hs1.add("Halil");
		System.out.println(hs1); // [Samet, Halil, Hakan, Furkan, Erdem]
		
		
		HashSet <String> hs2 = new HashSet<>(Arrays.asList("Basarili", "Azimli", "Nasipli"));
		
		hs1.addAll(hs2);
		System.out.println(hs1); // [Samet, Halil, Basarili, Nasipli, Azimli, Hakan, Furkan, Erdem]
		
		hs1.remove("Basarili");
		System.out.println(hs1); // [Samet, Halil, Nasipli, Azimli, Hakan, Furkan, Erdem]
		
		System.out.println(hs1.size()); // 7
		System.out.println(hs1.isEmpty()); // false
		System.out.println(hs1.contains("Erdem")); // true

	}

}
