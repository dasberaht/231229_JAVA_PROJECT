package day13;

public class 추상클래스 {

	public static void main(String[] args) {
		/*	추상클래스 
		 *  - 미완성 클래스 -> 객체를 생성할 수 없다 
		 *  - '추상메서드' + 일반메서드 + 멤버변수 + 상수(final)
		 *  키워드 : abstract (생략 불가; 단, 인터페이스 에서는 키워드 생략 가능 : 추상메서드만 존재)
		 *  식 : abstract 글래스명 / abstract 메서드명
		 *  	abstract 리턴타입 메서드명(매개변수); -> 추상메서드
		 *  보통 상속을 받아야하는 부모클래스를 작성할 경우
		 *  특정 메서드가 자식들에게 자주 오버라이딩 되는 상황일 때 사용
		 *  상속받은 클래스에 추상메서드가 있다면 반드시 구현이 필요
		 *  
		 * 	추상메서드 : 메서드의 선언부만 있고, 구현은 없는 메서드
		 * 	
		 */

		Dog1 d1 = new Dog1("뽀삐", "개과");
		d1.printinfo();
		d1.howl();
		d1.eating("개껌");
		
		System.out.println();
		System.out.println("--------------------");
		System.out.println();
		
		Monkey m = new Monkey("원숭이", "원숭이과");
		m.printinfo();
		m.howl();
		m.eating("바나나");
		
		
	}

}


//추상클래스 : abstract
abstract class Animal1 {
	public String name;
	public String category;
	public String eat;
	
	public void printinfo() {
		System.out.println(name + " (" + category + ")");
	}
	
	//추상메서드
	abstract public void howl();
	
}


class Monkey extends Animal1 {

	//멤버변수
//	private String eat;
	
	//생성자
	public Monkey(String name, String category) {
		super.name = name;
		super.category=category;
	}
	
	
	@Override
	public void howl() {
		System.out.println("'" + name + "' 의 울음소리는 [끽끽!]");		
	}

	
	public void eating(String eat) {
		this.eat = eat;
		System.out.println("'" + name + "' 는(은) '" + eat + "' 를(을) 좋아합니다.");
	}
	
}




class Dog1 extends Animal1 { 

	//멤버변수
//	private String eat;
	
	
	//생성자
	public Dog1(String name, String category) {
		super.name = name;
		super.category = category;
	}
	
	@Override
	public void howl() {	//반드시 구현해야 함
		System.out.println("'" + name + "' 의 울음소리는 [멍멍!]");
		
	} 	
	
	
	public void eating(String eat) {
		this.eat = eat;
		System.out.println("'" + name + "' 는(은) '" + eat + "' 을 좋아합니다.");
	}
	
	
}









