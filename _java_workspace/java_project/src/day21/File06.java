package day21;

import java.io.File;

public class File06 {

	public static void main(String[] args) {
	
		/*	파일이 가지고 있는 정보 출력 
		 * 
		 * 
		 * */

		File f = new File("D:\\W\\_java_workspace\\java_project\\test.txt");	// '\\' 표시로 경로 구분이 필요한 경우가 있다?
		String name = f.getName();				// 경로를 제외한 이름
		System.out.println(name);
		System.out.println(f.getPath());		// 경로 + 이름
		System.out.println(f.getParent());		// 경로만
		System.out.println(File.separator); 	// 파일 구분자
		
		
		String f2 = f.toString();
		System.out.println(f2);
		
		// f2 를 기준으로 파일명만 추출(File.separator 이용)
		System.out.println("--------------");
		System.out.println(f2.substring(f2.lastIndexOf(File.separator)+1));
		
		
		
		
		
	}

}
