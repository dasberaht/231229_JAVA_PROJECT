package day01;

public class 변수 {

	public static void main(String[] args) {
		/* 변수 선언
		 * 자료형(타입) 변수명;
		 * 
		 * 변수 선언 + 초기화;
		 * 자료형(타입) 변수명 = 값;
		 * 
		 */
		int num = 123;	// 선언 + 초기화 (동시)
		System.out.println(num);

		// int num = 456; // 변수는 중복선언 불가능
		
		int num1 = 12, num2 = 34, num3 = 56; // 같은 자료형의 한줄 선언 가능
		
		System.out.println(num1);
		
		num1 = 78;	// '='(대입연산자) 오른쪽의 값을 왼쪽의 변수에 저장(덮어쓰기)
		System.out.println(num1);
		
		// 8개의 기본 자료형은 '지역변수'(ex. num..)의 범위(scope)는 {}내에서만 적용 

		int num4 = 12;
		{

			System.out.println(num4);
		}
			// System.out.println(num4); 중괄호 밖에서는 불가X
		
		// 한 글자만 저장가능한 char
		// "문자열", 숫자는 ""를 쓰지 않음, char는 'a'를 사용
		// String("문자열"), char('한글자만 가능')
		
		char ch = 'a';
		System.out.println(ch);
		
		double dou = 3.1;
		System.out.println(dou);

		byte b = 1;
		System.out.println(b);
		
		boolean boo = false;			// boolean은 true 혹은 false 만 가능
		System.out.println(boo);

		//float, long 자료형은 접미사 f : l 를 붙여야 인식
		//float(f or F), long(l or L)
		
		float f = 1.2f;
		long l = 1L;
		System.out.println(f);
		System.out.println(l);

		num1 = 010;	//8진수로 인식 (0~7까지만 인식하는 진법으로 8을 10으로 인식)
		//10진수 (0~9까지 인식하는 진법 10을 10으로 인식) , 16진수 (0~9(~ABCDEF순으로 표시)까지 인식하는 진법 10을 16으로 인식)
		
		System.out.println(num1);
		
		num2 = 0x10; // 16진수로 인식
		System.out.println(num2);
		
		// + - * / %(나머지; 몫이 아닌 나머지 수)
		
		num1 = 10;
		num2 = 20;
		System.out.println(num1 % num2);

		// 국어점수 = kor, 영어점수 = eng, 수학점수 = math 변수로 선언 후 값을 입력하여 세 점수의 합을 콘솔에 출력
		
		int kor = 99;
		int eng = 100;
		int math = 100;
		System.out.println("합계 : " + (kor + eng + math));
		int sum = kor+eng+math;
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/3.0); // 정수 나누기 정수 = 정수
		// +를 문자와 같이 사용할 경우 문자로 인식 ( 반대로 숫자와 숫자를 더할 경우 숫자 )
		 
		int a = 10;
		a += 10;	// a = a + 10;과 같음
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		++a;
		System.out.println(a);
			
		
	}

}
