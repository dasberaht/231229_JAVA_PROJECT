package day03;

public class While01 {

	public static void main(String[] args) {
		/* while문 
		 * while문은 횟수가 일정치 않을 경우 사용
		 * 
		 * while(조건식) {		// 조건식이 true일 때 반복
		 * 		실행문;
		 * }
		 * 
		 * while문은 실행문 안에 조건식이 바뀔 수 있는 증감식이 있어야 가능
		 * 
		 */

		//for문으로 1~10까지 출력
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " "); 
		}
		
		System.out.println();
		
		// while로 1부터 10까지 출력
		
		int i = 0;
		while(i < 10) {
			i++;
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//while문으로 1부터 10까지 짝수만을 출력
		
		int o = 1;
		while(o <= 10) {
			o++;
			if(o % 2 == 0) {
				System.out.print(o + " ");
				
			}
		}
		
	}

}
