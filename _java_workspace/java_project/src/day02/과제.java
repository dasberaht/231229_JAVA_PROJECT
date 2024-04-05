package day02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 정수 2개와 연산자 1개를 입력받아 두 정수의 연산을 출력
		 * ex) 2 3 + => 2 + 3 => 5
		 * ex) 5 1 - => 5 - 1 => 4
		 * 연산자는 + - * / %
		 * 다른 종류의 연산자가 들어오면 '잘못된 연산자'로 출력
		 */

		// 연산자 = char(기본자료형) '==' 연산자로 비교가능 / String(객체) '==' 비교불가능
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자(정수)를 입력해주세요.");
		int num1 = scan.nextInt();
		System.out.println("다음 숫자(정수)를 입력해주세요.");
		int num2 = scan.nextInt();
		
		System.out.println("연산자를 입력해주세요.");
		char op = scan.next().charAt(0); //한 글자 받기
		
		int a = num1;
		int b = num2;
		// double c =  num1 / (double)num2; ** 
		// int d = num1 % num2; **
		
		// 연산자가 /, % 일 경우 num2가 0이되면 안내문구 띄우기 ('숫자(정수)를 다시 입력해 주세요')
				
		switch(op) {
		case '+' :
			System.out.println("" + num1 + op + num2 + "=" + (num1+num2)); // ""를 포함시킴으로써 num1을 문자로 인식(char가 숫자코드로 변환되기 때문)
			break;
		case '-' :
			System.out.println("" + num1 + op + num2 + "=" + a);
			break;		
		case '*' :
			System.out.println("" + num1 + op + num2 + "=" + b);
			break;
		case '/' :
			if(num2 == 0) {
				System.out.println("숫자(정수)를 다시 입력해 주세요.");
			} else {
			System.out.println("" + num1 + op + num2 + "=" + num1 / (double)num2);
			}
			break;
		case '%' :
			if(num2 == 0) {
				System.out.println("숫자(정수)를 다시 입력해 주세요.");
			} else {
			System.out.println("" + num1 + op + num2 + "=" + num1 % (double)num2);
			}
			// System.out.println("" + num1 + op + num2 + "=" + d);
			break;
		default :
			break;
		}
		
//		if ( (op == '/' || op == '%') && num == 0) { 
//		int a = num1;
//		int b = num2;
////		double c =  num1 / (double)num2;
////		int d = num1 % num2;
//		System.out.println("잘못된 연산자입니다.");
//		} else
//		// 연산자가 /, % 일 경우 num2가 0이되면 안내문구 띄우기 ('숫자(정수)를 다시 입력해 주세요')
//				
//		switch(op) {
//		case '+' :
//			System.out.println("" + num1 + op + num2 + "=" + (num1+num2)); // ""를 포함시킴으로써 num1을 문자로 인식(char가 숫자코드로 변환되기 때문)
//			break;
//		case '-' :
//			System.out.println("" + num1 + op + num2 + "=" + a);
//			break;		
//		case '*' :
//			System.out.println("" + num1 + op + num2 + "=" + b);
//			break;
//		case '/' :
//			if(num2 == 0) {
//				System.out.println("숫자(정수)를 다시 입력해 주세요.");
//			} else {
//			System.out.println("" + num1 + op + num2 + "=" + num1 / (double)num2);
//			}
//			break;
//		case '%' :
//			//			System.out.println("" + num1 + op + num2 + "=" + num1 % (double)num2);
//
//			// System.out.println("" + num1 + op + num2 + "=" + d);
//			break;
//		default :
//			break;
//		}
//		
		scan.close();
		
		/* 변수 먼저
		 * if((op=='/' || op=='%') && num2 == 0) {
		 * sysout~~~~~('숫자(정수)를 다시 입력해 주세요.); }
		 * else { case ~~~~~~~~~~ } 
		 */
		
		
		
		
	}

}
