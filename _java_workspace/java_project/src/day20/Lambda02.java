package day20;

import java.util.HashMap;

public class Lambda02 {

	public static void main(String[] args) {
		/* map 을 구성하여 forEach를 사용하여 출력
		 * */

		HashMap<String, Integer> map = new HashMap<>();
		map.put("길동", 92);
		map.put("영이", 55);
		map.put("철수", 70);
		map.put("영철", 100);
		map.put("순이", 96);

		map.forEach((m1, m2) -> {
			System.out.println(m1 + " " + m2 + "점");
		});
		
		
		Number sum = (a, b) -> {	// 함수 구현
			return a + b;
		};
		
		int hap = sum.add(50, 60);
		System.out.println(hap);
		
		System.out.println(sum.add(100, 200));
		
		
		Number max = (a, b) -> (a>=b) ? a : b;
		System.out.println(max.add(30, 50));
		
		
		
		
	}

}


// 함수형 인터페이스 생성
// 메서드가 1개여야만 한다
@FunctionalInterface
interface Number {
	int add(int a, int b);
//	int max(int a, int b);		*메서드가 2개면 error!
}

interface Num {
	int max(double c, int d);
}









