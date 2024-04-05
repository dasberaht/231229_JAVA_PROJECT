package test;

public class Card2 {

	private char sp;
	private int n;
	
	public Card2() {}
	
	public Card2(char sp, int n) {
		this.sp = sp;
		this.n = n;
	}
	
	public void Card2Print() {	
		System.out.print(sp);
		switch(n) {		
		case 1 : 	System.out.print("A ");		break;
		case 11 :	System.out.print("J ");		break;
		case 12 :	System.out.print("Q ");		break;
		case 13 :	System.out.print("K ");		break;
			default :	System.out.print(n+" ");		break;
		}
	}
		
	public char getSp() {
		return sp;
	}
	public void setSp(char sp) {		
		switch(sp) {	case '♥' : 	case '♠' : 	case '♣' : 	case '◆' :
				this.sp = sp;	break;
			default :	this.sp = '♥';	break;
		}
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		if(n<1 || n>13) {
			this.n = 1;
		} else {
			this.n = n;
		}
	}
}
