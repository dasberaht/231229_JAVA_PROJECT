package day15;

public class VIPCustomer extends Customer {

	private double saleRatio;
	private int agentID;
	
	public VIPCustomer() {}
	
	public VIPCustomer(int id, String name, int agentid) {
		super(id, name);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		agentID = agentid;
	}

	
	
	@Override
	public int calcPrice(int price) {
		bonusPoint = bonusPoint+(int)(price*bonusRatio);
		price = price - (int)(price*saleRatio);
		return price;
		
	}

	@Override
	public void customerInfo() {
		super.customerInfo();
		System.out.println("담당 상담원 번호는 " + agentID + " 입니다.");
	}

	
	
	
	
	
	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	
	
	
	
	
}
