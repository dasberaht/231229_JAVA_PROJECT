package day03;

public class For05 {

	public static void main(String[] args) {
		/* 약수 : 1부터 자기자신까지 나누어서 떨어지는(0) 수가 약수
		 * 6의 약수 : 6%1=0, 6%2=0, 6%3=0, 6%4=2, 6%5=1, 6%6=0
		 * 6의 약수 : 1, 2, 3, 6
		 * 12의 약수 : 1, 2, 3, 4, 6, 12
		 * 
		 * 두 수(6, 12)의 공약수(공통된 약수) : 1, 2, 3, 6
		 * 
		 * 그 공약수 중 가장 큰 값은 최대공약수 : 6
		 */
	
		int num1 = 6;
		int num2 = 12;
		int i = 1;
		int a = 0;
		for(i = 1; i <= num2; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				a = i;
			}
		}
		
		System.out.println(a);
		
		// break;
		/* 반복문에서 조건이 맞다면 반복문을 빠져나오는 역할
		 *  
		 */
		
		for(int t = num1; ; t--) {
			if(num1 % t == 0 && num2 % t == 0) {
				System.out.println(t);
				break;
			}
		}
		
		// break; 는 중첩 for문일 경우 나를 감싸고 있는 for문을 벗어남
		
		int e = 0;
		m: for(;;) {
			for(;;) {
				for(;;) {
					e++;
					if(e==10) {
						System.out.println(e);
						break m;
					}
				}
			}
		}
		
		
		
	}

}
