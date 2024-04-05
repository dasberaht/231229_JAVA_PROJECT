package day08;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/* 정수 (2~9 중 하나)에 해당하는 구구단 출력 메서드
		 * 매개변수 : 2
		 * 리턴타입 : void -> 리턴 없음
		 * 
		 */
		
		System.out.println("[구구단]");
		System.out.println("숫자(정수)를 입력하세요.");
		
//		mul(1);
		
		Scanner scan = new Scanner(System.in);		
		int num = scan.nextInt();
		mul(num);
		
		scan.close();
		

	}

	
	public static void mul(int num) {
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
			
		}
			
	}
	
	
	
}
