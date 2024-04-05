package std;

import java.util.ArrayList;
import java.util.Scanner;

public class StdManager implements StdProgram {

	
	/* 학생리스트 생성 후 StdProgram 메서드 구현
	 *
	 */
	
	private ArrayList<Student> list = new ArrayList<Student>();

	
	public void add() {
		list.add(new Student("홍길동"));
		list.add(new Student("홍길순"));
		list.add(new Student("김영이"));
		list.add(new Student("김철수"));
		list.add(new Student("이미정"));
	}
	
		
	
	@Override
	public void printStd() {
		// TODO Auto-generated method stub
		for(int i=0; i<list.size(); i++) {
			list.get(i).printOne();
		}
		
	}

	@Override
	public void addStd(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학생명 >");
		String name = scan.next();
		System.out.println("나이 >");
		int age = scan.nextInt();
		System.out.println("전화번호 >");
		String phone = scan.next();
		
		Student s = new Student(name, age, phone);
		list.add(s);
		System.out.println("*학생 추가 완료");
				
	}

	
	@Override
	public void modStd(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학생명 >");
		String name = scan.next();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				System.out.println("수정할 정보(이름, 나이, 전화번호 중 하나 입력) >");
				String op = scan.next();
				System.out.println("수정할 값 입력");
				switch(op) {
				case "이름" :
					String modName = scan.next();
					list.get(i).setName(modName);
					break;
				case "나이" :
					int modAge = scan.nextInt();
					list.get(i).setAge(modAge);
					break;
				case "전화번호" :
					String modPhone = scan.next();
					list.get(i).setPhone(modPhone);
					break;
					default : System.out.println("정보가 존재하지 않습니다."); break;
				}
				System.out.println("*수정 완료");
				return;
			}
		}
		System.out.println("학생이 존재하지 않습니다.");
		
	}

	
	@Override
	public void delStd(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학생명 >");
		String name = scan.next();
		boolean result = list.remove(new Student(name));
		if(!result) {
			System.out.println("학생이 없습니다.");
			return;
		}
		System.out.println("*학생 삭제 완료");
	}

	
	@Override
	public void searchStd(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학생명 >");
		String name = scan.next();
		for(Student s : list) {
			if(s.getName().equals(name)) {
				s.printOne();
				return;
			}
		}
		System.out.println("검색된 학생이 없습니다.");	
	}

	@Override
	public void addSub(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학생명 >");
		String name = scan.next();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				System.out.println("과목 >");
				String sub = scan.next();
				System.out.println("점수 >");
				int score = scan.nextInt();
				list.get(i).addSubject(sub, score);
				return;
			}
		}
		System.out.println("학생이 없습니다.");
		
	}

	
	@Override
	public void modSub(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학생명 >");
		String name = scan.next();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				System.out.println("수정할 과목 >");
				String sub = scan.next();
				System.out.println("수정할 점수 >");
				int score = scan.nextInt();
				// list.get(i).delSubject(sub);			//삭제
				// map 중복 불가능 / 그냥 add 해도 덮어씀
				list.get(i).addSubject(sub, score);		//추가
								
				System.out.println("*수정 완료");
				return;
			}
		}
		System.out.println("학생이 없습니다.");
	}

	
	@Override
	public void delSub(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("학생명 >");
		String name = scan.next();
		System.out.println("과목 >");
		String sub = scan.next();

		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getName().equals(name)) {
				list.get(i).delSubject(sub);
				return;
			}
		}
		System.out.println("학생이 없습니다.");
	}


	

	
	
	
	
	

	
