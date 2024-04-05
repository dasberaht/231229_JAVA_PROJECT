package day06;

public class AraayEx01 {

	public static void main(String[] args) {
		/* 10개의 배열을 담을 수 있는 arr 생성
		 * 1부터 10까지 값을 입력한 후 출력
		 * 
		 */
		
		int arr[] = new int[10];
		System.out.println(arr);
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		/* 배열을 섞는 코드
		 * 랜덤 번지를 선택해서 순차적으로 하나씩 교환
		 * (int)(Math.random()*10)+0			// 0부터 10까지의 랜덤 수를 출력
		 * max = 최종번지 개수, min = 최초번지 수
		 * 교환 코드
		 * 번지  [i][i+1]...
		 * int temp = arr[i];
		 * arr[i] = arr[i+1];
		 * arr[i+1] = temp; 
		 */

//		int temp = arr[i];
//		arr[i] = arr[i+1];
//		arr[i+1] = temp;
		
		
		int min = 0;
		int max = arr.length;
		
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random()*max)+min;
			int temp = arr[i];
			arr[i] = arr[random];
			arr[random] = temp;
		
		}	System.out.println("---랜덤 후 값 보기---");
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}

		System.out.println();
		
		/* 랜덤 값을 원래대로 정리(정렬)
		 * 작은 수부터 정리 = 오름차순 정렬
		 * 큰 수부터 정리 = 내림차순 정렬
		 * 5 2 6 1 5 9 3 3 5 10 
		 * 첫번째 수부터 전체 숫자와 대조하여 하나씩 정렬
		 * 
		 */
		
		System.out.println("---정령 후 값 보기---");
		
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {

				if(arr[i] < arr[j]) {
					
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					
				}
				
			}
		
		}
		
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}
		
		
		
	}

}
