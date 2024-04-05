package day10;

import java.util.Scanner;

import day08.Method07;

public class 야구게임2 {

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
		
		int comNum[] = new int[3];							//컴퓨터가 생성한 번호의 배열						
		int myNum[] = new int[3];							//사용자가 입력한 번호의 배열
		
		//메서드는 다른클래스에서도 불러올 수 있음
		//static 으로 생성했기 때문에 [클래스명.메서드명]으로 호출 가능
		Method07.randomArray(comNum); 						//comNum 의 랜덤 수 중복없이 생성
		Method07.print(comNum);								
		
		
		//static 이 아닐 경우 객체를 생성하여, 객체명으로 메서드명 호출
//		Method07 me = new Method07();
//		me.randomArray(myNum);
//		me.print(myNum);
		
		
		
		
		
		
		System.out.println("컴퓨터 생성번호");
		//컴퓨터 배열 (중복되지 않도록 랜덤 수를 추출)
		for(int i=0; i<comNum.length; i++) {
			comNum[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(comNum[i] == comNum[j]) {
					i--;
					break;
				}
			}
		}
		
		//comNum 결과 체크
		for(int a : comNum) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		while(true) {
			int stk = 0;
			int ball = 0;
			
			//사용자 숫자 입력
			System.out.println("숫자입력");
			String mystr = scan.next();						//숫자를 문자로 받음
			String myNumStr[] = mystr.split("");			//한글자씩 나누어 배열에 저장
			
			for(int i=0; i<myNumStr.length; i++) {
				myNum[i] = Integer.parseInt(myNumStr[i]);
				
			}
//			결과체크
//			for(int a : myNum) {
//				System.out.print(a+" ");
//			}
			
			//숫자 비교
			for(int i=0; i<comNum.length; i++) {
				for(int j=0; j<myNum.length; j++) {
					if(comNum[i] == myNum[j] && i==j) {		
						//값도 같고 자리수도 같다면 스트라이크
						stk++;
					} else if(comNum[i] == myNum[j] && i!=j) {
						ball++;
					}
				}
			}
			
			//결과 출력
			if(stk==0 && ball==0) {
				System.out.println("out");
			} else {
				System.out.println("> " + stk + "s" + ball + "b");
			}
			
			//종료
			if(stk==3) {
				System.out.println("성공, 종료.");
				break;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		

	}

}
