package day22;


class NumThread extends Thread {

	int start;
	int end;
	int total;
	
	//생성자
	public NumThread(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	
	@Override
	public void run() {
				
		for(int i=start; i<=end; i++) {
			this.total += i;
			System.out.println("숫자 " + i);
		}
	}
	
}



public class Thread03 {

	public static void main(String[] args) {
		/*	
		 * 	1) 1 ~ 50 /  2) 51 ~ 100 까지의 합을 구하는 두개의 Thread 를 생성
		 * 
		 * 	1), 2) 결과 확인
		 * 
		 * 	두 개의 Thread 가 실행되고 난 후
		 * 		1. 1)의 합계 출력
		 *  	2. 2)의 합계 출력
		 *  	3. 1)과 2)의 합계 출력
		 *  	순서대로 출력
		 */

		
		
		NumThread a1 = new NumThread(1, 50);
		NumThread a2 = new NumThread(51, 100);
		System.err.println("1)Thread");
		a1.start();
		try {
			a1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.err.println("2)Thread");
		a2.start();
		try {
			a2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		System.out.println(".");
		try {
			Thread.sleep(700);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(".");
		try {
			Thread.sleep(700);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(".");
		try {
			Thread.sleep(700);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		System.err.println("> 1)의 합계 : " + a1.total);
		System.err.println("> 2)의 합계 : " + a2.total);
		System.err.println("> 1) + 2) 합계 : " + (a1.total + a2.total));
		

//		try {
//			a1.join();
//			Thread.sleep(1000);	 // 1초 기다렸다가 실행
//			a2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
	}

}
