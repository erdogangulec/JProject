package finall;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Set_Map {

	public static void main(String[] args) {
		
		HashSet<Integer> s = new HashSet<>();//bir hashset tanýmladýk. Random biçimde yazdýracak.
		s.addAll(Arrays.asList(new Integer[] {2,56,23,58,19,9,5,84,61,88}));//arraylist e sayýlarý ekledik.
		System.out.println(s);//yazdýrdýk.
				
		
		TreeSet<Integer> t = new TreeSet<>(s);//treeSet tanýmladýk bu iþlem sonucunda sayýlar sýralý biçimde yazýlacak.
		System.out.println(t);//kümeyi yazdýrýyor

		HashMap<Integer, String> map = new HashMap<>();//ramdom biçimde kümeyi yazdýrýr.  
		map.put(66, "Ahmet");
		map.put(15, "Minel");
		map.put(98, "Akif");
		map.put(27, "Kerem");
		map.put(11, "Ahmet"); 
		map.put(538, "Samet");
		map.put(45, "Burak"); 
		
		System.out.println(map);//kümeyi yazdýrýr.
		System.out.println(map.get(538));//538 olan elemaný yazdýrýr.
		System.out.println(map.containsValue("Beyza"));//Beyza adlý elemanýn olup olmadýðýný kontrol eder.
		
	
		TreeMap<Integer, String> tree = new TreeMap<>(map);//Treemap elemanlarý sýralý bir biçimde yazdýrýr.
		System.out.println(tree);//kümeyi yazdýrýyor
	
	
	
	
	
	}

}
