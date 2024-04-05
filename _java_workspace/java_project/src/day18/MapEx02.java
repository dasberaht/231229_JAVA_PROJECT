package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class MapEx02 {

	public static void main(String[] args) {
		/* 	[단어장]
		 *  
		 *  단어 5개를 입력 받아(scanner) 콘솔에 출력하는 기능
		 *  
		 *  ---단어장---
		 *  hello : 안녕
		 *  apple : 사과
		 *  orange : 오렌지
		 *  .
		 *  .
		 *  .
		 *  
		 *  값은 map 에 저장 후 출력
		 *  
		 * */

		
		Scanner scan = new Scanner(System.in);
		
		HashMap<String, String> map = new HashMap<String, String>();
		
//		int size = 3;
//		while(map.size() < size) {
//			System.out.println("단어 >");
//			String word = scan.next();
//			System.out.println("의미 >");
//			String mean = scan.next();
//			
//			map.put(word, mean);
//		}
		
		
		
		
//		
//		Iterator<String> it = map.keySet().iterator();
//		while(it.hasNext()) {
//			String word = it.next();
//			String mean = map.get(word);
//			System.out.println(word + " : " + mean);
//		}
		
		
		
		
		System.out.println("[단어장]");
		
		for(int i=0; i<5; i++ ) {
			System.out.println("영어를 입력하세요.");
			String eng = scan.next();
			System.out.println("한글을 입력하세요.");
			String kor = scan.next();
			map.put(eng, kor);
			System.out.println(eng + " : " + kor);
		}
		System.out.println();
		System.out.println("[저장한 단어 목록]");
		for(String word : map.keySet()) {
			System.out.println(word + " : " + map.get(word));
		}
		
		scan.close();
		
		
	}

}
