package sale;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {

	/* menu
	 * | 1. 메뉴추가 | 2. 메뉴삭제 | 3. 메뉴수정(가격수정) | 
	 * | 4. 메뉴보기(전체메뉴출력) | 5. 주문 | 6. 주문내역출력(영수증) | 
	 * | 7. 종료 | 
	 * 
	 * */
	
	//메뉴를 저장하기 위한 List
	private ArrayList<Sale<String, Integer>> menu = new ArrayList<>(); 

	//주문을 저장하기 위한 List
	private ArrayList<Order> order = new ArrayList<Order>();
	
	public void addMenu() {
		menu.add(new Sale<String, Integer>("햄버거", 5000));
		menu.add(new Sale<String, Integer>("피자", 14000));
		menu.add(new Sale<String, Integer>("콜라", 2000));
		menu.add(new Sale<String, Integer>("사탕", 500));
		menu.add(new Sale<String, Integer>("과자", 1000));
		
	}
	
	
	
	//메뉴추가
	public void addmenu(Scanner scan) {
		
		System.out.println("*메뉴와 가격을 입력해주세요.");
		String menu = scan.next();
		int price = scan.nextInt();
		this.menu.add(new Sale<String, Integer>(menu, price));
		System.out.println("*추가 완료");
		
		
		
		
		
		// TODO Auto-generated method stub
		
//		System.out.println("메뉴추가 >");
//		System.out.println("*추가할 메뉴의 정보를 입력하세요.");
//		System.out.println("메뉴 >");
//		String name = scan.next();
//		System.out.println("가격 >");
//		int price = scan.nextInt();
//		
//		Sale<String, Integer> s = new Sale<String, Integer>(name, price);
//		menu.add(s);
//				
//		System.out.println("> " + name + " " + price + " 원");
//		System.out.println("*추가완료");
//		System.out.println();
		
	}

	//메뉴삭제
	public void delmenu(Scanner scan) {

		System.out.println("삭제할 메뉴 >");
		String delmenu = scan.next();
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(delmenu)) {
				//list.remove(index) / list.remove(object)
				menu.remove(i);	// i번지의 객체 삭제
				System.out.println("*삭제 완료");
				return;
			}
		}
		System.out.println("*찾는 메뉴가 없습니다.");
		
		
		
		// TODO Auto-generated method stub
		
//		System.out.println("메뉴삭제 >");
//		System.out.println("삭제할 메뉴명을 입력하세요.");
//		String name = scan.next();
//		
//		for(int i=0; i<menu.size(); i++) {
//			if(!menu.get(i).getMenu().equals(name)) {
//				System.out.println("없는 메뉴입니다.");
//				return;
//			}
//			menu.remove(i);
//			System.out.println("*삭제완료");
//			System.out.println();
//		}
		
		
	}

	//메뉴 수정
	public void modmenu(Scanner scan) {
		//list.set(index, object) : 해당 번지의 객체를 변경
		System.out.println("수정할 메뉴 >");
		String upmenu = scan.next();
		System.out.println("가격 >");
		int upprice = scan.nextInt();
		
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(upmenu)) {
//				menu.get(i).setPrice(upprice);		해당 객체의 가격만 수정
				menu.set(i, new Sale<String, Integer>(upmenu, upprice));		// 객체를 새로 만들어서 해당 번지에 set
				System.out.println("*수정 완료");
				return;
			}
		}
		System.out.println("*찾는 메뉴가 없습니다.");
		
		
		
		//		// TODO Auto-generated method stub
