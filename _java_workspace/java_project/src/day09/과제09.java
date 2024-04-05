package day09;

import java.util.Scanner;

public class 과제09 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성 ( 각 자리 수는 1부터 9까지의 수 ) => 배열로 저장 / 중복 불가능
		 * 유저는 3자리의 숫자를 맞추는 게임 => 직접 입력(중복 X)
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 일치하면 ball
		 * 아무것도 맞지 않으면, out
		 * ex) 컴퓨터 생성번호 : 1 2 3
		 *     사용자 입력번호 : 1 7 8		=> 1S
		 *     사용자 입력번호 : 1 3 2		=> 1S 2B
		 *     사용자 입력번호 : 7 8 9		=> OUT
		 *     사용자 입력번호 : 1 2 3		=> 3S 정답
		 * 정답까지 반복     
		 * 메서드 분리 상관X
		 */

	Scanner scan = new Scanner(System.in);
	System.out.println("[야구 게임]");
	System.out.println("> 게임을 시작합니다.");
	System.out.println("> 컴퓨터 생성번호");

	int com[] = new int[3];		//컴퓨터
	int user[] = new int[3];	//사용자
	int strike = 0;
	int ball = 0;
	
	//컴퓨터 랜덤값
	for(int i=0; i<com.length; i++) {
		com[i] = (int)(Math.random()*9)+1;
		for(int j=0; j<i; j++) {
			if(com[i] == com[j]) {
				i--;
					break;
			}
		}
	}
	for(int i : com) {
		System.out.print("["+i+"] ");
	}

	System.out.println(); //줄바꿈
	System.out.println("> 사용자 입력번호");
	//사용자 입력값
	while(true) {
		for(int i=0; i<user.length; i++) {

			user[i] = scan.nextInt();
			
			for(int j=0; j<i; j++) {
				if(user[i]==user[j]) {
					i--;
					System.out.println("중복된 값입니다.");
					break;
				}
			}
		}
		
	//컴퓨터/사용자 비교
	for(int i=0; i<com.length; i++) {
		for(int j=0; j<user.length; j++) {
			if(com[i] == user[j] && i == j) {
				strike++;
			} else if(com[i] == user[j] && i!=j) {
				ball++;
			}
		}
	}

	
	if(strike == 3) {
		System.out.println(strike + "S" + " 정답");
		break;
	} else {
		if(strike == 0 && ball ==0) {
			System.out.println("OUT");
		} else {
			System.out.println(strike + "S" + " / " + ball + "B");
		}
		strike = 0;
		ball = 0;

	}

	
	}
	


	
	scan.close();

	
	
		
		
		
		
	}

}