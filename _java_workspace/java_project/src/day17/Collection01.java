package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map => 인터페이스; 반드시 구현 클래스로 객체를 생성
		 * 데이터를 묶어서 관리할 때 사용
		 * 주로 배열대신 사용
		 * 
		 * 
		 * *List (배열과 동일)
		 * - 값을 하나씩 저장
		 * - 순서를 보장 (index)
		 * - 중복 가능
		 * - 배열 대신에 가장 많이 사용하는 구조
		 * 
		 * *Set
		 * - 값을 하나씩 저장
		 * - 그러나, 순서를 보장하지 않음 (index 없음)
		 * - 중복 불가능 (같은 자료가 입력되면 버려진다)
		 * 
		 * *Map
		 * - 값을 두개씩 저장
		 * - key / value 쌍으로 저장
		 * - key : 중복 불가능 / value : 중복 가능
		 * - key 가 중복되면, value 는 덮어쓰게 된다
		 * - 아이디/패스워드와 같이 하나의 자료를 묶어서 저장해야 할 때 사용
		 * 
		 * 
		 * 배열은 기본자료형, 클래스자료형 으로 구성이 가능
		 * int arr[], String arr[], Student arr[] ... 다 가능
		 * 
		 * Collection 에서는 기본자료형은 불가능; 클래스자료형만 가능*
		 * 기본자료형에 맞는 클래스자료형을 사용하면 된다
		 * int => Integer, String
		 * 나머지는 기본자료형의 첫 글자만 대문자로 변환하면 클래스자료형이 된다
		 * long => Long, byte => Byte, boolean => Boolean .... 등등
		 * 
		 * 만약 클래스를 지정하지 않으면 Object 가 자동 설정된다
		 * 
		 * List<클래스명> 객체명 = new 구현클래스<클래스명>();
		 * List => 구현클래스 ArrayList / LinkedList
		 * 
		 * ArrayList : 검색 시 유리 (배열과 비슷)
		 * - 미리 길이를 지정하지 않으며, 추가되면 늘어나고, 삭제되면 줄어든다.
		 * - 추가, 삭제가 쉽고, 검색이 쉽다.
		 * 
		 * LinkedList : 추가/삭제가 많은 경우에 유리
		 * - 값을 중간에 끼워넣거나, 빼는 것이 쉽다
		 * - 검색이 느리다.
		 * */
		
		List<Integer> list = new ArrayList<Integer>();			// 부모를 기준으로 생성
		ArrayList<Integer> list1 = new ArrayList<Integer>();	// 자식 기준으로 생성
		ArrayList list2 = new ArrayList();						// object 로 생성
		ArrayList<Integer> list3 = new ArrayList<>();			// 
		
		
		// add() : 요소를 추가
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);								// List 는 내부에 String 을 포함하여 바로 출력이 가능하다.
		// get(index) : index 번지의 요소를 가져오기
		System.out.println(list.get(0));						// getter/setter 모두 사용 가능

		// set(index, 값) : index 번지의 값을 변경하기
		list.set(0, 5);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list);
		
		
		System.out.println("---------for문 활용 출력");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		list.remove(0);
		System.out.println(list);
		
		System.out.println("---------");
		// size() : 총 개수를 확인
		System.out.println(list.size()+"개");
				
		System.out.println("---------");
		// 문자열을 담을 수 있는 ArrayList 를 생성
		// 문자열 5개를 저장한 후 출력
		// 총 개수가 몇개인지 출력
//		List<String> list5 = new ArrayList<>();
//		List<String> list5 = new ArrayList<String>();
//		list5.add("가");
//		list5.add("나");
//		list5.add("다");
//		list5.add("라");
//		list5.add("마");
//		System.out.println(list5);
//		System.out.println(list5.size()+"개");
		
		ArrayList<String> list4 = new ArrayList<String>();
		list4.add("가");
		list4.add("나");
		list4.add("다");
		list4.add("라");
		list4.add("마");
		System.out.println(list4);
		for(int i=0; i<list4.size(); i++) {
			System.out.println(list4.get(i));
		}
		
		System.out.println("---------");
		// 향상된 for문
		for(String s : list4) {
			System.out.println(s);
		}
		
		
		System.out.println("---------");
		// list1에 1부터 10까지 값을 지정한 후 출력
		//
		for(int i=1; i<=10; i++) {
			if(i <= 10) {
				list1.add(i);
			}
		} 
		System.out.println(list1);