//	private ArrayList<Student> list = new ArrayList<>();
//	Student st = new Student();
//		
//	
//	
//	@Override
//	public void printStd() {
//		System.out.println("학생정보 >");
//		if(list.isEmpty()) {
//			System.out.println("학생정보가 없습니다.");
//		} else if(list.size()>=0) {
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		return;
//		}
//	}
//
//	@Override
//	public void addStd(Scanner scan) {
//		System.out.println("*등록할 학생정보를 입력하세요.");
//		System.out.println("이름 >");
//		String name = scan.next();
//		System.out.println("나이 >");
//		int age = scan.nextInt();
//		System.out.println("전화번호 >");
//		String phone = scan.next();
//		Student s = new Student(name, age, phone, null, 0);
//		list.add(s);
//		System.out.println("*등록완료");
//	}
//
//	@Override
//	public void modStd(Scanner scan) {
//		System.out.println("*수정할 학생의 이름을 입력하세요.");
//		System.out.println("이름 >");
//		String searchname = scan.next();
//		for(int i=0; i<list.size(); i++) {
//			if(searchname.equals(list.get(i).getName())) {
//				list.remove(i);
//				System.out.println("*수정할 이름 / 나이 / 전화번호를 순서대로 입력하세요.");
//				System.out.println("이름 >");
//				String name = scan.next();
//				System.out.println("나이 >");
//				int age = scan.nextInt();
//				System.out.println("전화번호 >");
//				String phone = scan.next();
//				Student s = new Student(name, age, phone, null, 0);
//				list.add(s);
//			} else if(searchname.equals(list.get(i).getName())==false){
//			System.out.println("잘못된 이름입니다.");
//			return;
//			}
//		}
//		System.out.println("*수정완료");
//		
//	}
//
//	@Override
//	public void delStd(Scanner scan) {
//		System.out.println("삭제할 학생의 이름을 입력하세요.");
//		System.out.println("이름 >");
//		String searchname = scan.next();
//		for(int i=0; i<list.size(); i++) {
//			if(searchname.equals(list.get(i).getName())) {
//				list.remove(i);
//			}
//		}
//		System.out.println("*삭제완료");
//		
//	}
//
//	@Override
//	public void searchStd(Scanner scan) {
//		System.out.println("학생 검색 >");
//		System.out.println("이름을 입력하세요.");
//		String searchname = scan.next();
//		for(int i=0; i<list.size(); i++) {
//			if(searchname.equals(list.get(i).getName())) {
//				System.out.println(list.get(i));	
//				return;
//			}
//		}
//		System.out.println("잘못된 이름입니다.");									
//	}
//
//	@Override
//	public void addSub(Scanner scan) {
//		System.out.println("점수 추가 >");
//		System.out.println("점수를 추가할 학생의 이름을 입력하세요.");
//		System.out.println("이름 >");
//		String searchname = scan.next();
//		for(int i=0; i<list.size(); i++) {
//			if(searchname.equals(list.get(i).getName())) {
//				System.out.println("점수를 추가할 과목, 점수를 입력하세요.");
//				System.out.println("과목 >");
//				String subname = scan.next();
//				System.out.println("점수 >");
//				int score = scan.nextInt();
//				list.get(i).setSubname(subname);
//				list.get(i).setScore(score);
//				System.out.println("과목 : " + subname + " / 점수 : " + score);
//				return;
//			} else {
//				System.out.println("잘못된 이름입니다.");	
//
//			}
//		}
//	}
//
//	@Override
//	public void modSub(Scanner scan) {
//		System.out.println("점수 수정 >");
//		System.out.println("점수를 수정할 학생의 이름을 입력하세요.");
//		System.out.println("이름 >");
//		String searchname = scan.next();
//		for(int i=0; i<list.size(); i++) {
//			if(searchname.equals(list.get(i).getName())) {
//				System.out.println("수정할 과목명을 입력하세요.");
//				String subname = scan.next();
//				if(subname.equals(list.get(i).getSubname())) {
//					System.out.println("점수를 입력하세요.");
//					int score = scan.nextInt();
//					list.get(i).setScore(score);
//					System.out.println("*수정완료");
//				}
//				
//				return;
//			} else {
//				System.out.println("잘못된 이름입니다.");
//			}
//		}
//	}
//
//	@Override
//	public void delSub(Scanner scan) {
//		System.out.println("점수 삭제 >");
//		System.out.println("점수를 삭제할 학생의 이름을 입력하세요.");
//		System.out.println("이름 >");
//		String searchname = scan.next();
//		for(int i=0; i<list.size(); i++) {
//			if(searchname.equals(list.get(i).getName())) {
//				System.out.println("삭제할 과목명을 입력하세요.");
//				String subname = scan.next();
//				if(subname.equals(list.get(i).getSubname())) {
//					list.get(i).setScore(0);
//					System.out.println("*삭제완료");
//				}
//				
//				return;
//			} else {
//				System.out.println("잘못된 이름입니다.");
//			}
//		}
//		
//	}


	
}