//		
//		System.out.println("메뉴수정(가격수정) >");
//		System.out.println("수정할 메뉴명을 입력하세요.");
//		String name = scan.next();
//		
//		for(int i=0; i<menu.size(); i++) {
//			if(!menu.get(i).getMenu().equals(name)) {
//				System.out.println("없는 메뉴입니다.");
//				return;
//			}
//			System.out.println("새로운 가격을 입력하세요.");
//			int price = scan.nextInt();
////			menu.remove(i);
//			menu.get(i).setPrice(price);
//			System.out.println("*수정완료");
//		}
		
	}

	public void printmenu() {
		//메뉴출력
		System.out.println("------메뉴------");
		for(Sale<String, Integer> s : menu) {
			System.out.println(s);
		}
		System.out.println("---------------");
		
		
		
		
		// TODO Auto-generated method stub
		
//		System.out.println("메뉴보기 >");
//		if(menu.size()==0) {
//			System.out.println("*등록된 메뉴가 없습니다.");
//			System.out.println();
//			return;
//		} 
//		for(int i=0; i<menu.size(); i++) {
//			System.out.println(menu.get(i));
//		}
		
	}

	
	public void orderpick(String name, int count) {
		// 주문
		// 메뉴와 수량을 입력받아 order 객체를 생성 후 orderList 에 추가
		// price 는 menuList 에서 가져와야 한다
		
		for(int i=0; i<menu.size(); i++) {
			if(menu.get(i).getMenu().equals(name)) {
				int price = menu.get(i).getPrice();		// 내가 주문한 메뉴의 가격
				
				//order 의 데이터가 없다면 비교자체가 불가
//				if(order.size()>0) {
//					for(int j=0; j<order.size(); j++) {
//						if()
//					}
//				}
				
				// 주문한 같은 메뉴가 없으면 -1 / 있으면 해당 번지
				int index = ordersearch(name);
				if(index != -1) { // 해당 메뉴가 있다면 아래 식 진행
					//기존 값에서 count++ / total++ 누적 필요
					int cnt = order.get(index).getCount();				// 기존 주문 수량
					int tot = order.get(index).getTotal();	// 기존 주문 금액
					order.get(index).setCount(count+cnt);
					order.get(index).setTotal(tot+(price*count));
					System.out.println("*주문 완료");
					return;
				}
				Order o = new Order(name, price, count);
				order.add(o);
				System.out.println("*주문완료!");
				return;
			}
		}
		System.out.println("*없는 메뉴 입니다.");
	}
	
	public int ordersearch(String name) {
		int index = -1;
		for(int i=0; i<order.size(); i++) {
			if(order.get(i).getMenu().equals(name)) {
				index = i;
				return index;
			}
		} return index;	// 해당 메뉴가 없다면 -1 리턴
		
	}
	
	
	
//	public void order(Scanner scan) {
//		// TODO Auto-generated method stub
//		System.out.println("주문 >");		
//		System.out.println("주문할 메뉴명을 입력하세요.");
//		String name = scan.next();
//		for(int i=0; i<menu.size(); i++) {
//			
//			if(!menu.get(i).getMenu().equals(name)) {
//				System.out.println("*등록된 메뉴가 없습니다.");
//				return;
//			}
//			if(menu.get(i).getMenu().equals(name)) {
//				System.out.println("수량 >");
//				int count = scan.nextInt();
//				Order o = new Order(menu.get(i).getMenu(), menu.get(i).getPrice(), count, (menu.get(i).getPrice()*count));
//				order.add(o);
//				System.out.println(order.get(i).getMenu() + " * " + order.get(i).getCount() + " 개");
//				return;
//			}
//			
//		}
//
//		
//	}

	public void printorder() {
		//주문 출력
		int sum = 0;
		System.out.println("----주문내역----");
		for(Order o : order) {
			sum += o.getTotal();
			o.Print();
		}
		System.out.println("-------------");
		System.out.println("총 지불금액 : " + sum + " 원");
		
		
		// TODO Auto-generated method stub
//		System.out.println();
//		System.out.println("[주문내역]");
//		int a = 0;
//		for(int i=0; i<order.size(); i++) {
//			a += order.get(i).getTotal();
//		}
//		System.out.println("총 주문금액은 " + a + " 원 입니다.");
//		System.out.println();

	}



	
	
	
	
}
