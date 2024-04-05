package test;

public class CardMain {

	public static void main(String[] args) {

		
		CardPack2 cp = new CardPack2();
		int cnt = 0;
		
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				cp.getPack()[cnt].Card2Print();
				cnt++;
			}
			System.out.println();
		}
		
		
	}

}
