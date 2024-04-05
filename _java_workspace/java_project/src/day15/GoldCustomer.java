package day15;

public class GoldCustomer extends Customer {

	//Gold / VIP 할인율 존재
	private double saleRatio;
	
	public GoldCustomer() {	}
	
	public GoldCustomer(int id, String name) {
		super(id, name);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	
	
	//할인금액 리턴이 필요하므로 calcPrice 메서드 오버라이딩
	@Override
	public int calcPrice(int price) {
//		return super.calcPrice(price);
		bonusPoint = bonusPoint+(int)(price*bonusRatio);
		
		//할인가격 
		price = price - (int)(price*saleRatio);
		return price;
	}

	
	
	//getter/setter
	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	
	
	
	
}
