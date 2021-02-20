package finall;

import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		String s = "El alem ala dana aldý ala danalandý da biz bir ala dana alýp da ala danalanamadýk.";//belirli bir metin tanýmladýk.
        Pattern pattern = Pattern.compile("al.");//Baþý "al" ile baþlayan üç harfli string arýyoruz.
        java.util.regex.Matcher matcher = pattern.matcher(s);//pattern ile fonksiyonumuz çalýþmasý için tanýmladýk.    
        
        int sayac = 0;//bir sayaç tanýmladýk.
        while (matcher.find()) sayac++;//her seferinde bir arttýrýyoruz.
        System.out.println(sayac);//bulduðumuz sonucu yazdýrýyoruz.            
        System.out.println("-----------------------------------------------");
        System.out.println(Pattern.matches(".r.", "erd"));//ikinci harfi r olan üç harfli string bulduðu için true.
		System.out.println(Pattern.matches("...d", "erd"));//dört harfli ve sonu d ile biten stringi bulamadýðý için false.
		System.out.println(Pattern.matches("[k]", "erd"));//tek karakterli bir k stringini bulamadýðý için false.
		System.out.println(Pattern.matches("[glc]", "l"));//g-l-c karakterlerinin birinin var olu olmadýðýný soruyor bu yüzden true.
		System.out.println(Pattern.matches("[glc]", "gllcglcl"));//g-l-c birden fazla tekrar ettiði için false.		
		System.out.println(Pattern.matches("[glc]?", "glc"));//g-l-c den biri birkez tekrar etmiþ mi diye soruyor etmediði için false.   
		System.out.println(Pattern.matches("[glc]+", "g"));//g-l-c de biri bir yada daha fazla tekrar etmiþ mi diye sorar ve true yazar.
		System.out.println(Pattern.matches("[glc]*", "glcggllc"));//hiç tekrar etmemiþ veya birden fazla tekrar etmiþ mi diye bakar true 
		System.out.println(Pattern.matches("\\d", "8"));//Sadece bir rakam aradýðý için true.
		System.out.println(Pattern.matches("\\d{2}", "16"));//iki rakam aradýðý için true.
		System.out.println(Pattern.matches("\\d", "587760"));//tek rakam aradýðý için false.  
		System.out.println(Pattern.matches("\\D", "962thl"));//tek karakter arýyor ve hem çok rakam ve harf bulunduðu için false.  
		System.out.println(Pattern.matches("\\D", "e"));//Tek bir karakter aradýðý için true.
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "k9d944"));//küçük a dan z ye kadar yada A dan Z ye kadar, 0 dan 9 a kadar 6 adet karakter arýyoruz oyüzden true.
		System.out.println(Pattern.matches("[542][0-9]{9}", "29530389490"));//5-4-2 ile baþlamalý ve 9 karakter olmalý 11 karakter olduðu için false.  
		System.out.println(Pattern.matches("[542]{1}\\d{9}", "5853038949"));//5-4-2 ile baþlayýp 9 karakter olmalý bunu karþýlýyor bu yüzden true.
	}

}
