package day08;

public class Method07과제 {

	public static void main(String[] args) {
		/* 로또 생성
		 * 
		 */
		
		int lotto[] = new int[7]; 		// 당첨번호
		int user[] = new int[6];		// 사용자번호
		
		System.out.println("[로또6/45]");
		
		System.out.println("당첨번호 > ");
		randomArray(lotto);
		printArray(lotto);
		System.out.println();
		System.out.println("사용자번호 > ");
		randomArray(user);
		printArray(user);
		System.out.println();
		System.out.println("당첨확인 >");
//		lottoRank(lotto, user);
		int rank = lottoRank(lotto, user);
		if(rank == -1) {
			System.out.println("꽝");
		} else {
			System.out.println(rank+"등 당첨");
		}
		
	}

	/* 배열을 매개변수로 받아, 1~45까지 램덤수를 채워서 생성
	 * 랜덤 수가 중복되지 않도록 생성
	 * 매개변수 : 배열 => int arr[]
	 * random == arr[i] => false면 추가 하도록 식 생성
	 * 
	 */
	
	public static void randomArray(int arr[]) {
		// 배열을 받아서 배열에 랜덤 값을 중복없이 채우기
		int cnt=0; 	//while에서 i 역할을 할 변수
		
		while(cnt < arr.length) {
			int r = (int)(Math.random()*45)+1;
			if(!isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
		
		
		
	}
	
	
	/* 로또번호 중복체크
	 * 매개변수 : 배열, 값
	 * true / false
	 * 리턴타입 : boolean
	 * 메서드명 : isContain
	 */

	public static boolean isContain(int arr[], int random) {
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == random) {
				return true;
			}
		}
		
		return false;
	}
	
	
	/* 등수 확인 메서드(main에서 출력할 예정)
	 * 매개변수 : lotto[] / user[]
	 * 리턴타입 : int
	 * 메서드명 : lottoRank
	 * - 당첨기준
	 * user번호 기준으로
	 * 6개 일치 : 1등
	 * 5개 일치 + 보너스 번호 일지 : 2등
	 * 5개 일치 : 3등
	 * 4개 일치 : 4등
	 * 3개 일치 : 5등
	 * 나머지 : 꽝
	 */
	
//	public static int lottoRank(int lotto[], int user[]) {
////		boolean lottoR = isContain(lotto, user);
//		int count = 0;
//
//		for(int i=0; i<lotto.length; i++) {
//			for(int j=0; j<user.length; j++) {
//				if(lotto[i] == user[j]) {
//					count++;
////					System.out.println(count);
//				}	else if(lotto[6] == user[j] && count == 5) {
//					System.out.println("2등");
//					break;
//				}
//				
//			}
//				
//		}
//		switch(count) {
//		case 3 : 
//			System.out.println("5등");
//			break;
//		case 4 :
//			System.out.println("4등");
//			break;
//		case 5 : 
//			System.out.println("3등");
//			break;
//		case 6 : 
//			System.out.println("1등");
//			break;
//		default :
//			System.out.println("꽝");
//			break;
//		}
//
//		
//		return count;
//		
//	}
	
	public static int lottoRank(int lotto[], int user[]) {
		//lotto = 7개 / user = 6개
		//lotto / user 개수가 다르기 때문에 배열이 바뀌어서 들어온다면, 
		
		if(lotto.length <= user.length) {
			return -1;	//-1은 잘못된 값을 의미
		}
		
		int cnt = 0;	//일치하는 개수를 세기위한 변수(보너스 번호는 제외)
		for(int i=0; i<user.length; i++) {		//보너스는 제외시키기 위함
			if(isContain(user, lotto[i])) {
				cnt++;
			}
			
		}
		
		switch(cnt) {
		case 6 : return 1;
		
		case 5 : 
			if(isContain(user, lotto[lotto.length-1])) {
				return 2;
			} else {
				return 3;
			}
		
		case 4 : return 4;
		case 3 : return 5;
		default : return -1;
		}
		
		
	}
	
	
	
	
	
	
	/* 배열을 매개변수로 받아, 배열을 출력하는 메서드
	 * + 마지막 보너스 번호 출력방식 변경
	 * 1 2 3 4 5 6 [7]
	 */

//	public static void printArray(int arr[]) {
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//	}

	
	public static void printArray(int arr[]) {
		int count=0;
		for(int i=0; i<arr.length; i++) {
			count++;
			if(count==7) {
				System.out.print("["+arr[i]+"]");
				
			} else if(count<7) {
			System.out.print(arr[i]+" ");
			}
		}			
		
		System.out.println();

		
		
		// 확인필요
//		if(arr.length==7) {
//			for(int i=0; i<arr.length; i++) {
//				
//				
//				
//			}
//		}
//				System.out.print("["+arr[i]+"]");
		
		
		
		
	}
	
	
	

	
	
	
}
