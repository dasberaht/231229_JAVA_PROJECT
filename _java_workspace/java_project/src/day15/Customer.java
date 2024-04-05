package day15;

public class Customer {

	/*	일반고객 / Gold고객(할인) / VIP고객(할인)
	 *	 
	 *	일반고객 
	 *	- 고객ID : int customer ID
	 *	- 고객이름 : String customerName
	 *	- 고객등급 : String customerGrade
	 *	- 보너스포인트 : int bonusPoint
	 *	- 보너스적립비율 : double bonusRatio
	 *
	 * 	클래스 생성 시
	 * 	
	 * 	일반고객일 경우
	 * 	- 기본 : customerGrade : "Silver"
	 *  - bonusRatio : 0.01 -> 1% 적립
	 *   
	 * 	- 메서드
	 *   1. 보너스 적립 계산 메서드 (메서드명 : calcPrice(int price))
	 *    -> 구매금액을 주고 적립 보너스를 계산하여, bonusPoint에 누적
	 *    -> 보너스 적립, 할인여부를 체크해서 구매 price 리턴
	 *   
	 *   2. 출력 메서드 (메서드명 : customerInfo())
	 *    -> 홍길동 님 등급은 VIP이며, 보너스 포인트는 000,000 점 입니다.
	 *    -> (VIP고객만 출력)전담상담사 번호는 000-00000-0000 입니다.;멤버변수.. 
	 *    
	 *  등급
	 *  - Silver 등급
	 *   : 제품을 구매 할 때 - 0% 할인 / 보너스포인트 1% 적립
	 *  - Gold 등급
	 *   : 제품을 구매 할 때 - 10% 할인 / 보너스포인트 2% 적립
	 *  - VIP 등급
	 *   : 제품을 구매 할 때 - 10% 할인 / 보너스포인트 5% 적립 / 전담 상담사 코드 또는 이름을 저장(멤버변수에 추가; int agentID)
	 *	
	 *
	 *	GoldCustomer extends Customer {
	 *  	// 기본메서드를 오버라이딩 하여 사용
	 *  }
	 *	VIPCustomer extends Customer {
	 *  	// 기본메서드를 오버라이딩 하여 사용
	 *  }
	 *
	 *	CustomerMain 클래스를 생성하여 확인*
	 *
	 *
	 */
		
	protected int customerID;					// protected 상속을 받는 자식은 그대로 사용할 수 있다.
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	private int agentID;	//VIP 전용
	
	int count;
	
	//생성자
	public Customer() {}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	//메서드
	//가격을 매개변수로 받아 포인트 적립 / 할인가격 리턴
	public int calcPrice(int price) {
		bonusPoint = bonusPoint+(int)(price*bonusRatio);
		return price;
	}


	//고객정보 출력 메서드
	public void customerInfo() {
		System.out.println(customerName + " 님의 등급은 " + customerGrade + " 이며, "
							+ "보너스 포인트는 " + bonusPoint + " 점 입니다.");
	}

	
	
	
	
	//getter/setter
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	
	
	
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + ", agentID=" + agentID
				+ ", count=" + count + "]";
	}
	
	
	
	
	
}



