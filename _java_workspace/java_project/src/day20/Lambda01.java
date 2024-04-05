package day20;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda01 {

	public static void main(String[] args) {
		/* Lambda + Stream -> 람다와 스트림 		// 주로 같이 사용
		 * lambda : 람다식(식을 단순하게 표현하는 방법)
		 * 	외부 자료의 부수적인 영향(side effect)을 주지 않도록 구현하는 방식
		 * 
		 * Stream : 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * - 메서드 체이닝 기법을 사용
		 * 
		 * lambda functions : 람다함수 -> 익명클래스를 사용하여 쓰는 함수
		 * 
		 * 람다의 장점 : 코드의 간결성, 병렬처리 가능, 불필요한 연산 최소화
		 * 람다의 단점 : 가독성이 떨어진다, 반복문 사용 시 성능 저하
		 * 
		 * - 람다의 표현식
		 * 	(매개변수) -> {구현; };
		 * 
		 * 	매개변수가 1개면, '()' 생략 가능
		 * 	ex) x -> {retrun x+1; }
		 * 	ex) x, y -> x+y;			// 오류	
		 * 
		 * 	return 이 없다면, '{}' 생략 가능	
		 * 	ex) x -> x+1;
		 * 	ex) x -> retrun x+1; 		// 오류
		 * 	ex) (x, y) -> x+y;
		 *  ex) (x, y) -> {return x+y; }
		 * 
		 * */
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(20);
		list.add(40);
		list.add(80);
		list.add(70);
		list.add(60);
		
		for(Integer tmp : list) {
			System.out.print(tmp+" ");
		} System.out.println();
		
		System.out.println("> 람다식 ===================");
		
		list.forEach(n->{
			System.out.print(n+" ");
		});	System.out.println();
						
		System.out.println("> 컨슈머 활용한 출력 ==========");
		
		Consumer<Integer> method = (n) -> {				// *람다함수(익명함수)
			System.out.print(n + " ");
		};
		
		list.forEach(method);
		
		
		
	}

}
