package day06;

public class ArrayEx02 {

	public static void main(String[] args) {
		/* 1~50까지의 랜덤 수를 10개 생성하여, 배열에 저장 후 출력
		 * 오름차순 정렬 후 출력
		 */

		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
//			int ran = (int)(Math.random()*50)+1;
//				arr[i] = ran;
			
			arr[i] = (int)(Math.random()*50)+1;
			
			System.out.println("랜덤 수("+(i+1)+") : "+arr[i]);
			
		} 
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {

			if(arr[i] > arr[j]) {
				
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				
				}

			}
		
		}
			System.out.println();
			System.out.println("[랜덤 수 정렬(오름차순)]");
			for(int tmp : arr) {
			System.out.print(tmp+" ");				
		}
			System.out.println();
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		
		
		
		
		
		
		
		
	}

}
