package day22;


class Bank {
	private int money = 173200;
	
	// 입금 메서드
	public synchronized void saveMoney(int save) {
		int m = this.money;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.money = m + save;
	}
	
	// 출금 메서드
	public synchronized void minusMoney(int minus) {
		int m = this.money;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.money = m - minus;
	}

	
	//getter/setter
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}



class Hong extends Thread {

	@Override
	public void run() {
		System.out.println("> '홍길동'  입금을 시작합니다.");
		Thread04.myBank.saveMoney(10000);
		System.out.println("입금 10000 원   잔액 : " + Thread04.myBank.getMoney() + " 원");
	}
	
}

class Hongwife extends Thread {

	@Override
	public void run() {
		System.out.println("> '홍길동와이프'  입금을 시작합니다.");
		Thread04.myBank.minusMoney(5000);
		System.out.println("출금 5000  원   잔액 : " + Thread04.myBank.getMoney() + " 원");
	}
	
}



public class Thread04  {

	public static Bank myBank = new Bank();	 //공유영역 (critical section)
	
	public static void main(String[] args) throws InterruptedException {

		/*	critical section 은 두 개 이상의 Thread 가 동시에 접근 할 수 있는 영역
		 * 	동시에 여러 개의 Thread 가 접근할 경우 문제가 발생할 수 있다.
		 * 	
		 *  세마포어(semaphore) 기법을 사용하여, 한 순간에 오직 하나의 Thread 만 사용가능
		 * 	세마포어를 얻은 Thread 만 접근이 가능하고, 나머지는 대기 상태가 된다.
		 * 
		 * 	동기화 키워드 : synchronized
		 * 	동기화가 필요한 메서드 앞에 선언
		 * 	
		 */

		
		/*	bank 클래스 생성
		 * 	계좌 1개 생성(bank 클래스의 객체 1개 생성)
		 * 	hong 클래스 / hondwife 클래스 생성
		 */
		
		
		Hongwife hw = new Hongwife();
		Hong h = new Hong();

		hw.start();
		
		Thread.sleep(2000);
		
		h.start();
		
		
		
		
	}

}
