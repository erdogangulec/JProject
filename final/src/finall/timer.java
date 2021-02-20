package finall;

import java.util.Timer;
import java.util.TimerTask;

public class timer {
	static int sayac=0;//bir sayaç tanýmladýk.
	public static void main(String[] args) {
		
		
		Timer myTimer = new Timer();// Timer'ýn nesnesini oluþturduk.
		
		TimerTask g = new TimerTask() {// timertask oluþturuyoruz buraya komut tanýmlýycaz.
					
					@Override
					public void run() {
						System.out.println("ben bir komutum");
						sayac++;// bir bir arttýrýyor.
						if(sayac==5) myTimer.cancel();//ben bir komutum yazýsýný 5 kez yazdýracak.
					}								// sonra durmasýný saðlayacak.
				};
	
		myTimer.schedule(g,2,500);// belirli bir zaman aralýðý tanýmlýyoruz.	
	
	}

}
