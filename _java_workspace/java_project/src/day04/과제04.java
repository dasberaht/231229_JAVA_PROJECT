package day04;

import java.util.Scanner;

public class 과제04 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동
		 * 주사위는 랜덤으로 생성(1~6)
		 * 주사위 : 3
		 * 3칸 전진 -> 27칸 남았습니다.
		 * 주사위 : 1
		 * 1칸 전진 -> 26칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 전진 -> 20칸 남았습니다.
		 * ...
		 * 도착 (총 이동 횟수 : n번)
		 */

		
		Scanner ran = new Scanner(System.in);
		
		int dice = 0;				// 
		int rrr = 0;				// 주사위 수
		int count = 0;				// 이동 횟수
		
		System.out.println("[주사위 게임]");
		System.out.println("게임을 시작합니다.");
		
		do { 

			System.out.println("Enter를 눌러 주사위를 굴리세요.");
			ran.nextLine();
			int random = (int)(Math.random()*6)+1;
			rrr = random + rrr;
			count++;
			dice = 30 - rrr;
			
			if(rrr < 0) {
				
			} else {
				System.out.println("주사위 : " + random);
				System.out.println(random + "칸 전진 -> " + dice + "칸 남았습니다.");
			}
					
		} while (rrr <= 30);
			System.out.println("종료 (총 이동 횟수 :  " + count + "번)");
		
		
		
		
		ran.close();
		
		
	}

}
