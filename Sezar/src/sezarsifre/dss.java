package sezarsifre;

enum GUNLER{
	PAZARTES�,SALI,�AR�AMBA,PER�EMBE,CUMA,CUMARTES�,PAZAR;
}

public class dss {

	public static void main(String[] args) {
		// final String gun = "sal�"; final terimi de�i�keni sabit yapar
				// yeni bir de�er ataman�za izin vermez
				// gun = "�ar�amba"  bu i�lem yap�lamaz
		 		
				//enum final ifadesinib daha geli�mi�i ve bir �e�it class-s�n�f halidir
				// nesne tan�mlamadan GUNLER.CUMA �eklinde kullan�labilir
				// nesne �reterek kullan�m
				GUNLER g = GUNLER.PER�EMBE;
				System.out.println(g);
				System.out.println(g.ordinal());
				System.out.println(g.compareTo(GUNLER.PAZAR));
				System.out.println(g.compareTo(GUNLER.PAZARTES�));
				System.out.println(g.compareTo(GUNLER.SALI));
				System.out.println(Math.abs(GUNLER.SALI.compareTo(GUNLER.CUMA)));

			

	}

}
