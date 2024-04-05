package day08;

public class Method06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[] {11,2,3,5,7,8,4,6,1,10,15,13,12};
		
		
		printArray(arr);
		System.out.println();
		System.out.println("정렬 후 배열을 리턴(1)");
		sortArray(arr);
		printArray(arr);
		System.out.println();
		System.out.println("정렬 후 배열을 리턴(2)");
		// int arr1[] = sortArray1(arr);
		// printArrray(arr1);
		printArray(sortArray1(arr));
		System.out.println();
		System.out.println("배열 랜덤 값 정렬 후 리턴");
		printArray(sortArray1(randomArray()));
		
		
	}

	/* 주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : 배열
	 * 리턴타입 : 출력 -> void
	 * 메서드명 : printArray
	 * 5개씩 한 줄에 나열 
	 */
	
	public static void printArray(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {

			if(i % 5 == 0 && i != 0) {				//(i+1) % 5 == 0
			System.out.println();
			
			}
			
			System.out.print(arr[i] + " ");
			
		} return;	// 생략가능
		
	}
	
	
	/* 배열이 주어지면 배열을 오름차순 정렬하는 기능
	 * 매개변수 : 배열
	 * 리턴타임 : 없음 => void
	 * 메서드명 : sortArray
	 */
	
	
	public static void sortArray(int arr[]) {
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j= i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
				 	int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}  
			} 
		} 
		
	}
	
	
	//정렬 후 배열을 리턴
	public static int[] sortArray1(int arr[]) {
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
				 	int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}  
			} 
		}  return arr;

	}
	
	
	/* randomArray
	*  배열을 생성하여[10개] 랜덤값(1~50)을 채우고, 해당 배열을 리턴
	*  메인에서 printArray(randomArray()); 형태로 출력
	*  매개변수 X
	*  리턴타입 : 배열
	*  메서드명 : randomArray 
	*/
	
	public static int[] randomArray() {
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
		}
		return arr;
	} 
	
	
	
	
	
}
