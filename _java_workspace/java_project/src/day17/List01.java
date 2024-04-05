package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class List01 {

	public static void main(String[] args) {
		/*	하루 일과를 저장하는 list 를 생성
		 * 	출력은 for문 / 향상된for문 / Iterator 각각 사용하여 출력
		 * */
		
		ArrayList<String> daywork = new ArrayList<String>();		// import 단축키 : Crtl + Shift + o
		daywork.add("기상");
		daywork.add("아침");
		daywork.add("출근");
		daywork.add("점심");
		daywork.add("퇴근");
		daywork.add("저녁");
		daywork.add("취침");
		
		System.out.println("↓↓↓↓↓↓↓↓↓ for문");
		for(int i=0; i<daywork.size(); i++) {
			System.out.print(daywork.get(i) + " / ");
		}

		System.out.println();
		System.out.println();
		System.out.println("↓↓↓↓↓↓↓↓↓ 향상된for문");
		
		for(String d : daywork) {
			System.out.print(d + " / ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("↓↓↓↓↓↓↓↓↓ Iterator");
		
		Iterator<String> dw = daywork.iterator();
		while(dw.hasNext()) {
			String dd = dw.next();
			System.out.print(dd + " / ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("↓↓↓↓↓↓↓↓↓ 오름차순 정렬");
		// 정렬
		Collections.sort(daywork);
		System.out.println(daywork);
		
		daywork.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 숫자는 크다/작다를 이용하여 -/+ 값이 출력
				// 문자는 compareTo 메서드를 이용하여 정렬

				// o1.compareTo(o2) : 오름차순 
				return o2.compareTo(o1); 		// 내림차순
			}
			
		});
				System.out.println(daywork);
		
		
		
		
	}	 //main

}
