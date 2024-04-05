package std;

import java.util.Scanner;

public class StdMain {

	public static void main(String[] args) {
		/*	메뉴구성
		 * 	| 1. 학생추가 | 2. 학생리스트 | 3. 학생검색 | 4. 학생수정 | 5. 학생삭제 | 6. 점수추가 | 7. 점수수정 | 8. 점수삭제 | 9. 종료 |
		 */

		Scanner scan = new Scanner(System.in);
		StdManager stdm = new StdManager();
		
		int menu = -1;
		
			System.out.println("[학생관리프로그램]");
		do {
			System.out.println("-----------------------------------------------");
			System.out.println("| 1. 학생추가 | 2. 학생리스트 | 3. 학생검색 | 4. 학생수정 | 5. 학생삭제 | 6. 점수추가 | 7. 점수수정 | 8. 점수삭제 | 9. 종료 |");
			System.out.println("메뉴 선택 >");
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1 :	stdm.addStd(scan);		break;
			case 2 :	stdm.printStd();		break;
			case 3 :	stdm.searchStd(scan);	break;
			case 4 :	stdm.modStd(scan);		break;
			case 5 :	stdm.delStd(scan);		break;
			case 6 :	stdm.addSub(scan);		break;
			case 7 :	stdm.modSub(scan);		break;
			case 8 :	stdm.delSub(scan);		break;
			case 9 :	break;
			default :	System.out.println("잘못된 메뉴입니다.");	break;
			
			}
			
		} while(menu!=9);
			System.out.println("[프로그램 종료]");
		
		
		
		
		
		scan.close();
	}

}
