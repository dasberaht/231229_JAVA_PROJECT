package day07;

import java.util.Scanner;

public class StringEx02 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때,
		 * 검색어를 입력하면 해당 단어를 포함하는 파일을 출력
		 */
		
		// ex : java => 이것이자바다.java / java의정석.java 출력
		// ex : String => String.jpg / String 메서드.txt 출력
		// ex : txt => String 메서드.txt / array.txt 출력
		// 찾고자하는 단어가 없는 경우 : 겁색결과가 없습니다. 출력
		
		String[] fileName = {"이것이자바다.java", "java의정석.java", "String.jpg","String 메서드.txt", "array.txt"};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("검색");
		String name = scan.next();
		int c = 0;
		
		for(int i = 0; i < fileName.length; i++) {
			if(fileName[i].contains(name)) {
				System.out.println(fileName[i]);
				c++;
			}
		}
		if(c==0) {
			System.out.println("검색결과가 없습니다.");
		}



		
		
		scan.close();
		
		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("검색어를 입력해주세요.");
//		String s = scan.next();
//		
//		int count = 0;
//		System.out.println("검색어 : "+s);
//		for(String tmp : fileName) {
//			if(tmp.contains(s)) {
//				System.out.println(tmp);
//				count++;
//			}
//		}
//		if(count==0) {
//			System.out.println("검색결과가 없습니다.");
//		}
//		
//		
//		
//		scan.close();
		
		
		
		

	}


}