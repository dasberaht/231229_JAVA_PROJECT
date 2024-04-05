package day04;

public class For07 {

	public static void main(String[] args) {
		/* 이중 For문
		 * 
		 * for(int i = 1; i <= 5; i++ {			// i = 1,		2,		3 ...
		 * 	for(int j = 1; j <= 5; j++) {		// j = 1~5, 	1~5,	1~5 ...
		 * 		실행문;							// 실행문이 5번씩 5번 총 25번 실행 
		 * 		}
		 * }
		 * 
		 * 별 찍기
		 * *****	i = 1	:	j = 5
		 * *****	i = 2	:	j = 5
		 * *****	i = 3	:	j = 5
		 * *****	i = 4	:	j = 5
		 * *****	i = 5	:	j = 5
		 */

		for(int i = 1; i <= 5; i++) {			// 줄
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();				// 한 줄 끝나면 줄 바꿈 실행
		}
		
		System.out.println("===========================================");
		
		/* *		i=1	j=1
		 * **		i=2	j=2
		 * ...
		 * *****	i=5	j=5
		 */
		
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++ ) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===========================================");
		
		/* *****	i=1, j=5
		 * ****		i=2, j=4
		 * ***		i=3, j=3
		 * **		i=4, j=2
		 * *		i=5, j=1
		 */
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 5; j >= i; j--) {			// int j=1; j<=6-i; j++
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("===========================================");
		
		/*      *		i=1,	o=4,	j=1		o는 공백
		 *     **		i=2,	o=3,	j=2
		 *    ***		...
		 *   ****		...
		 *  *****		i=5,	o=1,	j=5
		 */
		
		for(int i = 1; i <= 5; i++) {
			//
			for(int o=1; o<=5-i; o++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		
		System.out.println("===========================================");
		
		/*      *
		 *     ***
		 *    *****
		 *   *******
		 *  *********
		 */
		
		
		for(int i = 1; i <= 5; i++) {
			//
			for(int o=1; o<=5-i; o++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=i+i-1; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		
		System.out.println("===========================================");
		
		/* 1 2 3 
		 * 4 5 6
		 * 7 8 9
		 * 3줄씩 3개 출력
		 */
		
		int cnt = 0;
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				cnt++;
				System.out.print(cnt + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		}
}
