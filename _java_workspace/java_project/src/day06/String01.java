package day06;

public class String01 {

	public static void main(String[] args) {
		/* String 클래스 = 문자열을 다루기 위한 클래스 -> 참조변수
		 * String str = new String();
		 * String str = "홍길동"; 			//	일반 자료형처럼 사용가능
		 */

		
		String str = "홍길동!!";
		System.out.println(str);
		String str1 = new String();
		str1 = "홍길순";
		System.out.println(str1);
		
		
		/* length : 길이 (전체 글자 / 배열 수 ...)
		 * 
		 */
		
		System.out.println("***length");
		System.out.println(str.length());
		
		
		/* charAt(index) : index번지에 있는 문자열을 반환
		 * 
		 */
		
		System.out.println("***charAt(index)");
		System.out.println(str.charAt(2));
		
		/* subString : 문자열을 추출
		 * 
		 */
		System.out.println("***subString");
		System.out.println(str.substring(1, 2));	// 0번지부터 2번지 전까지만 추출(2번지는 포함하지 X)
		System.out.println(str.substring(1));	// 1번지부터 끝까지 추출
		
		/* str.compareTo(str1) : str과 str1을 비교하여 앞이면 -1, 같으면 0, 뒤면 1
		 * 
		 */
		
		System.out.println("***compareTo");
		System.out.println("g".compareTo("a"));
		System.out.println("a".compareTo("g"));
		
		/* concat : 이어붙이기(+연산자와 같은 의미)		// db 등 동일하게 사용됨
		 * 
		 */
		
		System.out.println("***concat");
		System.out.println("Hello".concat("java"));
		System.out.println("Hello"+"java");
		
		/* equals : 두 문자열이 같은지 비교(대소문자 구분)
		 * 문자는 연산자(==)로 비교할 수 없다
		 * 참조변수는 ==로 비교할 경우, 주소가 같은지 확인(주소 안의 데이터가 같은지 확인하지 X)
		 * 
		 * 같으면 true 다르면 false 리턴
		 */
		
		System.out.println("***equals");
		System.out.println("abc".equals("def")); // false
		System.out.println("abc".equals("abc")); // true
		
		/* indexOf : 문자의 위치(index)를 찾아주는 기능, 찾는 문자가 없을 경우 -1을 리턴
		 * lastindexOf : 문자의 위치(index)를 뒤에서부터 찾아주는 기능
		 */
		
		System.out.println("***indexOf");
		System.out.println(str.indexOf("동")); // '홍길동!!' 중 index 2번지에 해당하는 '동'을 출력
		System.out.println(str.indexOf("!"));
		System.out.println(str.lastIndexOf("!"));
		System.out.println(str.indexOf("$")); // 해당 글자가 없을 경우 -1을 출력
		
		
		System.out.println("***email id***");
		
		
		/* 이메일에서 ID를 추출
		 *
		 */
		String email = "asdfasdf@naver.com";
		String id = email.substring(0, email.indexOf("@"));
		System.out.println(id);
		
		
		// contains : 해당 문자를 포함하는지 체크
		String file = "이것이자바다.java";
		System.out.println(file.contains("java")); //true or false 출력
		

		
		
	}

}
