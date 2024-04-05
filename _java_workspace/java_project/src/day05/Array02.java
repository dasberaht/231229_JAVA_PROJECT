package day05;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력할 수 있는 배열을 생성
		 * 5명의 점수를 입력 받아 배열에 저장
		 * 점수를 출력 -> 점수의 합계 / 평균
		 */

		Scanner scan = new Scanner(System.in);
		int arr[] = new int[3];
		System.out.println("점수입력");
		
//		for(int i = 0; i < arr.length; i++) {
//
//			int num = scan.nextInt();
//			if(num >= 0) {
//			arr[i] = num;
//			}
//			System.out.println("점수 : " + arr[i] + "점");
//		}
//		
//		int s = 0;
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + "점 ");
//		}
		int sum = 0;
		int i = 0;
		for(i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
			System.out.println("점수(" + (i+1) + ")");
			System.out.println(arr[i] + " 점");
			sum = sum+arr[i];
		}
		
		for(i=0; i<arr.length; i++) {
			System.out.print("점수(" + (i+1) + "):" + arr[i] + "   ");
		}
		
		System.out.println();
		//double avg = sum/(double)arr.length;					*** 평균 값
		System.out.println("합계 : " + sum + " 점");
		System.out.println("평균 : " + (double)(sum/i) + " 점");
		
		
	
		
		
		
		
		scan.close();
		
		
		
		
	}

}
