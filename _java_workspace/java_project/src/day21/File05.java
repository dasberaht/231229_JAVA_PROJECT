package day21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class File05 {

	public static void main(String[] args) throws IOException {
		/* test.txt 파일을 읽어들여 map에 저장하여, 
		 * 명단, 합계, 평균을 출력
		 * 
		 * txt 에서 읽어들이는 값은 모두 - String 값
		 * 계산을 위해서는 int 자료형으로 변환이 필요
		 * Integer.parseInt(); String -> int 로 변환 
		 *  
		 * */

		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		Map<String, Integer> st = new HashMap<String, Integer>();
						
		while(true) {
			String line = br.readLine();
			if(line==null) {
				break;
			}
			System.out.println(line);
			String name = line.substring(0, line.indexOf(" "));
			String score = line.substring(line.indexOf(" ")+1);
			int score2 = Integer.parseInt(score);
			st.put(name, score2);
		}
		int cnt = 0;
		int sum = 0;
		for(String a : st.keySet()) {
			sum += st.get(a);
			cnt++;
		}
		System.out.println("--------------");
		System.out.println("합계 : " + sum + " 점");
		System.out.println("평균 : " + sum / (double)cnt + " 점");
			
		
		// br 끊기
		if(br != null) {		// 객체가 생성되었다면 끊기
			br.close();			
		}
				
	}

}
