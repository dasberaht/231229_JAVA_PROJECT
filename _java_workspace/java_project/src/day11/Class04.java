package day11;

public class Class04 {

	public static void main(String[] args) {
		/* Tv 클래스 생성
		 * 멤버변수 : brand, power, ch, vol
		 * 메서드 : 
		 * power()
		 * power 가 켜지면, "Tv 가 켜졌습니다." : "Tv 가 꺼졌습니다."
		 * 
		 * (생성자)Tv를 켤 경우 채널은 0번 / 볼륨은 3으로 켜지도록 설정
		 * 		 
		 * chUp()
		 * 1씩 증가 / ch은 1~20 / 20이 넘어가면 다시 0번으로 순환**
		 * chDown()
		 * 1씩 감소 / 0이 되면 20번으로 순환**
		 * 바로 출력
		 * 
		 * volUp()/volDown()
		 * Up 은 1씩 증가 / vol 은 최대 10까지 / 10이 넘으면 10을 유지
		 * Down 은 1씩 감소 / 0이 되면 음소거
		 * 바로 출력
		 * 
		 * getter / setter
		 * 
		 */

		
		Tv Tv = new Tv("Apple TV", 0, 3);
//		Tv.setBrand("Apple TV");
//		Tv.setCh(0);
//		Tv.setVol(3);
		
//		Tv.print();
		Tv.power();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chUp();
		Tv.chDown();
		Tv.chDown();
		Tv.chDown();
		Tv.chDown();
		Tv.chDown();
		Tv.chDown();
		Tv.chDown();
		Tv.chDown();
		Tv.chDown();
		Tv.chDown();
		Tv.chDown();
		
		Tv.volUp();
		Tv.volUp();
		Tv.volUp();
		Tv.volUp();
		Tv.volUp();
		Tv.volUp();
		Tv.volUp();
		Tv.volUp();
		Tv.volDown();
		Tv.volDown();
		Tv.volDown();
		Tv.volDown();
		Tv.volDown();
		Tv.volDown();
		Tv.volDown();
		Tv.volDown();
		Tv.volDown();
		Tv.volDown();
		Tv.volDown();
		Tv.volDown();
		Tv.volDown();
		Tv.power();
		Tv.volDown();
		Tv.volUp();
		
		
	}

}


class Tv {
	
	private String brand;
//	private final String BRAND = "Apple TV";			// final 은 변경할 수 없는 값을 지정 / 변수명은 주로 대문자로 사용******
	private boolean power; // false
	private int ch; 
	private int vol;
	
	public Tv() {//기본생성자
//		this.vol = 3; 			// 값을 넣어 미리 고정해 줄 수 있다.
	}
	
	public Tv(String brand, int ch, int vol) {
//		this(brand, ch, vol);
		this.brand = brand;
		this.ch = ch;	//채널의 시작값이 고정이라면 this.ch = 3; 의 식을 사용할 수 있다. (따라서 메인에서 생성자를 입력할 때 : Tv Tv = new Tv("Apple TV");식 만으로 가능하다
		this.vol = vol;
	}
	
	
	//출력
	public void print() {
		System.out.println("["+brand+"] " + " 현재채널 : " + ch + " / 현재볼륨 : " + vol);			// out 은 static 이며, 기울여져 표시
	}
	
	
	//power
	public void power() {
		power=!power;
		if(power) {
			System.out.println("TV가 켜졌습니다.");
			print();
		} else {
			System.out.println("TV가 꺼졌습니다.");
		}
	}


	
	//ch
	public void chUp() {
		if(power && ch >= 20) {
			ch = 0;
			System.out.println("채널 : " + ch);
		} 
		else if(power && ch >= 0){
			ch += 1;
			System.out.println("채널 : " + ch);
		}
	}
	
	public void chDown() {
		if(ch <= 0 && power) {
			ch = 20;
			System.out.println("채널 : " + ch);
		} else if(power && ch <= 20) {			
			ch -= 1;
			System.out.println("채널 : " + ch);
		}
	}
	
	
	//vol
	public void volUp() {
		if(vol < 10 &&power) {
			vol += 1;
			System.out.println("볼륨 : " + vol);
		} else if(vol == 10 && power) {
			vol = 10;
			System.out.println("최대볼륨입니다. 볼륨 : " + vol);
		}
	}
	
	public void volDown() {
		if(vol > 0 && power) {
			vol -= 1;
			System.out.println("볼륨 : " + vol);
		} else if(vol == 0 && power) {
			vol = 0;
			System.out.println("음소거");
		}
	}
	
	
	
	
	// getter / setter
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public boolean isPower() {
		return power;
	}


	public void setPower(boolean power) {
		this.power = power;
	}


	public int getCh() {
		return ch;
	}


	public void setCh(int ch) {
		this.ch = ch;
	}


	public int getVol() {
		return vol;
	}


	public void setVol(int vol) {
		this.vol = vol;
	}
	
	
	
	
}



