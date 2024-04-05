package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collector;


public class 과제20 {

	public static void main(String[] args) {
		/* 스트림으로 출력
		 * 
		 * 여행사 상품
		 * 여행 비용 : 15세 이상 - 100만 원 / 15세 미안 - 50만 원
		 * 
		 * 고객 3명이 패키지 여행을 떠날 경우,
		 * 
		 * 	1. 비용계산 => 출력
		 * 
		 * 		 * 예) 고객정보 -> 고객명단
		 * 		이름 : 이순신, 나이 : 40, 비용 : 100만 원
		 * 		이름 : 신사임당, 나이 : 35, 비용 : 100만 원
		 * 		이름 : 홍길동, 나이 : 10, 비용 : 50만 원
		 * 		여행 경비 : 총 250만 원
		 * 
		 * 	2. 고객명단 검색 => 출력 
		 * 
		 *		20대 이상 고객명단 => 이름순으로 정렬
		 * 		이름 : 신사임당, 나이 : 35, 비용 : 100만 원
		 * 		이름 : 이순신, 나이 : 40, 비용 : 100만 원
		 * 
		 * 
		 * 고객 클래스를 생성하고, ArrayList 로 고객관리
		 * 
		 * */

		Customer lee = new Customer("이순신", 40);
		Customer sin = new Customer("신사임당", 30);
		Customer hong = new Customer("홍길동", 10);
		
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(lee);
		list.add(sin);
		list.add(hong);
		
		
//		list.add(new Customer("이순신", 40, 100));
//		list.add(new Customer("신사임당", 35, 100));
//		list.add(new Customer("홍길동", 10, 50));
		
		int sum=0;
		System.out.println("고객명단 >");
	
		for(Customer tmp : list) {
			String name = tmp.getName();
			int age =tmp.getAge();
			int price = tmp.getPrice();
			sum += price;
			System.out.println(name +" ("+ age +") : "+ price + "만 원");
		}
		System.out.println("총 " + sum + "만 원");
		
		Collections.sort(list);		// 클래스 내 compareTo 구현 시 사용 가능
		
		System.out.println();
		System.out.println("20대이상 명단 >");
	
		for(Customer tmp : list) {
			if(tmp.getAge() >= 20) {
				System.out.println(tmp);
			}
		}
		
		System.out.println();
		System.out.println("스트림을 이용한 방법 >");
		list.stream().forEach(s-> System.out.println(s));
		
		System.out.println();
		System.out.println("고객명만 출력 >");
		list.stream()
		.map(m -> m.getName())
		.forEach(n -> System.out.println(n));
		
		System.out.println();
		System.out.println("비용만 출력 >");
		int tot = list.stream()
		.mapToInt(p -> p.getPrice())
		.sum();
		System.out.println("총 지불금액 : " + tot);
		
		System.out.println();
		System.out.println("20대이상 출력 >");
		list.stream()
		.filter(c->c.getAge() >= 20)
		.sorted()	// 클래스에서 정렬이 구현되어있다면 그냥 사용 가능				
		
		// 기존 클래스 자체에서 정렬이 구현되어 있지 않을 경우
//		.sorted(new Comparator<Customer>() {
//
//			@Override
//			public int compare(Customer o1, Customer o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareTo(o2.getName());
//			}
//			
//			
//		})
		.forEach(a->System.out.println(a));

		
		// 익명클래스 사용할 경우 Comparator 대상(매개변수) 2개
		
		// 클래스 내부에서 구현할 경우 Comparable 구현 대상(매개변수) 1개
		
		
		

		
//////////////////////////////////////////////////////////////////		
		
		
		
//		System.out.println("고객명단 및 비용 >");
//		list.stream()
//		.forEach(l -> {
//			String name = l.getName();
//			int age = l.getAge();
//			int price = l.getPrice();
//			System.out.println("이름 : " + name + ",   나이 : " + age + "세,   비용 : " + price + "만 원");
//			}
//		);
//		int sum = list.stream()
//				.mapToInt(price2 -> price2.getPrice())
//				.sum();
//				System.out.println("여행 경비 : 총 " + sum + "만 원");
//		
//				
//		System.out.println("================");
//			
//		
//		System.out.println("20대이상 고객명단 >");
//		list.stream()
//		.filter(n -> n.getAge()>=20)
//		.sorted(new Comparator<Customer>() {
//
//			@Override
//			public int compare(Customer o1, Customer o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareTo(o2.getName());
//			}
//			
//		})
//		.forEach(a -> {
//			String name = a.getName();
//			int age = a.getAge();
//			int price = a.getPrice();
//			System.out.println("이름 : " + name + ",   나이 : " + age + "세,   비용 : " + price + "만 원");	
//		});
		
				
	}

}
