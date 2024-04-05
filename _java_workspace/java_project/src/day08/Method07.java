package day08;

public class Method07 {

	public static void main(String[] args) {
		/* 로또 생성
		 * 
		 */

		int lotto[] = new int[7]; 		// 당첨번호
		int user[] = new int[6];		// 사용자번호
	
		System.out.println("[로또6/45]");
		
		System.out.println("> 당첨번호");
		randomArray(lotto);
		print(sortArray(lotto));
		
		System.out.println();
		System.out.println();
		
		System.out.println("> 사용자번호");
		randomArray(user);
		print1(sortArray(user));
		
		
		System.out.println();
		System.out.println();
		int lottocheck = lottocheck(lotto, user);
//		System.out.println(lottocheck);
		
		switch(lottocheck) {
			case 0 :
			System.out.println("낙점되었습니다.");
			break;
			case 1 :
				System.out.println("낙점되었습니다.");
				break;
			case 2 :
				System.out.println("5등 당첨");
				break;
			case 3 :
				System.out.println("4등 당첨");
				break;
			case 4 : 
				System.out.println("3등 당첨");
				break;
			case 5 : 
				System.out.println("2등 당첨");
				break;
			case 6 : 
				System.out.println("1등 당첨");
				break;
		}
		
		
	}
	// ***
	
	/* 배열을 매개변수로 받아, 1~45까지 램덤수를 채워서 생성
	 * 랜덤 수가 중복되지 않도록 생성
	 */
	
	public static int[] randomArray(int lotto[]) {
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)((Math.random()*45)+1);
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					lotto[i] = (int)((Math.random()*45)+1);
					break;
				} 					
			} 

		}
		return lotto;
		
	}

	
	/* 배열을 매개변수로 받아, 배열을 출력하는 메서드
	 * 
	 */
	
	public static void print(int lotto[]) {
		
		for(int i = 0; i < lotto.length; i++) {

					System.out.print(lotto[i] + " ");
				} 
			}

	public static void print1(int user[]) {
		
		for(int i = 0; i < user.length; i++) {

					System.out.print(user[i] + " ");
				} 
			}
	
			
	public static int[] sortArray(int lotto[]) {
		for(int i = 0; i < lotto.length-1; i++) {
			for(int j = i+1; j < lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					int tmp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = tmp;
				}
			}
		}
		return lotto;
	}
		
		
	 
	public static int lottocheck(int lotto[], int user[]) {
		int lottocheck = 0;
		for(int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < user.length; j++) {
				if(lotto[i] == user[j]) {
					lottocheck++;
					break;
				}
			}
		}
		return lottocheck;
	}
	
	

	
	
	/* 로또번호 중복체크
	 * 매개변수 : 배열, 값
	 * true / false
	 */


public static boolean isContain(int arr[], int random) {
	
	for(int i=0; i<arr.length; i++) {
		if(arr[i] == random) {
			return true;
		}
	}
	
	return false;
}

}