//		for(int a : list1) {
//			System.out.print(a+" ");
//		}
		
		// list1의 0번지 값을 7로 변경
		list1.set(0, 7);
		System.out.println(list1);
		
		
		// remove(index) : index 번지의 값을 삭제;
		list1.remove(0);			//0번지를 지우고, 지워진 자리를 당겨서 채운다.
		System.out.println(list1);
		
		System.out.println("---------");
		// remove(object) : object의 요소를 삭제;
		Integer a = 9;
		list1.remove(a);
		System.out.println(list1);
		
		System.out.println("---------");
		// contains(object) : list 에 값이 있는지 검사 => true / false 리턴
		System.out.println(list1.contains(a));
		
		System.out.println("---------");
		// clear() : 리스트를 비움 (요소 전부 삭제)
		list1.clear();
		System.out.println(list1);

		// isEmpty() : 리스트가 비워져 있는지 체크 => true / false 리턴
		System.out.println(list1.isEmpty());
		
		System.out.println("---------");
		// ArrayList 로 number 를 생성 숫자를 저장하는 리스트
		// 1~10 채운 후 출력 (향상된 for문 이용하여 출력*)
		ArrayList<Integer> number = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			number.add(i+1);
		}
		for(int num : number) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		System.out.println("---------");
		/* Iterator : index 가 없는 값을 출력하기 위해 사용				**import 필요
		 * list 에서는 순서를 보장하기 때문에 get(i) 를 사용하여 원하는 번지에 접근할 수 있다
		 * set / map 은 순서를 보장하지 않기 때문에 일반 for문 을 사용할 수 없다
		 * 향상된 for문 / Iterator 를 사용
		 * 순서와 상관없이 값을 가져올 수 있는 구문을 사용해야 한다
		 * map 은 향상된 for, Iterator 둘다 직접 사용이 불가하다
		*/
		
		System.out.println(">> Iterator 출력");
		Iterator<Integer> it = number.iterator();
		while(it.hasNext()) {								// hasNext() 는 다음 요소가 있는지 체크 => true / false 리턴
			Integer tmp = it.next();						// Next() 는 다음 요소 값을 가져오기
			System.out.print(tmp+" ");
		}
	
		
		System.out.println();
		System.out.println("---------");
		// indexOf(값) : 해당 값이 list 에 있는지 확인하고, 그 index 를 반환; 단, 없다면 -1 을 리턴한다
		System.out.println(number.contains(a));
		System.out.println(number.indexOf(a));
		
		
		System.out.println();
		System.out.println("---------");
		// number 리스트를 비우고, 값을 무작위로 5개만 추가
		number.clear();
		System.out.println(number);
		number.add(78);
		number.add(58);
		number.add(28);
		number.add(90);
		number.add(45);
		System.out.println(number);
		
		
		
		System.out.println();
		System.out.println("---------오름차순");
		// 정렬
		// Collections.sort(); - 오름차순만 가능
		Collections.sort(number);
		System.out.println(number);
		
		System.out.println();
		System.out.println("---------sort(Comparator 를 구현한 객체)");
		// sort(Comparator 를 구현한 객체) : 정렬
		// Comparator 인터페이스를 구현한 구현체를 넣어야 한다 (이 경우 보통 익명클래스를 사용)
		// -> compareTo 메서드를 구현하여 객체를 정령
		// 		- compareTo : 사전 상 앞에 있으면 -1, 같으면 0, 뒤에 있으면 1
		number.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// o1 - o2 = -n : 오름차순		/ o2 - o1 = n : 내림차순
				// 결과가 -면 앞으로 보내고, +면 뒤로 보내는 역할 
				return o2 - o1;
			}
		});
		
		System.out.println(number);
		
		
	}

}
