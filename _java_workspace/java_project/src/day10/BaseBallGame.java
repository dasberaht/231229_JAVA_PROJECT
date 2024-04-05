package day10;

import java.util.Scanner;

import day08.Method07;

public class BaseBallGame {
	
//	int apple = 0; //멤버변수;

	public static void main(String[] args) {
		/* 야구게임을 메서드화
		 * 사용자번호는 직접입력
		 * 번호는 랜덤 생성 (1~9, 중복X)
		 * 중복안되게 하는 메서드 isContain 호출하여 사용
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		int s=0, b=0;

//		createArray(comNum);
		createArrayRandom(comNum, 9, 1);
		Method07.print(comNum);
		
		//사용자 번호 입력
		while(s!=3) {
			System.out.println("myNum 3개 입력 >");
			int cnt=0;
			
			while(cnt<3) {
				myNum[cnt] = scan.nextInt();
				cnt++;
			}
			
			//결과 출력
			s = strike(comNum, myNum);
			b = ball(comNum, myNum);
			
			if(s!=0) {
				System.out.println(s+"S ");
			}
			if(b!=0) {
				System.out.println(b+"B ");
			}
			if(s==0 && b==0) {
				System.out.println("OUT");
			}
		}
		System.out.println("정답, 종료.");
		
			
		scan.close();

		
		
		
		
		}
		
		
		
		

		
		
		
		

		
	
	
	//랜덤으로 배열을 중복되지 않게 생성
	//Method07 의 isContain 을 가져와서 사용
	
	//컴퓨터 배열생성
	public static void createArray(int arr[]) {
		int cnt=0;
		while(cnt<arr.length) {
			int r=(int)(Math.random()*9)+1;
			if(!Method07.isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}
	
	
	//랜덤 범위에 상관없이 랜덤수를 채우는 메서드
	//범위를 매개변수로 받아오면 가능
	//int r=(int)(Math.random()*개수)+시작값;
	//start / count 를 매개변수로 받아 범위를 생성
	
	public static void createArrayRandom(int arr[], int start, int count) {
		int cnt=0;
		while(cnt<arr.length) {
			int r=(int)(Math.random()*start)+count;
			if(!Method07.isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}
	
	
	//스트라이크 개수를 카운트하는 메서드
	//return
	//comNum, myNum 을 주고 '번호'와 '위치'가 일치하면 count 하는 메서드
	//리턴타입 : int count 를 리턴

	public static int strike(int com[], int my[]) {
		int cnt = 0;
		for(int i=0; i<com.length; i++) {
			if(com[i] == my[i]) {						//i와  j를 별도로 나눌 필요 없음 - 같은 위치(index)를 의미함
				cnt++;
			}
		}
		
	return cnt;	
	}
	
	
	//볼 개수를 카운트하는 메서드
	//comNum, myNum 을 주고 '번호만' 일치하면 count 하는 메서드
	//리턴타임 : int count 를 리턴
	
	public static int ball(int com[], int my[]) {
		int cnt = 0;
		for(int i=0; i<com.length; i++) {
			if(Method07.isContain(my, com[i])) {
				cnt++;									//ball + strike 개수를 같이 체크
			}
		}	
	return cnt - strike(com, my);	
	}
	
	

}
