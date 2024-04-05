package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Set01 {

	public static void main(String[] args) {
		/* Set : 순서 보장 X, 중복 X
		 * 	- index가 없으므로, 순서도 없다 + 정렬 불가
		 * 
		 * HashSet (대표적인 Set 컬렉션 구현클래스)
		 * TreeSet (정렬이 되는 Set)
		 * */
		
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("apple");
		set.add("peach");
		set.add("orange");
		set.add("watermelon");
		set.add("apple");
		
		System.out.println(set);
		
		// index 가 없어, get(), set() 메서드가 없다
		for(String tmp : set) {
			System.out.print(tmp + " / ");
		}
		
		System.out.println();
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			System.out.print(temp + " / ");
		}
		
		System.out.println();
		
		// set 정렬 : set 은 순서가 없으므로 정렬이 되지 않는다
		// set 은 list 로 변환 후 정렬
		List<String> list = new ArrayList<String>(set);		// Set->List 변환
		Collections.sort(list);
		System.out.println(list);
		

		
		
		TreeSet<String> set2 = new TreeSet<String>();
		set2.add("카");
		set2.add("나");
		set2.add("가");
		set2.add("하");
		System.out.println(set2);
		
		
		
	}

}
