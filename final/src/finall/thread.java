package finall;

public class thread {
	static int a,b;
	public static void main(String[] args) {
		
		Thread f = new Thread() {//Thread tan�mlad�k.
			public void run() {
				for(a=0;a<100;a++) { //a integer� i�in belirli aral��� tan�mlad�k
					System.out.print("1- ");//de�ere isim verip yazd�r�yoruz
				}
			}
		};
		Thread k = new Thread() {//Thread tan�mlad�k.
			public void run() {
				for(b=0;b<100;b++) {//b integer� i�in belirli aral��� tan�mlad�k
					System.out.print("2- ");//de�ere isim verip yazd�r�yoruz
				}
			}
		};
		
		f.start();//f threadini �a��r�yoruz bu da yazma i�lemini sa�l�yor
		k.start();//k threadini �a��r�yoruz bu da yazma i�lemini sa�l�yor
		
		//Bu kod i�in: verilen de�erlerin farkl� yollar ile e� zamanl� �al��mas� sa�lanm��t�r.
	}

}
