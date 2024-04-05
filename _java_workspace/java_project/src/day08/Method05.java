package day08;

public class Method05 {

	public static void main(String[] args) {
		/* 
		 * 
		 */
		
	boolean num1 = num(3);
	System.out.println(num1);
	boolean num2 = num(12);
	System.out.println(num2);
	
	// 2부터 100까지의 소수를 출력하고, 소수의 합계를 출력
	System.out.println("[2~100사이의 소수]");
	int sum = 0;
	for(int i = 2; i <= 100; i++) {
		if(num(i)) {							// <= num(i) == true 같다
			System.out.print(i + " ");
			sum += i;
		}
	} 
	System.out.println();
	System.out.println("소수의 합계 : " + sum);
	

	}

	
	/* 정수 하나가 주어지면 이 정수가 소수인지 아닌지 판별(소수 -> true / 소수가 아니면 -> false 를 리턴)
	 * 리턴타입 : boolean (true / false 리턴)
	 * 매개변수 : int num
	 * 메서드명 : isPrime
	 * 
	 */
	
	public static boolean num(int num) {
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
			if(count == 2) {
//				System.out.println(num + " : true");
				return true;
			}
//				System.out.println(num + " : false");
				return false;
			
		
	}
	
	
	
	
	
	
	
}

