package day05;

import java.util.Scanner;

public class ForEx01 {

	public static void main(String[] args) {
		/* 소수 : 약수가 1과 자기자신만의 수를 가지는 수
		 * 소수 : 3, 5, 7, 11, 13, 17, 19 ...
		 * 소수의 약수는 ( 1, 나 자신 ) 		//	 (조건)약수의 개수는 2개다.
		 * 
		 * 숫자 하나를 입력받아서 해당 수가 소수인지 아닌지 판별
		 * num = 13
		 * 소수입니다.
		 * num = 12
		 * 소수가 아닙니다.
		 */

		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt();
//		int count = 0;
//		
//		for(int i = 1; i <= num; i++) {
//			if(num % i == 0) {
//				System.out.print(i + " ");
//				count++;
//				}
//			}
//		if(count == 2) {
//			System.out.println();
//			System.out.println(num + "는(은) 소수 입니다.");
//		} else {
//			System.out.println();
//			System.out.println(num + "는(은) 소수가 아닙니다.");
//		}
//		
//		
//		scan.close();
//		
		System.out.println("----------------------------");
		
		// 2~100까지의 소수를 모두 출력
		// 이중 for문
		
		int count = 0;
		
		for(int i = 2; i <= 100; i++) {
			count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			//System.out.println(count);
			if(count == 2) {
				System.out.print(i+ " ");
			}
		}	

		
		
		
		
		
		
		
	}

}
