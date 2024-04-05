package day07;

public class StringEx01 {

	public static void main(String[] args) {
		/* file에 저장되어있는 문자를 파일명과 확장자로 분리하여 출력 
		 * 파일명 : 이것이자바다 / 확장자 : java
		 */

		String file = "이것이자바다.java";

		String a = file.substring(0, file.indexOf("."));
		System.out.println("파일명 : "+a);
		
		String b = file.substring(file.indexOf(".")+1);
		System.out.println("확장자 : "+b);
		
		System.out.println();		
		
		String arr[] = file.split("[.]");
		System.out.println("파일명 : "+arr[0]);
		System.out.println("확장자 : "+arr[1]);
		
		System.out.println();
		
		for(String s : arr) {
			System.out.println(s);
		}
		
		System.out.println();
		
		if(file.contains("java")) {
			System.out.println("이것이자바다");
		}
		
		
	}

}

