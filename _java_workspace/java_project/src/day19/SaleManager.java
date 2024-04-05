package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {


	/* 	제네릭 클래스 처리
	 * 	
	 * 	sale = menu, price	//	order Class => sale 을 상속받아서 사용
	 *  order = (menu, price), count, total
	 * 
	 */
	
	private ArrayList<Sale<String, Integer>> menu = new ArrayList<>();
	private ArrayList<Sale<String, Integer>> order = new ArrayList<>();
	
//	private int index = -1;
	
	public void add(Scanner scan) {
		// 제품 추가
		System.out.println("제품 추가 >");
		System.out.println("*추가할 제품의 정보를 입력하세요.");
		System.out.println("제품 >");
		String menuadd = scan.next();
		System.out.println("가격 >");
		int priceadd = scan.nextInt();
		
		Sale<String, Integer> s = new Sale<String, Integer>(menuadd, priceadd);
		this.menu.add(s);
		
//		menu.add(new Sale<String, Integer>(menuadd, priceadd));
		System.out.println("> " + menuadd + " " + priceadd + "원");
		System.out.println("*제품 추가 완료");
		System.out.println();
		
	}
	
	public void menuPrint() {
		// 제품 리스트 보기
//		System.out.println("제품 리스트 >");
//		if(menu.size()==0) {
//			System.out.println("*등록된 제품이 없습니다.");
//		} 
//		for(int i=0; i<menu.size(); i++) {
//			System.out.println(menu.get(i));
//			System.out.println();
//		}
		
		for(Sale<String, Integer> tmp : menu) {
			System.out.println(tmp);
		}
		
		
	}
	
//	public void orderPick(Scanner scan) {
//		// 제품 주문
//		// 입력받는 값은 제품명, 수량
//		// 제품명 가격*수량(지불금액)을 order 에 추가
//		// ex) 햄버거 5 => 햄버거 25000원
//		System.out.println("제품 주문 >");
//		System.out.println("제품명 >");
//		String ordermenu = scan.next();
//		System.out.println("수량 >");
//		int menucount = scan.nextInt();
//		for(int i=0; i<=order.size(); i++) {
//			if(menu.get(i).getMenu().equals(ordermenu)) {
//				Sale<String, Integer> s = new Sale<String, Integer>(ordermenu, menu.get(i).getPrice()*menucount);
//				order.add(s);
////				order.add(new Sale<String, Integer>(ordermenu, menu.get(i).getPrice()));
//				System.out.println(ordermenu + " * " + menucount);
//				System.out.println(order.get(i).getMenu() + " " + order.get(i).getPrice() + "원");
//				return;
//			}
//		}
//				
//		
//	}
	
	public void orderPick(String name, int count) {
		for(int i=0; i<menu.size(); i++) {
			String ProductMenu = menu.get(i).getMenu();
			int ProductPrice = menu.get(i).getPrice();
			if(ProductMenu.equals(name)) {
				int index = orderSearch(name);
				
				if(index != -1) {		// order 에 같은 제품이 있다면 아래 식을 진행
					int price = order.get(index).getPrice();
					order.get(index).setPrice(price+(ProductPrice*count));
					return;
				}
				// 주문한 적 없는 메뉴일 때
				Sale p = new Sale<>(ProductMenu, (ProductPrice*count));
				order.add(p);
			}
		}
		
	}
	
	
	//ex 
	// name = 주문메뉴
	public int orderSearch(String name) {
		int index = -1;
		for(int i=0; i<order.size(); i++) {
			if(order.get(i).getMenu().equals(name)) {
				index = i;
				return index;
			}
		}
		return index;
	}
	
	
	
	
	public void orderPrint() {
		// 주문내역 출력
		// 마지막에 총 지불금액 추가
//		int count = 0;
//		System.out.println("주문 내역 >");
//		if(order.size()==0) {
//			System.out.println("*내역이 없습니다.");
//		} 
//		for(int i=0; i<order.size(); i++) {
//			System.out.println(order.get(i).getMenu() + "(" + menu.get(i).getPrice() + "원)" +  " * " + order.get(i).getPrice()/menu.get(i).getPrice());
//
//			
//			for(int j=0; j<order.size(); j++) {
//				int a = order.get(i).getPrice();
//				a += order.get(j).getPrice();
//			System.out.println(a);
//			}
//		}
		
//-----------------------------------------------------	
		
		
		int sum = 0;
		for(Sale<String, Integer> tmp : order) {
			System.out.println(tmp);
			sum += tmp.getPrice();
		}
		System.out.println("총 지불금액 : " + sum);
	
	}
		
		
		
}
		

		
		

	
	
	
	
	
	
	
	
	
	

