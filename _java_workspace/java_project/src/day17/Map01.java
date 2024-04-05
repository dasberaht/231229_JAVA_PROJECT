package day17;

import java.util.HashMap;
import java.util.Iterator;

public class Map01 {

	public static void main(String[] args) {
		/*	Map
		 * 	- 값을 2개(쌍으로) 저장; key / value
		 *  - key : 중복 불가 / value : 중복 가능
		 *  - HashMap 을 가장 많이 사용
		 *  
		 *  HashMap<클래스, 클래스> 이름 = new HashMap<클래스, 클래스>(); 		*HashMap => Map 으로 만 작성 가능
		 * 	map 은 값이 2개로 향상된for문 / iteragor 사용 불가
		 * 	map 의 key => set 으로 구성 후 출력
		 * 
		 *	list, set => add() 추가
		 *	map => put() 추가
		 *	getkey(), getvalue() // 추출가능 
		 * 
		 * 
		 * */

		HashMap<String, Integer> map = new HashMap<>();
		map.put("apple", 2000);
		map.put("banana", 3000);
		map.put("orange", 1000);
		map.put("peach", 4000);
		map.put("kiwi", 3000);
		
		System.out.println(map);
		System.out.println(map.keySet());	// key 만 별도로 set 구성; 	*순서는 임의로 출력된다
		System.out.println(map.values());	// value 만 별도로 set 구성;
		
		// get("key") 은 value 값을 리턴
		System.out.println(map.get("apple"));	
		
		// remove() 는 key 에 대한 값을 삭제하면서 value 값을 리턴
		System.out.println(map.remove("apple"));
		System.out.println(map);
		System.out.println(map.remove("a"));	// 존재하지 않는 값을 입력할 경우, null을 리턴한다
		System.out.println(map.remove("banana", 3000));		// key, value 값을 둘다 입력하면, true / false 로 리턴한다.	
		System.out.println(map);
		
		System.out.println();
		
		//향상된for문
		for(String key : map.keySet()) {
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println();
		
		//iterator
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println();
		
		//가격의 합계 구하기
		int sum = 0;
		for(String keysum : map.keySet()) {
			sum += map.get(keysum);
		}
		System.out.println("구입 합계 : " + sum);
		
		
		
		
		
	}

}
