package day03;

public class For02 {

	public static void main(String[] args) {
		/* 1부터 10까지 출력
		 * 
		 */

		for(int i = 1; i <= 10; i++) {
		System.out.print(i + " ");
		}

		System.out.println();
		
		for(int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
	
		System.out.println();
		
		/* 1부터 10까지 짝수만 출력
		 * 
		 */
		
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			} 
		}

		
		System.out.println();
		
		/* 1~10까지 합계
		 * 
		 */
		
//		int i = 0;
//		int s = i + 0; // 지역변수는 반드시 초기화 - 초기화 기본값은 숫자=0 / 문자=null
//		for(i=1; i<=10; i++) {
//		s += i;	
//		}
//		System.out.println(s);
		
		
		/* 1~10 까지의 짝수합과, 홀수합을 출력
		 * 
		 */

		int sum_even = 0;
		int sum_odd = 0;
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {
				sum_even += i;
			} else {
				sum_odd += i;
			}
		}
		System.out.println("짝수 합 : " + sum_even);
		System.out.println("홀수 합 : " + sum_odd);
		
		

		
		
		
		
		
		
		
//		*로 직삼각형을 만들기
//		for(int i = 1; i <= 10; i++) {
//			switch(i) {
//			case 1
//			}
//			
//		}
		
					
	}

}
