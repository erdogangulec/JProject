package finall;

public class catch__ {
	
	static void ortpuan(int s1,int s2) {
		if(s1>100 || s2>100 || s1<0 || s2<0) {//belirli limitler tan�mlad�k.
			throw new ArithmeticException("0-100 aras� not olmal�");//olas� bir hatada hatay� tespit edecektir.
		} else {
			System.out.println("ort :" + (s1*0.50+s2*0.50));//ortalama i�in puan a��rl�klar�n� belirledik.
		}
	}
	
	
	public static void main(String[] args) {
		ortpuan(50,140);//fonksiyonu �a��r�p de�er at�yoruz.

	}

}

