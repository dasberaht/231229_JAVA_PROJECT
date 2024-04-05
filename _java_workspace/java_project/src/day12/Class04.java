package day12;

public class Class04 {

	/* [static]
	 * static 이 붙은 메서드/멤버변수의 값들을 [클래스의 멤버변수/메서드]라고 한다				**일반적으로 사용하지 않는다(메모리 사용 多)
	 * : 객체의 생성없이 클래스가 만들어지면 생성
	 * : 객체 없이 클래스만으로 사용 가능
	 * : '클래스명.메서드'/'클래스명.멤버변수' 의 형태로 접근
	 * : 객체를 생성해서 호출도 가능하나, 그렇게 사용하지 않는다(자바 내 노란색 밑줄 표시; 구문이 의미없음을 의미)
	 * : 클래스의 멤버변수/메서드는 하나의 멤버변수가 모든 객체에 공유할 때 사용
	 * 
	 * static 이 붙지 않은 메서드/멤버변수의 값들은 [객체(인스턴스)의 멤버변수/메서드]라고 한다
	 * : 객체의 멤버변수/메서드는 객체를 통해 사용/생성(즉, 객체를 만들지 않을 경우 생성되지 않는다)
	 * : 일반적으로 '객체명.메서드'/'객체명.멤버변수' 의 형태로 식을 작성
	 * : 각 객체마다 독립적인 객체를 이룬다 -> 각 객체마다 독립적인 멤버변수, 메서드를 생성
	 * 
	 * 
	 * 클래스와 객체는 생성 시점이 달라, 메서드를 사용할 수 있는 환경이 다름
	 * 객체의 멤버는 클래스가 생성되고 난 후 객체를 생성할 수 있다
	 * '클래스 멤버(+static)'는 [클래스의 멤버(변수/메서드)]/[객체의 멤버(변수/메서드)]에서 모두 사용될 수 있다
	 * '객체의 멤버(-static)'는 [객체에서만] 사용될 수 있따
	 */
	
	
	public static void main(String[] args) {
	/* 현 시점에서 BRAND 는 이미 생성되어 있다(객체가 없어도 생성)
	 * System.out.println(Tv.BRAND);	// private 의 경우 접근권한이 없다
	 */
		
		
		Tv.printBrand();				// 클래스 멤버에 접근하는 방식 / 클래스명.메서드명();
		
		Tv t = new Tv();				// 객체 생성 시점에 객체멤버들이 생성된다
		t.printPower();					// 객체 메서드 사용 / 객체명.메서드명();
//		t.printBrand();					// 객체를 통해 클래스 멤버에 접근할 수 있으나, 불필요하다 (printBrand 메서드가 static 이기 때문)
		
		
		
		
	}

	
	//원하는 멤버변수의 값을 초기화
	{
//		color = "red";
	}
	
	
	
	
}

class Tv {
	private boolean power;
	private final static String BRAND = "LG";
	
	//브랜드 출력
	public void printPower() {
		if(power) {
			System.out.println("TV가 켜졌습니다.");
		} else {
			System.out.println("TV가 꺼졌습니다.");
		}
		// static 이 없는 객체 메서드에서 클래스를 사용할 수 있다
		// 클래스의 멤버는 어디서든(객체/클래스) 사용 가능
		System.out.println("Brand : "+BRAND);
	}	
	
	//파워 출력
	public static void printBrand() {
		System.out.println("Brand : " + BRAND);

		// 클래스 메서드에서 객체 변수를 사용 불가
//		System.out.println("Power : " + power);	//사용 불가
	}
	
	
}




