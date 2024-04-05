package day13;


class Animal {
	private String name;		//이름
	private String category;	//종
	
	
	public Animal() {}
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;	
	}
	
	//출력 메서드
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("종류 : " + category);
	}
	
	
	//울음소리 메서드
	public void howl() {
		System.out.println("***" + name + " 의 울음소리");
	}
	
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}


//Dog Cat 클래스 생성(자식클래스) -> Animal 클래스를 상속
//printinfo()
//howl() 오버라이드 후 출력

class Dog extends Animal {

	//자식의 생성자에서 상속받은 멤버변수를 setting
	public Dog() {
		setName("강아지");
		setCategory("개과");
	}
	
	@Override
	public void howl() {
		super.howl();
		System.out.println("왈왈~!");
	}
	
	
	
}


class Cat extends Animal {
	
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}

	@Override
	public void howl() {
		super.howl();
		System.out.println("야옹~!");
	}
	
	
}


class tiger extends Animal {
	
	public tiger(String name, String category) {
		//super 생성자 호출
		super(name, category);		
		
	}
	
	public void howl() {
		super.howl();
		System.out.println("어흥~!");
	}
	
	
}


public class 상속02 {

	public static void main(String[] args) {
		/*	오버라이딩 : 부모클래스에게 물려받은 메서드를 재정의 하는 것
		 * 	-> 부모클래스의 메서드와 선언부가 일치해야 한다
		 *  -> 접근제한자는 더 넓은 범위는 가능하나, 축소는 불가
		 */

		Dog d = new Dog();
		System.out.println("[ animal(dog) ]");
		d.printInfo();
		d.howl();
		
		System.out.println();
		System.out.println("-----------------");
		System.out.println();
		
		Cat c = new Cat("고양이", "고양이과");
		System.out.println("[ animal(cat) ]");
//		c.setName("고양이1");
//		c.setCategory("고양이과");
		c.printInfo();
		c.howl();
		
		System.out.println();
		System.out.println("-----------------");
		System.out.println();
		
		System.out.println("[ animal(tiger) ]");
		tiger t = new tiger("호랑이", "고양이과");
		t.printInfo();
		t.howl();
		
		
		
	}

}
