package finall;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Set_Map {

	public static void main(String[] args) {
		
		HashSet<Integer> s = new HashSet<>();//bir hashset tan�mlad�k. Random bi�imde yazd�racak.
		s.addAll(Arrays.asList(new Integer[] {2,56,23,58,19,9,5,84,61,88}));//arraylist e say�lar� ekledik.
		System.out.println(s);//yazd�rd�k.
				
		
		TreeSet<Integer> t = new TreeSet<>(s);//treeSet tan�mlad�k bu i�lem sonucunda say�lar s�ral� bi�imde yaz�lacak.
		System.out.println(t);//k�meyi yazd�r�yor

		HashMap<Integer, String> map = new HashMap<>();//ramdom bi�imde k�meyi yazd�r�r.  
		map.put(66, "Ahmet");
		map.put(15, "Minel");
		map.put(98, "Akif");
		map.put(27, "Kerem");
		map.put(11, "Ahmet"); 
		map.put(538, "Samet");
		map.put(45, "Burak"); 
		
		System.out.println(map);//k�meyi yazd�r�r.
		System.out.println(map.get(538));//538 olan eleman� yazd�r�r.
		System.out.println(map.containsValue("Beyza"));//Beyza adl� eleman�n olup olmad���n� kontrol eder.
		
	
		TreeMap<Integer, String> tree = new TreeMap<>(map);//Treemap elemanlar� s�ral� bir bi�imde yazd�r�r.
		System.out.println(tree);//k�meyi yazd�r�yor
	
	
	
	
	
	}

}
