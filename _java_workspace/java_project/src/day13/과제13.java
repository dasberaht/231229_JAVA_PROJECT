package day13;

import java.util.Scanner;


/*	Product 클래스 생성 : 상품을 등록하는 클래스
 * 	멤버변수 : 상품명, 가격
 * 	생성자
 * 	1. 상품추가 메서드
 * 	2. 등록된 상품을 출력하는 메서드(toString 으로 생성가능)
 */

class Product {
	
	private String name;
	private int price;
	
	public Product() {}
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	
	//메서드
	public void insertProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "name " + name + ", price " + price;
	}
	
	
	
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
}



public class 과제13 {

	public static void main(String[] args) {
		/* 상품을 10개 등록 가능한 배열 생성
		 * 스캐너를 통해 상품을 등록받기
		 * 등록한 상품 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		Product[] menu = new Product[10];					// Product 클래스를 담을 수 있는 배열 10칸을 준비한 것
		
		//상품을 등록하시겠습니까(y/n)? y = 등록 / n = 종료 (+등록한 상품 출력)
//		int cnt=0;
		Product p = new Product();
//		menu[cnt] = p;
//		cnt++;
//		Product p1 = new Product();
//		p1.inserProduct("음료", 2000);
//		menu[cnt] = p1;
//		cnt++;
//		
//		for(int i=0; i<cnt; i++) {
//			System.out.println(menu[i]);
//		}
		
		
		char c = 'y';		//반복 키워드
		int cnt=0;
		
		while(c!='n') {					//String 일 경우 (!c.equals("n"))
			System.out.println("상품을 등록하시겠습니까?(y/n)");
			
			c=scan.next().charAt(0);
			if(c=='y') {
				System.out.println("상품명 : ");
				String name = scan.next();
				System.out.println("가격 : ");
				int price = scan.nextInt();
				
				
				//객체 생성을 구문 안에서 진행해야 한다
				Product o = new Product(name, price);
				menu[cnt]=o;							//menu[cnt] = new Product(name, price);
				cnt++;
			} else {
				if(c=='n') {
					System.out.println("상품등록 종료");
				} else {
					System.out.println("y/n만 가능합니다.");
				}
			}
			
			
		}
		
		System.out.println("--등록된 상품리스트 출력--");
		for(int i=0; i<cnt; i++) {
			System.out.println((i+1)+" " +menu[i]); 				//toString 을 사용했기 때문에 sysout을 사용 / 출력메서드가 있을 경우 menu[i].print; 가능
		}
		
		
		
		
		

//		while(menu.length<=10) {
//			System.out.println("상품을 등록하시겠습니까 ( y (등록) / n(종료 및 목록출력) ?");
//			String ok = scan.next();
//			if(ok.equals("y")) {
//				for(int i=0; i<menu.length; i++) {
//					System.out.println("상품정보 입력("+ (cnt+1) + ") > ");
//					p.insertProduct(scan.next(), scan.nextInt());				
//					menu[cnt] = p;
//					cnt++;
//					System.out.println(menu[i]);
//				}
//			}  else if(ok.equals("y")==false && ok.equals("n")==false) {
//				System.out.println("잘못된 값입니다.");
//			}
//			
//			if(ok.equals("n")) {
//				System.out.println("종료");
//				System.out.println("[등록된 상품목록]");
//				for(int i=0; i<cnt; i++) {
//					System.out.println(menu[i]);
//				}
//				break;
//			}
//							
//				
//			
//			
//			
//		}
		
		
		
		
		
		scan.close();
	}

}
