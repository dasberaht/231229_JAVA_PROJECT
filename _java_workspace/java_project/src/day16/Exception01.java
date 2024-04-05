package day16;

public class Exception01 {

	public static void main(String[] args) {
		/*	Exception : 예외처리
		 * 	개발자가 코드 구현 시 발생할 수 있는 예외를 처리하는 구문
		 * 	예외가 발생할 수 있느 값만을 빼고, 나머지는 정상처리	
		 * 	예외가 발생하면 예외 발생 시점부터 코드는 중지 -> 예외문구를 출력			// TCPschool.com 참고			//IO = input / output
		 * 	
		 * 	예외 / 에러(시스템 상에서 발생하는 것으로; 개발자가 처리할 수 없다) 를 구분
		 * 	
		 * 	*예외를 처리하는 구문
		 * 	try ~ catch
		 * 	try ~ catch ~ finally
		 * 	
		 * 	try : 예외가 발생 할 가능성이 있는 구문 작성	
		 * 	catch : try 구문에서 발생한 예외를 처리하는 구문
		 * 	finally : try 구문 외 반드시 실행되어야 하는 구문을 작성 (없을 경우 사용하지 X)	
		 * 
		 */

		
		try {
			System.out.println(1);
			System.out.println(2);
			
			System.out.println(1/0);	//Exception 발생 라인
			
			System.out.println(3);		//try구문 내 Exception 발생 라인 이후는 처리되지 않는다
			System.out.println(4);
			
		} catch(Exception e) {			//발생한 예외를 처리할 객체 e
			e.printStackTrace();		//실제 예외 구문을 콘솔에 출력해주는 역할
			System.out.println("예외가 발생했습니다.");
		}
		
		//Exception 발생하더라도 처리
		System.out.println(5);
		System.out.println(6);
		
		
		
		
		
		
		
		
	}

}
