package wb0;

import java.util.Timer;
import java.util.TimerTask;

public class den6 {
	static int sayac =0;
	public static void main(String[] args) {
		
		Timer myTimer = new Timer();
		TimerTask gorev = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("merhaba");
				sayac++;
				if(sayac==10) myTimer.cancel();
			}
		};
			
		myTimer.schedule(gorev,0,1500);
		
		TimerTask gorev2 = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("gorev2");
				
			}
		};
		
		myTimer.schedule(gorev2, 0, 200);
	
	}

}
