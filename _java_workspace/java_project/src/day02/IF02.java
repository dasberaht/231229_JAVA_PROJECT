package day02;

import java.util.Scanner;    //**

public class IF02 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수를 입력받아
		 * 합계, 평균, 평가를 출력
		 * 평가는 
		 * 평균 90이상이면 A
		 * 평균 80이상이면 B
		 * 평균 70이상이면 C
		 * 나머지 D
		 * 
		 * 점수를 100점이 넘거나, 0이하의 숫자를 입력한 경우 "다시 입력해주세요."를 출력
		 */
		
		Scanner school = new Scanner(System.in);
		System.out.println("국어 점수 입력");
		int kor = school.nextInt();
				if(kor > 100) {
			System.out.println("잘못된 값 입니다.");
		} else if(kor < 0) {
			System.out.println("잘못된 값 입니다.");
		} else {
			System.out.println("국어 : " + kor + " 점");
		}
		System.out.println("영어 점수 입력");
		int eng = school.nextInt();
		if(eng > 100) {
			System.out.println("잘못된 값 입니다.");
		} else if(eng < 0) {
			System.out.println("잘못된 값 입니다.");
		} else {
			System.out.println("영어 : " + eng + " 점");
		}
		System.out.println("수학 점수 입력");
		int math = school.nextInt();

//		if(math > 100) {
//			System.out.println("다시 입력해주세요.");
//		} else if(math < 0) {
//			System.out.println("다시 입력해주세요.");
//		} else {
//			System.out.println("수학 : " + math + " 점");
//		}
		
		
		if(math>100 || math<0) {
			System.out.println("잘못된 값 입니다.");
		} else {
			System.out.println("수학 : " + math + " 점");
		}
		
		
		int sum = kor+eng+math;
		System.out.println("합계 : "+ sum + " 점");
		int avg = sum/3;
		System.out.println("평균 : "+ avg + " 점");
		if(avg > 100 || avg < 0) {
			System.out.println("잘못된 성적입니다.");
		} else if(avg >= 90) {
			System.out.println("A");
		} else if(avg >= 80) {
			System.out.println("B");
		} else if(avg >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		
		school.close();
		
		
		/* System.out.println("정수입력(0~100) : 국어, 영어, 수학 순으로 입력 >");
		 * int kor = school.nextInt();
		 * int eng = school.nextInt();
		 * int math = school.nextInt();
		 * 
		 *  if(kor < 0 || kor > 100) {
		 *  	System.out.println("국어 점수의 범위가 벗어났습니다."); }
		 *  if(eng < 0 || eng > 100) {
		 *  	System.out.println("영어 점수의 범위가 벗어났습니다."); }
		 *  if(math < 0 || math > 100) {
		 *  	System.out.println("수학 점수의 범위가 벗어났습니다."); }
		 *  
		 *  int sum = kor + eng + maht
		 *  double avg = sum / 3.0; 혹은 double avg = (double)sum / 3;
		 *  
		 *  System.out.println("합계 : "+ sum + "평균 : "+ avg);
		 *  
		 *  char result = 'D'; 				// char = ''
		 *  if(avg > 100 || avg < 0) {
		 *  	System.out.println("잘못된 성적입니다."); }
		 *  else if(avg >= 90) {
		 *  	result = 'A';
		 *  } else if(avg >= 80) {
		 *  	result = 'B';
		 *  } else if(avg >= 70) {
		 *  	result = 'C';
		 *  } else {
		 *  	result = 'D';
		 *  }
		 *  
		 *  System.out.println("결과 : "+result);
		 */
		
		
	}

}
