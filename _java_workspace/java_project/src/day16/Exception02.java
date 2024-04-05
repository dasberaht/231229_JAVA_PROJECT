package day16;

public class Exception02 {

	public static void main(String[] args) {
		
		/*	ArithmeticException : 0으로 나누었을 때 발생하는 Exception
		 *  하단에서 만든 메서드를 실행
		 *  예외처리 (/, % 일 경우)	/ 예외처리 구역 외에도 결과 값이 잘 나오는지 확인 
		 */
		
//		System.out.println(excal(5, 0, '+'));
//		System.out.println(excal(5, 0, '-'));
//		System.out.println();
		
		try {
			System.out.println(excal(5, 0, '+'));
			System.out.println(excal(5, 0, '-'));
			System.out.println(excal(5, 0, '*'));
			System.out.println(excal(5, 0, '/'));
			System.out.println(excal(5, 0, '%'));
			
		} catch(Exception a) {
			System.out.println(a.getMessage());		// message 를 String 으로 출력
			a.printStackTrace();
			System.out.println("※ Warning 오류 : 숫자 0!!!!!!!");

		}
		
		System.out.println(excal(5, 0, '+'));
		System.out.println(excal(5, 0, '-'));
		System.out.println(excal(5, 0, '*'));
		
		
		
		
	}

	// 예외 발생시키기 : throw 를 발생시킬 수 있다
	// throw : 예외 떠넘기기
	// 예외를 발생시키면, 메서드 선언부 끝에 throws를 적고, 발생할 수 있는 예외를 반드시 적어야 한다
	// throws는 RuntimeException 만 예외적으로 생략 가능
	
	/* 기능 : 두 수를 입력받고, 연산자를 입력받아 4칙연산의 결과를 리턴하는 메서드 (scan 사용할 필요X)
	 * 매개변수 : int num1, int num2, char op
	 * + - * / %
	 */

	
	
//	public static void excal(int num1, int num2, char op) {
//		
//		switch(op) {
//		case '+' : System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//		break;
//		case '-' : System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
//		break;
//		case '*' : System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
//		break;
//		case '/' : System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
//		break;
//		case '%' : System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
//		break;
//		default : break;
//		}
//		
//	}
	
	
	public static double excal(int num1, int num2, char op) throws RuntimeException {		// throws 생략가능
		double res = 0;
		
		// 연산자가 / % 인 경우 num2가 0이면 예외 발생시키기
		if((op=='/' || op=='%') && num2==0) {
			//예외 미리 발생시키기
			throw new RuntimeException("num2가 0이 될 수 없습니다.");	
		}
		
		
		switch(op) {
		case '+' : res = num1 + num2; break;
		case '-' : res = num1 - num2; break;
		case '*' : res = num1 & num2; break;
		case '/' : res = num1 / num2; break;
		case '%' : res = num1 % num2; break;
		default : 
			throw new RuntimeException(op + " 는 산술연산자가 아닙니다.");
				
		} return res;
		
		
		
	}
	
	
	

}
