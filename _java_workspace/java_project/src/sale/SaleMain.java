package sale;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		/* menu
		 * | 1. 메뉴추가 | 2. 메뉴삭제 | 3. 메뉴수정(가격수정) | 
		 * | 4. 메뉴보기(전체메뉴출력) | 5. 주문 | 6. 주문내역출력(영수증) | 
		 * | 7. 종료 | 
		 * 
		 * */

		
		Scanner scan = new Scanner(System.in);
		
		SaleManager sm = new SaleManager();
		sm.addMenu();
		int menu = -1;
		
		System.out.println("[메뉴/주문 프로그램]");
		do {
			System.out.println("| 1. 메뉴추가 | 2. 메뉴삭제 | 3. 메뉴수정(가격) |");
			System.out.println("| 4. 메뉴보기 | 5. 주문　　 | 6. 주문내역출력   |");
			System.out.println("| 7. 종료　　 |");
			System.out.println("선택 >");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 : sm.addmenu(scan);
				break;
			case 2 : sm.delmenu(scan);
				break;
			case 3 : sm.modmenu(scan);
				break;
			case 4 : sm.printmenu();
				break;
			case 5 : 
				System.out.println("메뉴 >");
				String name = scan.next();
				System.out.println("수량 >");
				int count = scan.nextInt();
				sm.orderpick(name, count); 
				
//				sm.order(scan);
				break;
			case 6 : sm.printorder();
				break;
			case 7 : 
				break;
			default : System.out.println("*잘못된 메뉴");	
				break;
			}
			
		} while(menu!=7);
			System.out.println("*프로그램 종료");
		
			
		scan.close();
		
		
	}

}
