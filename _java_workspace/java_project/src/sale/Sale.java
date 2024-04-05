package sale;

public class Sale<K, V> {

	/* 	 	
	 * 	sale = menu, price	//	order Class => sale 을 상속받아서 사용
	 *  order = (menu, price), count, total
	 * 
	 */
	
	private K menu;
	private V price;

	public Sale() {}
	
	public Sale(K menu, V price) {
		this.menu = menu;
		this.price = price;
	}

	
	
	
	
	
	public K getMenu() {
		return menu;
	}

	public void setMenu(K menu) {
		this.menu = menu;
	}

	public V getPrice() {
		return price;
	}

	public void setPrice(V price) {
		this.price = price;
	}

	
	
	@Override
	public String toString() {

		return "[" + menu + " " + price + "원]";
	}
	
	
	
	
	
	
	
	
	
}
