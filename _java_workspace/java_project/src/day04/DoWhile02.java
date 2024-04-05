package day04;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/* 메뉴 구성
		 * do ~ while()문을 많이 사용
		 * 
		 * menu 1. 저장 2. 새로만들기 3. 종료
		 */

		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("--menu--");
			System.out.println("1. 저장 | 2. 새로만들기 | 3. 종료");
			System.out.println(">> menu >>");
			menu = scan.nextInt();
			
			// 실제 기능을 구현하는 처리문
			switch(menu) {
			case 1:
				// 실제 처리기능
				System.out.println("저장합니다.");
				break;
			case 2:
				System.out.println("새로만듭니다.");
				break;
			case 3:
				System.out.println("종료합니다.");
				break;
				default:
					System.out.println("잘못된 메뉴입니다.");
					break;
			}
			
		} while (menu != 3);
		
		System.out.println("프로그램 종료");
		
		
		
		
		scan.close();
		
		
		
	}

}
