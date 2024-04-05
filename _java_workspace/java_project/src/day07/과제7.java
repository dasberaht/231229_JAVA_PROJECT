package day07;

import java.util.Scanner;

public class 과제7 {

	public static void main(String[] args) {
		/* 계산기 만들기
		 * menu
		 * 1.덧셈 | 2.뺄셈 | 3.곱셈 | 4. 나눗셈 | 5. 나머지 | 6.종료
		 * >> 메뉴선택
		 * >> 숫자1 : 5
		 * >> 숫자2 : 10
		 * 결과 : 5+10=15
		 * (더하기 메서드를 호출하여 연산결과를 출력)
		 */

		Scanner scan = new Scanner(System.in);
		int cal = 0;
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("[계산기]");
		
		do {

			System.out.println("아래의 메뉴를 선택하세요.");
			System.out.println("|  1.덧셈  |  2.뺄셈  |  3.곱셈  |  4. 나눗셈  |  5. 나머지  |  6.종료  |");
			cal = scan.nextInt();
			
			System.out.println("숫자를 입력하세요");
			System.out.println("숫자(1)");
			num1 = scan.nextInt();
			System.out.println("숫자(2)");
			num2 = scan.nextInt();
			
			switch(cal) {
			case 1 :
//				System.out.println("숫자를 입력하세요");
//				System.out.println("숫자(1)");
//				num1 = scan.nextInt();				
//				System.out.println("숫자(2)");
//				num2 = scan.nextInt();
				
//				int sum = sum(num1, num2);
				
				sum(num1, num2);
//				System.out.println("결과 : " + num1 + " + " + num2 + " = " + sum);
				break;

			case 2 :
//				System.out.println("숫자를 입력하세요");
//				System.out.println("숫자(1)");
//				num1 = scan.nextInt();				
//				System.out.println("숫자(2)");
//				num2 = scan.nextInt();
				
//				int sub = sub(num1, num2);
				
				sub(num1, num2);
//				System.out.println("결과 : " + num1 + " - " + num2 + " = " + sub);
				break;

			case 3 :
//				System.out.println("숫자를 입력하세요");
//				System.out.println("숫자(1)");
//				num1 = scan.nextInt();				
//				System.out.println("숫자(2)");
//				num2 = scan.nextInt();
//				
//				int mul = mul(num1, num2);
				
				mul(num1, num2);
//				System.out.println("결과 : " + num1 + " * " + num2 + " = " + mul);
				break;

			case 4 :
//				System.out.println("숫자를 입력하세요");
//				System.out.println("숫자(1)");
//				num1 = scan.nextInt();				
//				System.out.println("숫자(2)");
//				num2 = scan.nextInt();
//				
//				double div = div(num1, num2);
				div(num1, num2);
//				System.out.println("결과 : " + num1 + " / " + num2 + " = " + div);
				break;
				
			case 5 :
//				System.out.println("숫자를 입력하세요");
//				System.out.println("숫자(1)");
//				num1 = scan.nextInt();				
//				System.out.println("숫자(2)");
//				num2 = scan.nextInt();
//				
//				int mod = mod(num1, num2);
				
				mod(num1, num2);
//				System.out.println("결과 : " + num1 + " % " + num2 + " = " + mod);
				break;				
				
			case 6 :
				System.out.println("종료합니다.");
				break;
				
				default :
					System.out.println("오류!!");
					System.out.println("오류!!");
					System.out.println("오류!!");
					System.out.println("오류!!");
					System.out.println("오류!!");
			}
			
		} while(cal != 6);
		System.out.println();
		System.out.println("[프로그램 종료]");
	
	
		scan.close();
		
		
	}

	

	public static void sum(int num1, int num2) {
//		return num1 + num2;
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	public static void sub(int num1, int num2) {
//		return num1 - num2;
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}	
	public static void mul(int num1, int num2) {
//		return num1 * num2;
		System.out.println(num1+"*"+num2+"="+(num1*num2));
	}	
	public static void div(int num1, int num2) {
//		return num1 / (double)num2;
		System.out.println(num1+"/"+num2+"="+(num1/(double)num2));
	}
	public static void mod(int num1, int num2) {
//		return num1 % num2;
		System.out.println(num1+"%"+num2+"="+(num1%num2));
	}	
	
	
}
