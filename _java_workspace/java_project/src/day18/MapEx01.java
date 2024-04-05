package day18;

import java.util.HashMap;

public class MapEx01 {

	public static void main(String[] args) {
		/* 	map => 상품 / 가격 추가 후 합계	*출력은 main 에서 실행
		 * 
		 * 	상품을 map 안에 추가하는 작업은 메서드 활용
		 * 		1. map 을 main 에 생성 후 매개변수로 받아 map 의 데이터를 채우는 메서드
		 * 		2. map 을 메서드 내부에서 생성 후 main 으로 리턴하는 메서드
		 * 
		 *  ex)	가위 2500
		 *  	크레파스 4000
		 *  	물감 5000
		 *  	합계 ?
		 *  
		 * */

		HashMap<String, Integer> map = new HashMap<>();
		int sum = 0;
		MapEx01 m = new MapEx01();
		System.out.println("------------map을 매개변수로 받는 메서드 실행");
		m.makeMap(map);
		for(String s : map.keySet()) {
			sum += map.get(s);
			System.out.println(s + " : " + map.get(s));
		}
		System.out.println("합계 : " + sum);
		System.out.println("------------출력 메서드 사용");
		m.printMap(map);
		
		

		// 메서드를 실행하면 map을 주는 케이스
		HashMap<String, Integer> map1 = m.makeMap2();
		int sum1 = 0;
		System.out.println("------------map을 리턴으로 받은 메서드 실행");
		for(String s : map1.keySet()) {
			sum1 += map1.get(s);
			System.out.println(s + " : " + map1.get(s));
		}
		System.out.println("합계 : " + sum1);
		
		// *****메서드의 map 을 main 에서 호출하는 방법 : HashMap<String, Integer> map1 = m.makeMap2(); 
		
		System.out.println("------------출력 메서드 사용");
		m.printMap(m.makeMap2());
		
		
		
		// map 을 받아서 출력
		
//		System.out.println("------------출력 메서드 사용");
//		HashMap<String, Integer> map2 = new HashMap<>();
//		m.printMap(map2, "풀", 500);
//		m.printMap(map2, "가위", 1000);
//		m.printMap(map2, "종이", 300);
		
		
	}
	

	
	
	// map 을 매개변수로 받는 케이스
	public void makeMap(HashMap<String, Integer> map) {					//값을 String name, int price 매개변수로 받는 경우 추가
		map.put("가위", 2000);
		map.put("크레파스", 4000);
		map.put("물감", 5000);
	}
		
	


	// map 을 내부에서 생성하여 리턴하는 케이스
	public HashMap<String, Integer> makeMap2() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("가위", 3000);
		map.put("크레파스", 5000);
		map.put("물감", 6000);
		
		return map;
	}
	
	
	
	
	// map을 받아서 출력하는 메서드
	public void printMap(HashMap<String, Integer> map) {
		int sum = 0;
		for(String a : map.keySet()) {
			sum += map.get(a);
			System.out.println(a + " : " + map.get(a));
		}
		System.out.println("합계 : " + sum);
	}
	

	
	
	
}


