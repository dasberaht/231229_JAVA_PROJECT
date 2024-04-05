package studentmanager;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
//		- StudentMain class : 객체를 생성하고 화면에 출력하는 클래스	
//		  (do~while문을 사용하여 반복적으로 메뉴를 실행)
//
//			- menu : 1. 학생등록 | 2. 학생리스트 | 3. 학생검색(학생정보&수강정보)
//			 | 4. 수강신청 | 5. 수강철회 | 6. 종료

		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
				
		StudentManager stm = new StudentManager();
		
		System.out.println("[학생 및 수강 관리]");
		System.out.println("아래의 메뉴를 선택해주세요.");
		do {
			System.out.println("1. 학생등록 | 2. 학생리스트 | 3. 학생검색\r\n"
							 + "4. 수강신청 | 5. 수강철회 | 6. 종료");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 : 
				System.out.println("학생등록 >");
				stm.insertStudent(scan);
				break;
				
			case 2 :
				System.out.println("학생리스트 >");
				stm.printStudent();
				break;
				
			case 3 :
				System.out.println("학생검색 >");
				stm.searchStudent(scan);
				break;
				
			case 4 :
				System.out.println("수강신청 >");
				stm.registerSubject(scan);
				break;
				
			case 5 :
				System.out.println("수강철회 >");
				stm.deleteSubject(scan);
				break;
				
			case 6 :
				break;
				
				default : 
					System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		
			
		} while(menu!=6);
		System.out.println("종료합니다.");

		
		scan.close();
	}


}
