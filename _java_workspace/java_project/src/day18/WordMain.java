package day18;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		/* 단어장 프로그램
		 * 1. 등록 | 2. 검색 | 3. 수정 | 4. 출력 | 5. 삭제 | 6. 종료
		 * WordManager 클래스 생성하여 메서드 구현 (멤버변수 map)
		 * map을 이용하여 단어 등록
		 * 기본 단어(5가지 등록)
		 * 
		 * main : do~while 반복실행
		 * 
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);

		WordManager wm = new WordManager();
		wm.addWord();	 //기본값 추가
		
		int menu = -1;
		System.out.println("[ 단어장 ]");
		
		do {
			System.out.println("| 1. 등록 | 2. 검색 | 3. 수정 | 4. 출력 | 5. 삭제 | 6. 단어파일출력 | 7. 종료 |");
			System.out.println("메뉴선택 >");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 :	wm.insertWord(scan);
				break;
				
			case 2 :	wm.searchWord(scan);	
				break;
				
			case 3 :	wm.modifyWord(scan);
				break;
				
			case 4 :	wm.printWord(scan);
				break;
				
			case 5 :	wm.removeWord(scan);
				break;
				
			case 6 :	wm.filePrint();
				break;

			case 7 :
				break;
				
				default :
					System.out.println("잘못된 메뉴 입니다.");
					break;
			}
			
		} while(menu!=7);
			System.out.println("프로그램 종료");
		
		
		
		scan.close();
	}

}
