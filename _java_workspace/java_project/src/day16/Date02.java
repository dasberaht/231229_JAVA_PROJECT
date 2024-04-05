package day16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date02 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);		// <= 로컬데이터 이므로 String 이 아니다
		System.out.println(today.getYear());
		String t = today.toString();	//toString() 을 통해 스트링 객체로 반환한다**
		System.out.println(t);
		
		System.out.println("------------------------------");
		
		//날짜 / 시간 분할할 경우
//		System.out.println(t.indexOf("T"));			// 문자 위치 확인용
		System.out.println(t.substring(0, t.indexOf("T")));
		System.out.println(t.substring(t.indexOf("T")+1));
		System.out.println(t.substring(t.indexOf("T")+1, t.indexOf(".")));
		
		System.out.println("------------------------------");
		
		//Formatter 이용 - LocalDateTime 을 이용
		DateTimeFormatter dtf = DateTimeFormatter
				.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		//생성해 놓은 Formatter를 이용하여 날짜/시간 지정하여 출력
		LocalDateTime sDate = LocalDateTime.of(2009, 9, 30, 8, 30, 11);
		System.out.println(sDate.format(dtf));
		
		
		
	}

}
