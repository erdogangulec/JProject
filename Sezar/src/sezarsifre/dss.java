package sezarsifre;

enum GUNLER{
	PAZARTESÝ,SALI,ÇARÞAMBA,PERÞEMBE,CUMA,CUMARTESÝ,PAZAR;
}

public class dss {

	public static void main(String[] args) {
		// final String gun = "salý"; final terimi deðiþkeni sabit yapar
				// yeni bir deðer atamanýza izin vermez
				// gun = "çarþamba"  bu iþlem yapýlamaz
		 		
				//enum final ifadesinib daha geliþmiþi ve bir çeþit class-sýnýf halidir
				// nesne tanýmlamadan GUNLER.CUMA þeklinde kullanýlabilir
				// nesne üreterek kullaným
				GUNLER g = GUNLER.PERÞEMBE;
				System.out.println(g);
				System.out.println(g.ordinal());
				System.out.println(g.compareTo(GUNLER.PAZAR));
				System.out.println(g.compareTo(GUNLER.PAZARTESÝ));
				System.out.println(g.compareTo(GUNLER.SALI));
				System.out.println(Math.abs(GUNLER.SALI.compareTo(GUNLER.CUMA)));

			

	}

}
