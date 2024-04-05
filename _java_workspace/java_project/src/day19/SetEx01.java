package day19;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		/*	set 중복저장 x
		 * 	set에 로또번호 6개 생성 후 출력
		 *  랜덤번호 1~45
		 * 	
		 * 	
		 * 	*/

		
		HashSet<Integer> set = new HashSet<Integer>();
		
		// 6번 생성X : 중복발생 가능 -> set.size() 가 6개가 찰 때까지 		
		while(set.size()<6) {
//			set.add((int)(Math.random()*45)+1);
			int random = new Random().nextInt(45)+1;
			set.add(random);
		}
		System.out.println(set);	
		
		// TreeSet : 정렬이 되는 set
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		while(treeSet.size()<6) {
//			set.add((int)(Math.random()*45)+1);
			int random = new Random().nextInt(45)+1;
			treeSet.add(random);
		}
		System.out.println(treeSet);	
		
		//first / last
		System.out.println("가장 앞에 있는 값 : "+treeSet.first());
		System.out.println("가장 뒤에 있는 값 : "+treeSet.last());
		
		//headset : 지정한 값보다 작은 값
		//tailset : 지정한 값보다 큰 값
		System.out.println(treeSet.headSet(15));
		System.out.println(treeSet.tailSet(15));
		
		//subset : 검색 범위 지정(뒤쪽 값은 미포함)
		System.out.println(treeSet.subSet(15, 30));
		
		
		
		
		
		
	}

}
