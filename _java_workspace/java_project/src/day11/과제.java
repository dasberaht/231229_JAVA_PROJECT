package day11;

public class 과제 {

	public static void main(String[] args) {
		/* 메서드를 이용하여 작업
		 * 두 정수의 값이 주어졌을 때 두 정수 사이의 모든 정수의 합을 리턴하는 메서드
		 * ex) a = 3, b = 5 -> 3 + 4 + 5
		 * ex) a = 5, b = 1 -> 1 + 2 + 3 + 4 + 5
		 * ex) a = 3, b = 3 -> 3
		 * 
		 */
		
		과제 m = new 과제();
		System.out.println(m.sum(3, 5));
		System.out.println(m.sum(5, 1));
		System.out.println(m.sum(3, 3));
		System.out.println(m.sum2(3, 5));
		System.out.println(m.sum2(5, 1));
		System.out.println(m.sum2(3, 3));
		System.out.println(m.sum3(3, 5));
		System.out.println(m.sum3(5, 1));
		System.out.println(m.sum3(3, 3));

	}

	
	public int sum(int num, int num1) {
		int a = 0;
		
		if(num < num1) {
			for(int i = num; i<=num1; i++) {
				a += i;
			}
		} else if(num > num1) {
			for(int j = num1; j<=num; j++) {
				a += j;
			} 
		} else if(num==num1) {
			a = num;
		}
		
		return a;
		
	}
	
	
	
	// 1. 들어가는 값(매개변수), 나오는 값(리턴 값)
	// 매개변수 : int a, int b
	// 리턴타입 : sum(합)(int)
	public int sum2(int a, int b) {
		int sum2 = 0;
		//a 와 b 사이의 모든 값을 합
		//a 와 b 를 비교하여 무조건 작은 수부터 시작
		
		if(a>b) {
			//a 가 b 보다 큰 경우 => a 와 b를 바꾸는 식
			int tmp=a;
			a=b;
			b=tmp;
		}
		
		//a 는 작은 값, b는 큰 값
		for(int i=a; i<=b; i++) {
			sum2 += i;
		}
		
		
		return sum2;
	}
	
	
	//오버로딩
	public int sum3(int a, int b) {
		int sum=0;
		//a 는 작은 값, b는 큰 값
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		for(int i=min; i<=max; i++) {
			sum+=i;
		}
			
		return sum;
	}



}
