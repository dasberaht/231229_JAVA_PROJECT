package day16;

public class Exception06 {

	public static void main(String[] args) {
		
		/*	메서드에서 생성된 배열 출력
		 * 
		 */
		
		int start = -1;
		int count = 5;
		int size = 0;
		
		//2번째 메서드에 들어갈 배열
				int arr[] = null;
				
		
//		try {
//			
//			sizearr(size, start, count);
//			arr2(arr, start, count);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
		
		Exception06 e6 = new Exception06();
		try {
			arr = new int[size];
			e6.createArr2(arr, start, count);
			
			arr = e6.createArr(start, count, size);
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}



	}

	/*	메서드 생성
	 * 	기능 : size 를 매개변수로 입력받아, size 만큼의 길이를 가지는 배열을 생성하여,
	 *  	random값을 채워 배열을 리턴
	 * 
	 * 	랜덤값의 범위는 매개변수 입력 start(시작값) / count(개수)
	 * 
	 * 	- size 가 0보다 작다면 예외발생(throw new 로 실행)
	 *  - count 개수가 0보다 작다면 예외발생
	 */	
	
//	public static int[] sizearr(int size, int start, int count) {
//		
//		if(count<0) {
//			throw new RuntimeException("0보다 작습니다,");
//		} 
//		if(size<0) {
//			throw new RuntimeException("size가 0보다 작습니다.");
//		}
//		
//		int sizerandom[] = new int[size];
//		for(int i=0; i<size; i++) {
//			sizerandom[i] = (int)(Math.random()*count)+start;
//		}
//	
//		return sizerandom;
//		
//	}
	
	
	public int[] createArr(int start, int count, int size) {
		if(size <= 0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		}
		if(count <=0) {
			throw new RuntimeException("random 범위가 0보다 작습니다.");
		}
		
		int arr[] = new int[size];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*count)+start;
		}
		return arr;
	}
	
	
	
	/* 	메서드 생성2
	 * 	기능 : 매개변수로 배열을 받아서 랜덤값을 채우는 메서드
	 * 
	 *  랜덤값의 범위는 매개변수 입력 start(시작값) / count(개수)
	 *  
	 *  - 배열이 null 이면 예외발생
	 *  - 배열의 길이가 0보다 작다면 예외발생 (처리만)
	 */
	
	
//	public static void arr2(int arr[], int start, int count) {
//		if(arr==null) {
//			throw new RuntimeException("null 입니다.");
//		}
//		if(arr.length<0) {
//			throw new RuntimeException("길이가 0보다 작습니다,");
//		}
//		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (int)(Math.random()*count)+start;
//		}
//		
//	}
	
	
	public void createArr2(int arr[], int start, int count) {
		if(arr==null) {
			throw new RuntimeException("배열이 null입니다.");
		}
		if(arr.length<=0) {
			throw new RuntimeException("배열의 길이가 0보다 작습니다.");
		}
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*count)+start;
		}
		
	}
	
	
}
