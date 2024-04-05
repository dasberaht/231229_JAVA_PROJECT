package studentmanager2;

import java.util.Scanner;

public class StudentManager2 implements Program2 {

	// - StudentManager class : 실제 객체들을 운영하는 클래스 ('implements program' 인터페이스 사용)
	// 학생등록,수강신청....의 운영을 위해 앞의 기능들이 멤버변수로 있어야 한다.

	
	//학생의 배열을 멤버변수로 추가
	private Student2[] studentList = new Student2[5];
	//index 처리 변수
	private int stdcnt;
	
	
	//	1. 학생리스트 출력 기능	void printStudent();
	@Override
	public void printStudent() {
		System.out.println("*********전체 학생 정보*********");
		for(int i=0; i<stdcnt; i++) {
			studentList[i].stdPrint();	//학생 정보 출력 메서드
		}
		
	}

	
	//	2. 학생 등록 기능		void insertStudent(Scanner scan);	
	@Override
	public void insertStudent(Scanner scan) {
		//1명의 학생정보를 입력받아서 객체를 생성한 후 studentList에 추가
		System.out.println("학번 >");
		String stdNum = scan.next();				//StudentMain 에서 Scanner scan을 열었기 때문에 매니저 클래스에서 사용할 수 있다.
		System.out.println("학생명 >");
		String stdName = scan.next();
		System.out.println("전화번호 >");
		String stdPhone = scan.next();
		
		//입력받은 값을 객체로 생성 (Student)
		Student2 s = new Student2(stdNum, stdName, stdPhone);
		
		//배열이 다 찼을 경우
		if(stdcnt == studentList.length) {
			Student2[] tmp = new Student2[studentList.length+5];
			System.arraycopy(studentList, 0, tmp, 0, stdcnt);
			studentList = tmp;
		}
		//배열에 등록
		studentList[stdcnt] = s;
		stdcnt++;
		
	}
	
	
	//	3. 학생 검색 기능		void searchStudent(Scanner scan);	
	@Override
	public void searchStudent(Scanner scan) {
		//검색할 학생 이름을 입력받아 배열에서 탐색 후 
		//있다면 학생정보, 수강정보를 출력
		System.out.println("검색할 이름 >");
		String searchName = scan.next();
		for(int i=0; i<stdcnt; i++) {
			if(searchName.equals(studentList[i].getStdName())) {
				studentList[i].stdPrint();
				studentList[i].subPrint();
				return;
			}
		}
		System.out.println("검색한 이름이 없습니다.");
	}

	
	//	4. 수강신청 기능		void registerSubject(Scanner scan);	
	@Override
	public void registerSubject(Scanner scan) {
		//누가 무슨과목을 추가할지 설정
		//수강신청할 학생 이름을 입력받아 학생의 위치를 탐색 후 
		System.out.println("수강신청 학생명 >");
		String name = scan.next();
		int index = -1;		//학생의 번지를 저장하기 위한 변수**
		
		
		//학생의 위치를 탐색
		for(int i=0; i<stdcnt; i++) {
			if(name.equals(studentList[i].getStdName())) {
				index = i;
				break;
			}
		}
		//학생이 없다면
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		
		
		
		//그 학생의 배열에 수강과목[](배열)을 추가
		//수강과목의 객체를 생성 
		System.out.println("수강신청 과목 >");
		String sName = scan.next();
		Subject2 s = new Subject2(sName);
		
		// Student클래스(수강신청 한 학생)의 insertSubject 호출(해당 배열에 추가)
		studentList[index].insertSubject(s);
		
		
	}

	
	//	5. 수강철회 기능		void deleteSubject(Scanner scan);
	@Override
	public void deleteSubject(Scanner scan) {
		//누가 무슨과목을 *삭제*할지 설정
		//수강신청할 학생 이름을 입력받아 학생의 위치를 탐색 후 
		System.out.println("수강철회 학생명 >");
		String name = scan.next();
		int index = -1;		//학생의 번지를 저장하기 위한 변수**
		
		
		//학생의 위치를 탐색
		for(int i=0; i<stdcnt; i++) {
			if(name.equals(studentList[i].getStdName())) {
				index = i;
				break;
			}
		}
		//학생이 없다면
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		
		
		//그 학생의 배열에 수강과목[](배열)을 추가
		//수강과목의 객체를 생성 
		System.out.println("수강철회 과목 >");
		String sName = scan.next();
		//해당 학생의 수강 철회 메서드 호출******
		studentList[index].deleteSubject(sName);
		
	}

	
	
	
}
