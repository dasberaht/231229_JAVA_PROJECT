package day11;

/* CardPack 클래스
 * 
 * ♥1 ~ ♥K, ◆1 ~ ◆K, ♣1 ~ ♣K, ♠1 ~ ♠K					//♥, ◆, ♣, ♠
 * 총 카드수 52장
 * 52장의 카드 한 묶음(배열)
 * 
 * 카드 출력기능 Card class print() 사용
 * 카드 초기화 기능 CardPack 생성자 							//카드팩 생성
 * 카드 한 장을 빼내는 기능 -> 출력 Card class print() 사용
 * 카드를 섞는 기능
 * 
 */
public class CardPack {

	// int arr[] = new int[52];							// int 배열안에 들어가는 자료의 형태를 선언
	// 카드 52장이 들어갈 수 있는 배열을 생성
	private Card[] pack = new Card[52];					// private Card pack[] = new Card[52]; 동일
	private int cnt = 0;								// 카드 배열의 index 위치를 체크하기 위한 변수
	

public CardPack() {
	// CardPack 클래스를 생성하면 52장의 카드가 생성되어야 한다
	// 숫자 : 1~10, J(11), Q(12), K(13) 
	// 모양 : ♥, ◆, ♣, ♠
	
	char shape = '♥';
	Card c = new Card();						// 새 카드 1장을 생성

	
	
	
	for(int i=1; i<=4; i++) {							// 4가지의 모양을 넣기 위한 for문
		switch(i) {
		case 1: shape = '♥'; break;
		case 2: shape = '◆'; break;
		case 3: shape = '♣'; break;
		case 4: shape = '♠'; break;
		}
		for(int j=1; j<=13; j++) {						// 13까지의 숫자를 넣기 위한 for문
			pack[cnt] = c;
			c.setshape(shape);
			c.setnum(j);
			cnt++;
						
		}
	}
	
}




/* 카드를 섞는 기능
 * 메서드명 : shuffle()
 * 리턴타입 : void
 * 매개변수 : X
 */

public void shuffle() {
	for(int i=0; i<pack.length; i++) {
		int random = (int)(Math.random()*pack.length);
		Card tmp = pack[i];
		pack[i] = pack[random];
		pack[random] = tmp;
	}
	
}


/* 카드 한장을 빼내는 기능
 * 메서드명 : pick() -> 카드 1장이 리턴되어야 함
 * 리턴타입 : 
 * 매개변수 : X
 */

public Card pick() {
	if(cnt==0) {
		return null;
	}
	cnt--;
	return pack[cnt];

//	if(cnt == pack.length) {return null;
//	}
//	Card c = pack[cnt];
//	pack[cnt] = null;
//	cnt++;
//	return c;
	
	
}

//for(Card tmp : cp.getPack()) {
//tmp.print();
//}


//초기화 기능

public void init() {
	cnt=52;
}


public Card[] getPack() {
	return pack;
}


public void setPack(Card[] pack) {
	this.pack = pack;
}
	


	
}


