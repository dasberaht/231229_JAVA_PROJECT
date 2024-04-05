package day16;

import java.util.Calendar;
import java.util.Date;

public class Date01 {

	// *라이브러리
	
	public static void main(String[] args) {
		/* 날짜 / 시간 클래스
		 * Date 클래스 -> Deprecated(비권장) 
		 *
		 * Calender 클래스 : abstract 추상클래스  / 추상클래스는 객체를 생성할 수 없다
		 * 추상클래스를 구현한 객체를 이용하여 사용
		 * new 로 객체 생성 불가
		 * getinstance() 메서드를 이용하여 객체를 얻어온다
		 * static 메서드 : 클래스명.메서드명();
		 * 
		 */

		Date d = new Date();
		Calendar c = Calendar.getInstance();	// 오늘 날짜 리턴
		int year = c.get(Calendar.YEAR);
//		System.out.println(year + "년");
		//월 0~11까지  +1 표현필요
		int month = c.get(Calendar.MONTH)+1;
//		System.out.println(month);
		int day = c.get(Calendar.DAY_OF_MONTH);
//		System.out.println(day);
		int week = c.get(Calendar.DAY_OF_WEEK);		//일요일(1)~토 
//		System.out.println(week);
//		System.out.println(year + "-" + month + "-" + day);
		
		
				
		// hour, minute, second, am_pm
		int hour = c.get(Calendar.HOUR);
//		System.out.println(hour);
		int minute = c.get(Calendar.MINUTE);
//		System.out.println(minute);
		int second = c.get(Calendar.SECOND);
//		System.out.println(second);
		int am_pm = c.get(Calendar.AM_PM);
//		System.out.println(am_pm);
		
		String weekStr = null;
		
		switch(week) {
		case 1 : weekStr = "일요일"; break;
		case 2 : weekStr = "월요일"; break;
		case 3 : weekStr = "화요일"; break;
		case 4 : weekStr = "수요일"; break;
		case 5 : weekStr = "목요일"; break;
		case 6 : weekStr = "금요일"; break;
		case 7 : weekStr = "토요일"; break;
		default : break;
		}	
		
//		switch(week) {
//		case 1 : System.out.println(year + "-" + month + "-" + day + " (일요일)"); break;
//		case 2 : System.out.println(year + "-" + month + "-" + day + " (월요일)"); break;
//		case 3 : System.out.println(year + "-" + month + "-" + day + " (화요일)"); break;
//		case 4 : System.out.println(year + "-" + month + "-" + day + " (수요일)"); break;
//		case 5 : System.out.println(year + "-" + month + "-" + day + " (목요일)"); break;
//		case 6 : System.out.println(year + "-" + month + "-" + day + " (금요일)"); break;
//		case 7 : System.out.println(year + "-" + month + "-" + day + " (토요일)"); break;
//		default : break;
//		}	
//		if(am_pm==1) {
//			System.out.println("오후" + " " + hour + ":" + minute + ":" + second);
//		} else {
//			System.out.println("오전" + " " + hour + ":" + minute + ":" + second);
//		}
		
		
		//2024-1-26 (금)
		//오후 4:13
		System.out.println(year + "-" + month + "-" + day + " (" + weekStr + ")");
		System.out.println((am_pm==0 ? "오전" : "오후") +  " " + hour + ":" + minute + ":" + second);
		
	}
	
}
