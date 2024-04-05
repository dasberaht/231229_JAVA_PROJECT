package test;

public class CardPack2 {
	private Card2[] pack = new Card2[52];
	private int cnt;
			
	public CardPack2() {	
		char sp2 = '♥';
		for(int i=1; i<=4; i++) {						
			switch(i) {
			case 1: sp2 = '♥'; break;
			case 2: sp2 = '◆'; break;
			case 3: sp2 = '♣'; break;
			case 4: sp2 = '♠'; break;
			}
			for(int j=1; j<=13; j++) {						
				Card2 c = new Card2();
				pack[cnt] = c;
				c.setSp(sp2);
				c.setN(j);
				cnt++;	
			}
		}	
	}
	public Card2[] getPack() {
		return pack;
	}
	public void setPack(Card2[] pack) {
		this.pack = pack;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
}
