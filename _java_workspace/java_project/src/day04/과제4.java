package day04;

import java.util.Scanner;

public class 과제4 {

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
		
		Scanner scan = new Scanner(System.in);
		
		int random = 0;									//주사위 값(랜덤수)를 저장할 변수
		int sum = 0;									//거리 누적 값
		int count = 0;									//주사위 던진 횟수 누적
		int last = 30;									//최종 목표 이동 수
		
		System.out.println("게임시작");
		
		while(sum < last) {								//거리 누적값이 최종 목표 값보다 적다면 계속 실행
			scan.nextLine();							//enter를 이용하여 주사위를 던지는 역할
			random = (int)(Math.random()*6)+1;			//1~6까지 랜덤 수 저장
			//발생값 거리 합산
			sum += random;
			count++;
			System.out.println("주사위 : " + random);
			System.out.println(random + "칸 전진 -> " + (last - sum) + "칸 남았습니다.");
		}
		System.out.println("도착, 총 이동횟수 : " + count);
		
		scan.close();

	}

}
