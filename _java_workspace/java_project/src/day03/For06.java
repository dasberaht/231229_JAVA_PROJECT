package day03;

public class For06 {

	public static void main(String[] args) {
		/* 배수 : 값을 일정하게 곱해서 나오는 값
		 * 10, 15의 공배수 : 공통된 배수
		 * 10 : 10 20 30 40 50 60 70 ...
		 * 15 : 15 30 45 60 75 ...
		 * 공배수 : 30 60 ...
		 * 최소 공배수 : 30
		 */

		// 1부터 100까지의 공배수를 출력
		// 배수의 값 : if(i % n == 0 && i % n2 == 0) { }
		
		
		int num1 = 10;
		int num2 = 15;
		for(int i = 1; i <= 100; i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		
		for(int i = num1; i <= 100; i = i+num1) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.print(i + " ");
				break;				
			}
		}
		
		
//		for(int i=num1; ; i=i+num1) {
//			if(i % num1 == 0 && i % num2 == 0)
//		최소공배수 공식
		
	}

}
