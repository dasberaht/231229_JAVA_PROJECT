package sale;

public class Order extends Sale<String, Integer> {

	/* 	 	
	 * 	sale = menu, price	//	order class => sale 을 상속받아서 사용
	 *  order = (menu, price), count, total
	 * 
	 */
	
	/* 
	 * 주문 객체
	 * Order 는 Sale(메뉴명, 가격), 수량, 합계(가격*수량) 필요
	 * Sale(메뉴명, 가격)는 상속받는 객체의 값 부모 - super
	 * 수량, 합계 : Order 만 가지고 있는 객체 - this
	 * 
	 */
	
	
	private int count;		//수량
	private int total;		//합계(가격*수량)
	
	public Order() {}
	
	public Order(String menu, int price, int count, int total) {
		super(menu, price);
		this.count = count;
		this.total = total;
		
		
		
	}
	
	public Order(String menu, int price, int count) {
		super(menu, price);
		this.count = count;
		
		this.total = price * count;
		
	}
	
	public Order(String menu, int price) {
		super(menu, price);
		
	}
	
	public Order(int total) {
		this.total = total;
	}
	
	
	
	
	
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	
		
	//주문 내역 출력 메서드
	public void Print() {
		System.out.print(super.getMenu() + " : " + super.getPrice() + "  /  ");
		System.out.println(count + " 개 주문,  총 : " + total);
	}
	
	
	
	
	
}
