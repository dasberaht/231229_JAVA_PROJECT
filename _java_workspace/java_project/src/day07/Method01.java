package day07;

public class Method01 {

	
	// 메서드 선언 위치**
	
	
	public static void main(String[] args) {
		/* Method(메서드) : 기능(함수), function
		 * 메서드 선언 및 구현
		 * 접근제한자(제어자) 리턴타입 메서드명(매개변수) {
		 * 구현;
		 * }
		 * 
		 * - 접근제한자(제어자) : 접근할 수 있는 주체의 제한범위
		 * - 리턴타입 : 반환 값의 타입(메서드 실행 후 결과로 알려주는 값의 자료형) 		// 리턴할 것이 없는 경우 void 입력
		 * - 메서드명 : 메서드의 이름(소문자로 시작하는 것을 원칙으로 함) (임의지정)
		 * - 매개변수 : 기능을 수행하기 위해 필요로 하는 값(외부에서 들어와야 하는 값)
		 * - void : 리턴할 것이 없다는 것을 의미
		 * 
		 * - 메서드의 위치
		 * : 클래스 안, 다른 메서드 밖에서 선언해야 함
		 * : 메서드의 선언 순서는 아무 상관 없다
		 * : 메서드는 순서대로 실행되지 않는다
		 * : 호출이 되어야 실행
		 * 
		 * 
		 */
		
		
		int hap = sum(10, 20);			// hap은 해당 메서드의 결과를 받는 변수
		System.out.println(hap);
		
		sum1(1, 2);
		
		
		int rrr = sub(20, 120);
		System.out.println(rrr);
		
		
		
	}

	// [리턴타입 있는 경우]
	// 메서드 선언 가능 위치 (실행은 반드시 메인에서)***
	// 두 정수가 주어지면 두 정수의 합을 알려주는 메서드 
	// 리턴타입 : 합 -> int
	// 메서드명 : sum (임의지정)
	// 매개변수 : 두 정수(정수 2개) -> int num1, int num2
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	// [리턴타입 없는 경우]
	// 두 정수가 주어지면 두 정수의 합을 출력하는 메서드
	// 리턴타입 없는 경우 : void** -> 출력
	// 매개변수 : 두 정수 int num1, int num2
	public static void sum1(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	// 두 정수가 주어지면 두 정수의 차를 알려주는(리턴하는) 메서드					// 리턴이 실행되면 그 다음을 실행하지 X*****
	// 리턴타임 : 차 -> int
	// 매개변수 : int num1, int num2
	
	
	public static int sub(int num1, int num2) {
		//num1, num2 중 큰수에서 작은 수를 빼서 결과 리턴
		if(num1 > num2) {
			return num1 - num2;
		} 
		return num2 - num1;
//		else {								// else 필요 X
//			return num2 - num1; 
//		}
	}
	
	
	
	
	
}
