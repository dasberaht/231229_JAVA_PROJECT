package day11;


/* 해당 클래스는 1장의 카드를 생성하기 위한 클래스
 * [카드]
 * 	숫자 : 1~10(;A~I) + J(11), Q(12), K(13)
 * 	모양 : ♥, ◆, ♣, ♠
 * 	한장의 카드를 출력하는 기능 print() => ♥1
 * 	ex) ◆12 => ◆Q / ♠13 => ♠K / 없는 모양을 입력할 경우 %2 => ♥2 무조건 하트를 출력 / 모양도 없고 숫자도 없을 경우 ♥1 출력		//set 값 설정, 출력 시 숫자를 모양으로 바꾸도록 
 */

/* 클래스의 구성
 * 멤버변수 : 모양(shape), 숫자(num) => private => getter/setter 생성
 * 메서드 : print()
 * 생성자 : 기본생성자만 생성 => 기본값(♥1)을 기본생성자에 지정
 */

public class Card {
	
		
	private char shape;
	private int num;
	
	//생성자
	public Card() {
		this.shape = '♥';
		this.num = 1;
	}
	
	
	
	public void print() {
		System.out.print(shape);
		switch(num) {
		case 11 :
			System.out.print("J ");
			break;
		case 12 :
			System.out.print("Q ");
			break;
		case 13 :
			System.out.print("K ");
			break;
			default :
				System.out.print(num+" ");
				break;
		}
	}
	
	
	
	public char getshape() {
		return shape;
	}
	
	public void setshape(char shape) {
		
		switch(shape) {
		case '♥' : case '♠' : case '♣' : case '◆' :
			this.shape = shape;
			break;
			default:
				this.shape = '♥'; 
				break;
		}
		
	}
	

//	this.shape = shape;
//	if(this.shape=='♥') {
//		shape='♥';
//	} else if(this.shape=='◆') {
//		shape='◆';
//	} else if(this.shape=='♣') {
//		shape='♣';
//	} else if(this.shape=='♠') {
//		shape='♠';
//	} else {
//		this.shape='♥';
//	}
	
	
	
	public int getnum() {
		return num;
	}
	
	
	//외부의 값(매게변수)으로 내부 변수(멤버변수)를 변경할 때 사용하는 메서드
	public void setnum(int num) {
		//1~13까지만 내 숫자, 그 외에는 1로 설정
		if(num<1 || num>13) {
			this.num = 1;
		} else {
			this.num = num;
		}
			
	}
	
	
	
	
	
	
}
