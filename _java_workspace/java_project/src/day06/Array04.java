package day06;

public class Array04 {

	public static void main(String[] args) {
		/* 10개의 값을 가지는 배열을 생성한 후
		 * 1~50랜덤수를 배열에 저장 한 후 출력
		 * 저장된 랜덤 배열을 출력
		 * 합계, 평균, 최대, 최소 출력 
		 */

		int arr[] = new int[10];

		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 50;
		
		for(int i = 0; i < arr.length; i++) {
			int ran = (int)(Math.random()*50)+1;
			arr[i] = ran;
			sum += arr[i];
			avg = sum/(double)arr.length;
			System.out.println("랜덤 수("+(i+1)+") : "+arr[i]+" ");

			max = Math.max(max, ran);
			min = Math.min(min, ran);
		
		}

//		for(int i = 0; i < arr.length; i++) {
//			int ran = (int)(Math.random()*50)+1;
//			arr[i] = ran;
//
//			System.out.println("랜덤 수("+(i+1)+") : "+arr[i]+" ");		
//		}
		
//		for(int i=0; i< arr.length; i++) {
//			sum += arr[i];
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//			if(min > arr[i]) {
//				min = arr[i];
//			}
//			avg = sum/(double)arr.length;
//		}
			System.out.println("합계 : "+sum+" ");
			System.out.println("평균 : "+avg+" ");
			System.out.println("최대 : "+max+" ");
			System.out.println("최소 : "+min+" ");
			

		
	}

}
