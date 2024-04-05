package day21;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class File04 {

	public static void main(String[] args) throws IOException  {		// FileNotFoundException / IOException  사용 가능

		/* BufferedReader : 문자 보조스트림
		 * 라인단위로 읽기가 가능
		 * 더 이상 읽을 라인이 없으면, null을 리턴
		 * 
		 * 보조스트림 : 직접 읽고 쓰는 기능이 없으므로, -> 기반스트림을 매개변수로 포함해야 한다
		 * 
		 * 
		 * 
		 * */

		BufferedReader br = 
				new BufferedReader(new FileReader("out.txt"));
		
		while(true) {
			
			String line = br.readLine();	// 한 라인 읽어오기
			
			if(line == null) {
				break;
			}
			System.out.println(line);
		}
		br.close();
		
		
		
		
		
		
		
		
		
	}

}
