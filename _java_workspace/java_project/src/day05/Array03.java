package day05;

public class Array03 {

	public static void main(String[] args) {
		
		int arr[] = new int[] {10, 56, 78, 89, 48, 62, 93, 50};
		/* arr배열의 합계와 평균을 출력
		 * 최대값/최소값 출력
		 * Math.max / Math.min
		 * if문
		 */
				
//		int i = 0;
//		int s = 0;
//		int max = arr[0];
//		int min = arr[0];
//		
//		for(i = 0; i < arr.length; i++) {
//			s = s + arr[i];
//			System.out.println("점수(" + (i+1) + "):" + arr[i] + "점" );
//			if(arr[i] >= max) {
//				max = arr[i];
//			}
//			if(arr[i] <= min) {
//				min = arr[i];
//			}
//		}
//		System.out.println("-------------");
//		System.out.println("합계 : " + s + "점");
//		System.out.println("평균 : " + (s/(double)i) + "점");
//		System.out.println("최고점수 : " + max + "점");
//		System.out.println("최저점수 : " + min + "점");
//		
// ------------------------------------------------------------------------------------		
		
//		for(i = 0; i < arr.length; i++) {
//			max = Math.max(max, min);
//			min = Math.min(max, min);
//		}
//			System.out.println("최고점수 : " + max + "점");
//			System.out.println("최저점수 : " + min + "점");
		
/// ------------------------------------------------------------------------------------

		//성적 데이터는 0점~100점
		int sum = 0;
		double avg = 0;
		int max = 0;			//가장 큰 값을 넣기 위한 변수
		int min = 1000000000;			//가장 작은 값을 넣기 위한 변수
		
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			
//			if(max < arr[i]) {
//				max = arr[i];
//			}
//			if(min > arr[i]) {
//				min = arr[i];
//			}
			
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
			
		}
		avg = sum / (double)arr.length;
		System.out.println("합계 : "+sum+" / 평균 : "+avg);
		System.out.println("최대 : "+max+" / 최소 : "+min);
		


		// 매서드 설명 보기 Ctrl + (매서드)클릭
		
		
		
	}

}
