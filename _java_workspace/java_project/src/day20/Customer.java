package day20;

public class Customer implements Comparable<Customer> {

	private String name;
	private int age;
	private int price;
	
	public Customer() {}
	
	public Customer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.price = (age >= 15) ? 100 : 50;
	}

	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	
	@Override
	public String toString() {
		return "고객명단 [name:" + name + ", age:" + age + ", price:" + price + "]";
	}

	
	
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
}
