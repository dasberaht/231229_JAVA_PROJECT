package day04;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/* 숫자 2개를 입력받고,
		 * num1 = 5 / num2 = 3
		 * menu
		 * 1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료
		 * menu에 따라서 두 수의 연산 결과를 출력
		 * 1. 5 + 3 = 8
		 * 2. 5 - 2 = 3
		 * ...
		 * 6. 종료.
		 * 다른 번호는 잘못된 메뉴로 출력
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("[계산기]");

		System.out.println("숫자(1)를 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("숫자(2)를 입력하세요.");
		int num2 = scan.nextInt();
		int menu = 0;
		
		
		do {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1 :
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); 
				break;
			case 2 :
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case 3 :
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case 4 :
				if(num2 == 0) {
					System.out.println("잘못된 숫자(2)입니다. 다시 입력해주세요.");
					System.out.println(num2 = scan.nextInt()); // sysout 생략 가능 **
					System.out.println(num1 + " / " + num2 + " = " + (num1 / num2*0.1));
				} else {
					System.out.println(num1 + " / " + num2 + " = " + (num1 / num2*0.1));
				} // else 생략 가능**
				break;
			case 5 :
				if(num2 == 0) {
					System.out.println("잘못된 숫자(2)입니다. 다시 입력해주세요.");
					System.out.println(num2 = scan.nextInt());
				
				} 
					System.out.println(num1 + " % " + num2 + " = " + (num1 % num2*0.1));
				
				break;
			case 6 :
				System.out.println("종료");
				break;
				default :
					System.out.println("잘못된 메뉴입니다.");
					break;
			}
		} while(menu != 6);
			
			
				
		
		scan.close();
		
		
		
		
	}

}
