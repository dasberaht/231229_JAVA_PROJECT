package day03;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		/* 단을 입력받아서 입력받은 단을 출력 (구구단)
		 * 2 => 2*1=2 2*2=4 2*3=6 2*4=8 ... 2*9=18
		 */
		
		Scanner a = new Scanner(System.in);
		System.out.println("단(정수)을 입력하시오.");
		int w = a.nextInt();
		for(int q = 1; q < 10; q++) {
			System.out.println(w + " * " + q + " = " + (w*q));
		}
		
		a.close();

	}

}
