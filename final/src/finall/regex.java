package finall;

import java.util.regex.Pattern;

public class regex {

	public static void main(String[] args) {
		String s = "El alem ala dana ald� ala danaland� da biz bir ala dana al�p da ala danalanamad�k.";//belirli bir metin tan�mlad�k.
        Pattern pattern = Pattern.compile("al.");//Ba�� "al" ile ba�layan �� harfli string ar�yoruz.
        java.util.regex.Matcher matcher = pattern.matcher(s);//pattern ile fonksiyonumuz �al��mas� i�in tan�mlad�k.    
        
        int sayac = 0;//bir saya� tan�mlad�k.
        while (matcher.find()) sayac++;//her seferinde bir artt�r�yoruz.
        System.out.println(sayac);//buldu�umuz sonucu yazd�r�yoruz.            
        System.out.println("-----------------------------------------------");
        System.out.println(Pattern.matches(".r.", "erd"));//ikinci harfi r olan �� harfli string buldu�u i�in true.
		System.out.println(Pattern.matches("...d", "erd"));//d�rt harfli ve sonu d ile biten stringi bulamad��� i�in false.
		System.out.println(Pattern.matches("[k]", "erd"));//tek karakterli bir k stringini bulamad��� i�in false.
		System.out.println(Pattern.matches("[glc]", "l"));//g-l-c karakterlerinin birinin var olu olmad���n� soruyor bu y�zden true.
		System.out.println(Pattern.matches("[glc]", "gllcglcl"));//g-l-c birden fazla tekrar etti�i i�in false.		
		System.out.println(Pattern.matches("[glc]?", "glc"));//g-l-c den biri birkez tekrar etmi� mi diye soruyor etmedi�i i�in false.   
		System.out.println(Pattern.matches("[glc]+", "g"));//g-l-c de biri bir yada daha fazla tekrar etmi� mi diye sorar ve true yazar.
		System.out.println(Pattern.matches("[glc]*", "glcggllc"));//hi� tekrar etmemi� veya birden fazla tekrar etmi� mi diye bakar true 
		System.out.println(Pattern.matches("\\d", "8"));//Sadece bir rakam arad��� i�in true.
		System.out.println(Pattern.matches("\\d{2}", "16"));//iki rakam arad��� i�in true.
		System.out.println(Pattern.matches("\\d", "587760"));//tek rakam arad��� i�in false.  
		System.out.println(Pattern.matches("\\D", "962thl"));//tek karakter ar�yor ve hem �ok rakam ve harf bulundu�u i�in false.  
		System.out.println(Pattern.matches("\\D", "e"));//Tek bir karakter arad��� i�in true.
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "k9d944"));//k���k a dan z ye kadar yada A dan Z ye kadar, 0 dan 9 a kadar 6 adet karakter ar�yoruz oy�zden true.
		System.out.println(Pattern.matches("[542][0-9]{9}", "29530389490"));//5-4-2 ile ba�lamal� ve 9 karakter olmal� 11 karakter oldu�u i�in false.  
		System.out.println(Pattern.matches("[542]{1}\\d{9}", "5853038949"));//5-4-2 ile ba�lay�p 9 karakter olmal� bunu kar��l�yor bu y�zden true.
	}

}
