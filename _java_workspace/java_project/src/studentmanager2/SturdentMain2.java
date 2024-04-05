package studentmanager2;

import java.util.Scanner;

public class SturdentMain2 {

	public static void main(String[] args) {
		
		//메뉴 처리
		
//		- StudentMain class : 객체를 생성하고 화면에 출력하는 클래스	
//		  (do~while문을 사용하여 반복적으로 메뉴를 실행)
//
//		- menu : 1. 학생등록 | 2. 학생리스트 | 3. 학생검색(학생정보&수강정보)
//	           | 4. 수강신청 | 5. 수강철회 | 6. 종료
		
		
		//객체를 생성하는 것은 항상 미리 해놓고 메서드 호출
		
		Scanner scan = new Scanner(System.in);
		
		//manager를 호출하기 위한 객체
		StudentManager2 sm = new StudentManager2();
		
		int menu = 0;
		
		do {
			//메뉴넣기
			System.out.println("***menu***");
			System.out.println("1. 학생등록 | 2. 학생리스트 | 3. 학생검색(학생정보&수강정보)\r\n"
							+  "4. 수강신청 | 5. 수강철회 | 6. 종료");
			System.out.println(">> 메뉴선택 >");
			
			menu = scan.nextInt();
			
			//메뉴에 따른 분기 구현
			switch(menu) {
			case 1 : sm.insertStudent(scan);
				break;
			case 2 : sm.printStudent();
				break;
			case 3 : sm.searchStudent(scan);
				break;
			case 4 : sm.registerSubject(scan);
				break;
			case 5 : sm.deleteSubject(scan);
				break;
			case 6 :
				break;
				default :
					System.out.println("잘못된 메뉴입니다.");
			}
			
		} while(menu != 6);
			System.out.println("종료");
			
		
		scan.close();
	
		
	}

}
