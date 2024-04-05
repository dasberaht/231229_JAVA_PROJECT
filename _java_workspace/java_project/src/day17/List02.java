package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class List02 {

	public static void main(String[] args) {
		
		/* 두 배열을 입력받아서 하나로 합치는 ArrayList 생성
		 * 오름차순 정렬하여 출력
		 * */

		String arr1[] = new String[] {"a", "c", "f", "b"};
		String arr2[] = new String[] {"d", "g", "h", "k"};
		
		ArrayList<String> arr = new ArrayList<>();
		
		
		// 합치기 => 정렬
		int cnt = arr1.length + arr2.length;
		int i=0, j=0;
		
		while(cnt > arr.size()) {
			if(i<arr1.length) {
				arr.add(arr1[i]);
				i++;
			}
			if(j<arr2.length) {
				arr.add(arr2[j]);
				j++;
			}
		}
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		
		arr.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
			
				return o2.compareTo(o1);
			
			}});
		System.out.println(arr);
			
		

			
		
//		for(int i=0; i<arr1.length; i++) {
//			arr.add(arr1[i]);
//		}
//		for(int j=0; j<arr2.length; j++) {
//			arr.add(arr2[j]);
//		}
//		System.out.println("-------오름차순");
//		Collections.sort(arr);
//		System.out.println(arr);
//
//		
//		System.out.println("-------내림차순");
//		arr.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//			
//		});
//		System.out.println(arr);
		
		
		
		
	}

}
