package day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 과제17 {

	public static void main(String[] args) {
		
		/* 	숫자를 입력받아(scanner) 입력받은 숫자를 list 로 구성하고, 출력
		 * 	합계를 출력
		 * 	입력 : 45,78,89,97,68,57,48 => String
		 * 	list 에 넣고, 출력 => 합계(+인원수) 출력
		 * 	70점 이상의 인원수 출력
		 * 	 
		 * */

		// 배열을 List 로 구성할 때
		// List<Integer> list = new ArrayList<Integer>(Array.asList(arr));			//타입이 같은 경우 배열의 값을 list 로 넣어주는 형태 		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자 입력 >");
//		String num = scan.next();
		String num = "45,78,89,97,68,57,48";
		
		String[] numbers = num.split(",");
		 
		List<Integer> list = new ArrayList<Integer>();
		
		for(String n : numbers) {
			list.add(Integer.parseInt(n));
//			System.out.println(n);
		}
		System.out.println(list);
		
		int sum = 0;
		int count = 0;
		for(int tmp : list) {
			sum += tmp;
			if(tmp>=70) {
				count++;
			}
		}
		System.out.println("합계 : " + sum);
		System.out.println("70점 이상 수 : " + count);
		

		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		int sum = 0;
//		int count = 0;
		
//		String arr[] = num.split(",");
//		
//		for(String tmp : arr) {
//			list.add(Integer.parseInt(tmp));
//			sum += Integer.parseInt(tmp);
//			
//			if(Integer.parseInt(tmp) >= 70) {
//				count++;
//			}
//			System.out.print(tmp + " ");
//		}
//		System.out.println();
//		System.out.println("합계 : " + sum);
//		System.out.println("70점 이상 수 : " + count);

		
//		System.out.println("숫자를 입력하세요 >");
//		String num1 = scan.next();
//		String arr1[] = num1.split(",");
//				
//		for(String temp : arr1) {
//			list.add(Integer.parseInt(temp));
//			sum += Integer.parseInt(temp);
//			
//			if(Integer.parseInt(temp) >= 70) {
//				count++;
//			}
//			System.out.print(temp + " ");
//		}
//		System.out.println();
//		System.out.println("합계 : " + sum);
//		System.out.println("70점 이상 수 : " + count);
//		
		
		scan.close();

	}

}
