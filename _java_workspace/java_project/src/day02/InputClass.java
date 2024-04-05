package day02;

import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		/* 콘솔 입력 : 콘솔에서 값을 입력받는 것을 의미
		 * Scanner 클래스 : 콘솔에서 값을 입력받을 수 있게 해주는 클래스
		 * 
		 */

		Scanner scan  = new Scanner(System.in); // scan 은 객체명으로 자유롭게 선언 가능
		// Scanner 선언 후 클릭하여 import 설정 필수
		
		System.out.println("숫자(정수)를 입력해주세요.");
		int num = scan.nextInt(); // console의 숫자를 입력받을 때 사용
		System.out.println("내가 입력한 수 : "+ num);
		
		if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		System.out.println("=====================");
		System.out.println("실수입력 > ");
		double num2 = scan.nextDouble();
		System.out.println("내가 입력한 수 : "+ num2);
		
		
		System.out.println("=====================");
		System.out.println("한 글자 입력 > ");
		//문자열 입력 : next() 사용 (공백을 포함하지 않음) **
		//한 글자만 입력 : charAt(index) : 문자열 중 index 번지의 한 글자를 추출 **
		//- index의 번지는 0부터 시작
		char ch = scan.next().charAt(0);
		System.out.println("내가 입력한 글자 : "+ ch);
		
		System.out.println("=====================");
		System.out.println("한 단어 입력 > ");
		String s = scan.next();
		System.out.println("내가 입력한 단어 : "+ s);
	
		System.out.println("=====================");
		
		scan.nextLine(); // 위에서 입력한 enter(공백)처리용 **
		
		//여러 단어 출력 : scan.nextLine(); 사용 (공백을 포함)
		String str = scan.nextLine();
		System.out.println("내가 입력한 여러 단어 : "+ str);
		
		
		
		scan.close();
		
		
	}

}
