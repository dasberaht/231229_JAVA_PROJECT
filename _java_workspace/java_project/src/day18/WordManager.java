package day18;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class WordManager {

	/* 단어장 프로그램
	 * 1. 등록 | 2. 검색 | 3. 수정 | 4. 출력 | 5. 삭제 | 6. 종료
	 * WordManager 클래스 생성하여 메서드 구현 (멤버변수 map)
	 * map을 이용하여 단어 등록
	 * 기본 단어(5가지 등록)
	 * 
	 * main : do~while 반복실행
	 * 
	 * 
	 * */
	private HashMap<String, String> map = new HashMap<String, String>();
	
	
	public void addWord() {
		map.put("apple", "사과");
		map.put("one", "하나");
		map.put("two", "둘");
		map.put("three", "셋");
		map.put("four", "넷");
	}
	

	//등록
	public void insertWord(Scanner scan) {
		System.out.println("단어");
		String word = scan.next();
		System.out.println("의미");
		String mean = scan.next();
		
		map.put(word, mean);
	}

	//검색
	public void searchWord(Scanner scan) {
		System.out.println("검색 >");
		String word = scan.next();
		if(map.containsKey(word)) {
			System.out.println("검색결과 >");
			System.out.println(word + " : " + map.get(word));
			return;
		}
		System.out.println("검색결과가 없습니다.");
		
	}

	//수정
	public void modifyWord(Scanner scan) {
		//map 은 set 이 없으므로, remove -> put //key 중복 불가
		System.out.println("수정할 단어 >");
		String word = scan.next();
		
		if(map.remove(word)==null) {
			System.out.println("수정할 단어가 없습니다.");
			return;
		}
		System.out.println("의미 >");
		String mean = scan.next();
		map.put(word, mean);
		
//		if(map.containsKey(word)) {
//			System.out.println("의미 >");
//			String mean = scan.next();
//			map.remove(word);
//			map.put(word, mean);
//			return;
//		}
//		System.out.println("단어가 업습니다.");
		
	}

	//출력	
	public void printWord(Scanner scan) {
		Iterator<String> it = map.keySet().iterator();
		int count = 0;
		while(it.hasNext()) {
			String word = it.next();
			String mean = map.get(word);
			count++;
			System.out.println(count + ") " +word + " : " + mean);	
			
		}
		
	}
	
		

	public void removeWord(Scanner scan) {
		System.out.println("삭제 >");
		String word = scan.next();
		String result = map.remove(word);
		if(result == null) {
			System.out.println("삭제할 단어가 없습니다.");
			return;
					
		}
		System.out.println("삭제완료");
		
	}
	
	
	public void filePrint() throws IOException {
		/* StringBuffer 객체
		 * .append : 기존 String 에 데이터 추가
		 * */
		
		FileWriter wf = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(wf);
		
		StringBuffer sb = new StringBuffer();
		// sb.append : 기존 String 에 데이터 추가
		String data = null;
		sb.append("단어장");
		sb.append("\r\n");	// 줄바꿈
		
		for(String key : map.keySet()) {
			sb.append(key + " " + map.get(key));
			sb.append("\r\n");
		}
		
		data = sb.toString();	//StringBuffer 객체이므로, String 객체로 변환
		System.out.println(data);
		bw.write(data);
				
		if(bw != null) {
			bw.close();
		}
		
	}
	
		
	
	
}
