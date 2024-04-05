package day10;

public class Class03 {

	public static void main(String[] args) {
		// Car1 클래스를 통해 car 객체를 생성 = new 라는 키워들 통해 생성 -> Car1(); 이라는 생성자에 의해 초기화.
		Car1 car = new Car1();
		
		car.setName("그랜저");
		car.setColor("검정색");
		car.setDoor(4);
		car.setYear("2024년식");
		car.print();
		
		car.speedUP();
		car.power();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedUP();
		car.speedDOWN();
		car.power();
		car.power();
		car.power();
		car.power();
		
		Car1 car2 = new Car1("소나타", "2021년식");
		car2.print();
		
		Car1 car3 = new Car1("아반데", "2020년식", "빨강색", 4);
		car3.print();
		
		
		
	}

}

// default의 경우 같은 패키지 내에서 같은 클래스명을 사용할 경우 error

class Car1 {
	
	/*멤버변수 : name, year, color, power, speed, door(문짝의 개수)
	 */
	private String name;
	private String year;		
	private String color;
	private boolean power;		
	private int speed;
	private int door;
	
	/* 기본 생성자 (반드시 생성자명은 클래스명과 일치시켜야 한다.)
	 * 생성자 위치 (주로 멤버변수 아래에 생성)
	 * 생성자 오버로딩 (생성자는 여러개를 만들 수 있다.)
	 * - 오버로딩 조건 : 매개변수의 개수가 달라야하며, 타입이 달라야 한다.
	 */
	public Car1() {		// 생성자는 기본생성자가 있으나, 여러개의 생성자를 생성할 경우 : 기본생성자는 사라지므로, 기본생성자를 만들어야 한다.***
		//기본 생성자
	}
	
	public Car1(String name, String year, String color, int door) {
//		this.name = name;		// 주로 매개변수의 이름과, 멤버변수의 이름을 같게 사용
//		this.year = year;
		
		this(name, year);		// 생성자 호출**
		this.color = color;
		this.door = door;
		
	}
	
	public Car1(String name, String year) {
		this.name = name;
		this.year = year;
	}
	
	
	
	
	
	/*내 차량의 정보를 출력하는 메서드(name, year, color, door)
	 * 
	 */
	public void print() {
		System.out.println("[ " + "(" + year + ") " + "차종 : " + name + " / " + "색상 : "+ color + " / " + "문 : " + door + "개 " +  "]");
	}
	
	/*power() 켜짐 -> 꺼짐
	 * 시동이 켜졌습니다.
	 * 시동이 꺼졌습니다.
	 */
	public void power() {
		this.power = !power;
		if(this.power && speed<=0) {
			System.out.println("시동이 켜졌습니다.");
		} else if(power && speed>0) {
			System.out.println("주행중입니다.");
		} else if(!power && speed>0) {
			System.out.println("주행 중 시동을 끌 수 없습니다." + " 현재속도 : " + speed);
		} else {
			System.out.println("시동이 꺼졌습니다.");			
			this.power = !power;
		}
	}
	
	
	//speedUP/Down 의 기본 조건은 power가 켜져있을 경우
	
	/*speedUP()
	 * 300이상이면 올라가지 X
	 * up할 때마다 현재속도를 출력
	 * 시동이 꺼져있는 경우 -> 시동이 꺼져있습니다. 시동을 켜주세요.
	 * 속도가 0 이상인 경우 시동을 끌 수 X -> 시동을 끌 수 없습니다.
	 */
	
	public void speedUP() {
		if(!power) {
			System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
		} else { 
			if(speed>=300) {
				speed = 300;
				System.out.println("최고속도 입니다.");
			} else {
				speed += 10;
				System.out.println("현재속도 : " + speed);
			}
		}
	}
	
	
	
	/*speedDown()
	 * 속도가 0이되면 더이상 내려가지 X
	 * 멈췄습니다. 현재속도를 출력
	 * 시동이 꺼져있는 경우 -> 시동이 꺼져있습니다. 시동을 켜주세요.
	 */
	
	public void speedDOWN() {
		if(power) {
			if(speed<=0) {
				System.out.println("멈춰있습니다.");
				speed = 0;
			} else {
				speed -= 10;				
				System.out.println("현재속도 : " + speed);
			}
		} else {
			System.out.println("시동이 꺼져있습니다.");
		}
	}
	
	
	//getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}
	

	
	
}

