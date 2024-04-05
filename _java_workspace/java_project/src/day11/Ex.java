package day11;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//♥, ◆, ♣, ♠
//		Card c = new Card();
//		
//		c.setnum(116);
//		c.setshape('%');
//		c.print();

		CardPack cp = new CardPack();			// 52장이 들어있는 카드 팩이 생성된다
//		for(Card tmp : cp.getPack()) {
//			tmp.print();
//		}
		
		
		
		cp.shuffle();
		
		int cnt=0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				cp.getPack()[cnt].print();
				/* cp.getPack() : CardPack 클래스 안의 pack[] 배열을 의미
				 * cp.getPack()[cnt] : pack[0] -> cnt 는 pack[] 배열의 번지를 의미 -> Card (멤버변수, 메서드)를 포함하는 값; (c.print() 와 같은 의미)
				 */
				cnt++;
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
//		cp.pick().print();
//		cp.pick().print();
//		cp.pick().print();
//		cp.pick().print();
//		cp.pick().print();
//		cp.pick().print();
//		cp.pick().print();
//		cp.pick().print();
//		cp.pick().print();
//		cp.pick().print();
//		cp.pick().print();
//		cp.pick().print();
//		cp.pick().print();
		System.out.println("딜러가 카드를 섞는 중 입니다.");
		Card player1 = cp.pick();
		Card player2 = cp.pick();
		System.out.println("player1 Card open");
		player1.print();
		System.out.println();
		System.out.println("player2 Card open");
		player2.print();


		
}	
		
}

	
	
	

