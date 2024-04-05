package day07;

public class Method02 {

	
	// 메서드 선언위치
	
	
	public static void main(String[] args) {
		/* 연산 + - * / % 메서드를 생성
		 * main에서 호출하여 확인
		 */

		
//		Scanner scan = new Scanner(System.in);
		
		int sum = sum(5, 3);
		System.out.println(sum);
		int sub = sub(5, 3);
		System.out.println(sub);
		int mul = mul(5, 3);
		System.out.println(mul);
		double div = div(5, 3);
		System.out.println(div);
		int mod = mod(5, 3);
		System.out.println(mod);
		
//		scan.
		
		
	}

		//	메서드 선언위치
	
		//	두 정수의 합을 알려주는 메서드 sum
			public static int sum(int num1, int num2) {
				return num1 + num2;
			}
		//	두 정수의 차를 알려주는 메서드 sub
			public static int sub(int num1, int num2) {
				return num1 - num2;
			}	
		//	두 정수의 곱를 알려주는 메서드 mul
			public static int mul(int num1, int num2) {
				return num1 * num2;
			}	
		//	두 정수의 나눗셈을 알려주는 메서드 div
			public static double div(int num1, int num2) {
				return num1 / (double)num2;
			}
		//	두 정수의 나머지를 알려주는 메서드 mod
			public static int mod(int num1, int num2) {
				return num1 % num2;
			}	
	
}
