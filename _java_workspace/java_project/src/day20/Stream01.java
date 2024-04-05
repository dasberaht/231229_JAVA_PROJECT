package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		/* Stream(스트림)
		 *  - 실제 입력/출력이 표현된 데이터의 이상화된 흐름
		 *  - 자료에 대한 스트림을 생성하여 연산
		 *  - 그 연산을 모두 수행하면 스트림은 소모된다
		 *  - 스트림 연산은 기존 자료에 변경을 유발하지 않는다
		 *  - 스트림은 기존 자료를 복사하여, 복사본을 연산에 사용
		 *  - 중간연산과 최종연산으로 구분
		 * 	- 중간연산은 메서드를 이어서 사용할 수 있다
		 * 		distinct() 	중복제거
		 * 		filter()	조건에 맞는 값만 다음 스트림으로 넘긴다
		 * 		limit() 	스트림의 일부를 잘라냄
		 * 		skip() 		스트림의 일부를 건너뛴다
		 * 		peek()		작업수행
		 * 		sorted() 	정렬
		 * 		...
		 * 
		 *  - 최종연산은 마지막에만 가능하다
		 * 		forEach()
		 * 		count()
		 * 		sum()
		 * 		max()	
		 * 		min()
		 * 		allMatch() 	스트림 요소가 전부 일치하는지 확인
		 * 		anyMatch() 	스트림 요소가 하나라도 일치하는지 확인 
		 * 		toArray() 	배열로 변환 
		 * 		collect() 	스트림 요소 수집? 
		 * 		...
		 * 	
		 * 
		 * */
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println(sum);
		
		System.out.println("> 스트림 sum() ########################");
		int total = Arrays.stream(arr).sum();
		System.out.println(total);
		System.out.println("> 스트림 count() ######################");
		long cnt = Arrays.stream(arr).count();
		System.out.println(cnt);
		System.out.println("> 스트림 average() ####################");
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		
		// arr 값 중 5 이상의 값만 합계
		System.out.println("> 스트림(중간연산) filter() ##############");
		int s5 = Arrays.stream(arr).filter(n -> n>=5).sum();
		System.out.println(s5);
		
		// 점수 배열을 생성한 후 70점 이상만 '합계'와 '평균' 그리고 '최고점수'를 구하시오.
		System.out.println("> 점수 배열을 생성한 후 70점 이상만 '합계'와 '평균' 그리고 '최고점수'를 구하시오. ###");
		int[] score = {90, 80, 75, 88, 100, 98, 47, 96, 92, 53};
		OptionalInt scoremax = Arrays.stream(score).max();
		int scoresum = Arrays.stream(score).filter(n -> n>=70).sum();
		OptionalDouble scoreavg = Arrays.stream(score).filter(n -> n>=70).average();
		long scorecount = Arrays.stream(score).filter(n -> n>=70).count();
		System.out.println("70점 이상 : " + scorecount + "명");
		System.out.println("최고점수 : " + scoremax + "점");
		System.out.println("합계(70점 이상) : " + scoresum + "점");
		System.out.println("평균(70점 이상) : " + scoreavg + "점");
		
		
		System.out.println("> list를 stream 으로 구성 #############");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		list.add(5);
		list.add(5);
		list.add(5);
		list.add(8);
		list.add(6);
		list.stream().forEach(n -> System.out.print(n+ " "));
		System.out.println();
		
		System.out.println("> distinct() 중복제거 ################");
		list.stream().distinct().forEach(System.out::print);
		System.out.println();
		list.stream().distinct().forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		System.out.println("> sorted() 정렬 ####################");
		list.stream().sorted().forEach(n->System.out.print(n + " "));
		list.stream()
		.distinct()
		.sorted()
		.forEach(n->System.out.print(n + " "));
		System.out.println();
		System.out.println();
		
		System.out.println("> 스트림 객체 생성 ####################");
		Stream<Integer> s1 = Stream.of(10, 20, 40, 50, 90, 30);		// 1회용
		
		System.out.println("> Integer 스트림 합계 ################");
		// map : 스트림 변환에 사용하는 중간연산
		// mapToInt : map 의 값을 int 로 변환
		int s = s1.mapToInt(n-> n.intValue()).sum();			// .intValue() 는 Integer 를 int 로 변환
		System.out.println(s);
		// s1.forEach(n->System.out.print(n+" "));				// s1 과 같이 스트림으로 객체를 생성한 경우 1번만 사용할 수 있다
		
		
		
		
	}

}
