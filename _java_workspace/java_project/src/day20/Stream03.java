package day20;

import java.util.ArrayList;

public class Stream03 {

	public static void main(String[] args) {
		
		/* Student 클래스로 리스트 구성
		 * add로 5명 추가
		 * */

		
		ArrayList<Student> list = new ArrayList<>();
		
		list.add(new Student("홍길동", 98));
		list.add(new Student("홍길순", 88));
		list.add(new Student("김영이", 100));
		list.add(new Student("김철수", 78));
		list.add(new Student("박지성", 65));
		
		/* 스트림 이용하여 콘솔에 출력
		 * 예) 홍길동 : 98 
		 * */

		//toString 출력
		list.stream().forEach(a -> System.out.println(a));
		
		System.out.println("> =======================");
		
		//출력문 수정
		list.stream()
		.forEach(
				n -> {
					String name = n.getName();
					int score = n.getScore();
					System.out.println(name + " : " + score);
				}
		);
		
		System.out.println("> =======================");
		
		/* list 의 점수 합계 / 전체 인원 수 출력
		 * */
		
//		list.stream()
//		.forEach(a -> {
//			int score = a.getScore();
//			score += score;
//			System.out.println(score);
//			}
//		);
		
		System.out.println("점수 합계 > ");
		int sum = list.stream()
				.mapToInt(n -> n.getScore())
				.sum();
		System.out.println(sum + " 점");
		
		
		System.out.println("전체 인원 수 >");
		long count = list.stream().count();
		System.out.println(count + " 명");
		
		
		
		
	}

}
