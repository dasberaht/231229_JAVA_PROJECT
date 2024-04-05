package test;

public class test01 {

	public static void main(String[] args) {
		
		int[][] a = {{10,20,50}, {20,30,15}, {100,110,120}};
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			
			int[] b = a[i];
			
			for(int j=0; j<b.length; j++) {
//				System.out.println(b[j]);	
				sum += b[j];
			}	
		}
		System.out.println("['a' 배열 내 변수 값의 합]");
		System.out.println(sum);
		
	
		
		
		
	}
	
	
}
