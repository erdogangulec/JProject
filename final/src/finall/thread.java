package finall;

public class thread {
	static int a,b;
	public static void main(String[] args) {
		
		Thread f = new Thread() {//Thread tanýmladýk.
			public void run() {
				for(a=0;a<100;a++) { //a integerý için belirli aralýðý tanýmladýk
					System.out.print("1- ");//deðere isim verip yazdýrýyoruz
				}
			}
		};
		Thread k = new Thread() {//Thread tanýmladýk.
			public void run() {
				for(b=0;b<100;b++) {//b integerý için belirli aralýðý tanýmladýk
					System.out.print("2- ");//deðere isim verip yazdýrýyoruz
				}
			}
		};
		
		f.start();//f threadini çaðýrýyoruz bu da yazma iþlemini saðlýyor
		k.start();//k threadini çaðýrýyoruz bu da yazma iþlemini saðlýyor
		
		//Bu kod için: verilen deðerlerin farklý yollar ile eþ zamanlý çalýþmasý saðlanmýþtýr.
	}

}
