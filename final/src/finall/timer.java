package finall;

import java.util.Timer;
import java.util.TimerTask;

public class timer {
	static int sayac=0;//bir saya� tan�mlad�k.
	public static void main(String[] args) {
		
		
		Timer myTimer = new Timer();// Timer'�n nesnesini olu�turduk.
		
		TimerTask g = new TimerTask() {// timertask olu�turuyoruz buraya komut tan�ml�ycaz.
					
					@Override
					public void run() {
						System.out.println("ben bir komutum");
						sayac++;// bir bir artt�r�yor.
						if(sayac==5) myTimer.cancel();//ben bir komutum yaz�s�n� 5 kez yazd�racak.
					}								// sonra durmas�n� sa�layacak.
				};
	
		myTimer.schedule(g,2,500);// belirli bir zaman aral��� tan�ml�yoruz.	
	
	}

}
