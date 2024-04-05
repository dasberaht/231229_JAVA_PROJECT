package day10;

public class Class02 {

	public static void main(String[] args) {
		 
		Car c = new Car();
		c.setName("스파크 ");
		c.setColor("빨강색 ");
		c.setYear("2024년식");
		c.print();
		// 작동
		c.power();
		System.out.println("myCar Power : " + (c.isPower() ? "on" : "off"));
		c.power();
		System.out.println("myCar Power : " + (c.isPower() ? "on" : "off"));
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		System.out.println("myCar speed : " + c.getSpeed());
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		System.out.println("myCar speed : " + c.getSpeed());
		
		
System.out.println("-------------------------------");		
		
		Car c2 = new Car();
		c2.setName("그랜저 ");
		c2.setColor("검정색 ");
		c2.setYear("2003년식");
		c2.print();
		//작동
		c2.power();
		System.out.println("myCar2 Power : " + (c2.isPower() ? "on" : "off"));		
		System.out.println("myCar2 speed : " + c2.getSpeed() );
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		System.out.println("myCar2 speed : " + c2.getSpeed() );
		
		//speedUp() 이 300까지만 나타내도록 설정
		
		
		
	}

}


class Car { //클래스명은 대문자로 시작
	//멤버변수 = private
	//메서드 = public (+ getter/setter)
	private String name;
	private String color;
	private String year;		//00년식
	private boolean power;		//on/off (true/false)
	private int speed;			//속도게이지
	
	
	//power()
	//꺼져있을 경우 -> 시동버튼을 통해 켜짐
	//켜져있을 경우 -> 시동버튼을 통해 꺼짐
	public void power() {
		power = !power;			//반대 상태를 나타냄
	}
	
	//speedUp()
	public void speedUp() {
		if(speed >= 300) {
			speed = 300;
		} else {
			speed += 10;
		}
			
	}

	//speedDown()
	public void speedDown() {
		if(speed <= 0) {
			speed = 0;
		} else {
		speed -= 10;
		}
	}
	
	//print()
	
	public void print() {
		System.out.println("myCar : " + name + "/ " + color + "(" + year + ")");
		
	}

	//마우스 우측클릭 = 소스 = 게터세터 생성탭
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	
	
}

