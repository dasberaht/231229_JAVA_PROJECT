package studentmanager;

import java.util.Scanner;


// - StudentManager class : 실제 객체들을 운영하는 클래스 ('implements program' 인터페이스 사용)
// 학생등록,수강신청....의 운영을 위해 앞의 기능들이 멤버변수로 있어야 한다.


public class StudentManager implements Program {

	Student st = new Student();
	Student stArr[] = new Student[5];
	
	int count;
	
	
	
	
	
	//	1. 학생리스트 출력 기능	void printStudent();
	@Override
	public void printStudent() {
		for(int i=0; i<count; i++) {
			stArr[i].printstudentinfo();
			stArr[i].printsubinfo();
		}
		
	}

	
	//	2. 학생 등록 기능		void insertStudent(Scanner scan);
	@Override
	public void insertStudent(Scanner scan) {
		System.out.println("학생 정보를 입력해주세요. 1)학번 2)이름 3)나이 4)전화번호 5)주소");
		Student stinsert = new Student(scan.nextInt(), scan.next(), scan.nextInt(), scan.next(), scan.next());
		stArr[count] = stinsert;
		count++;
		
	}

	
	//	3. 학생 검색 기능		void searchStudent(Scanner scan);
	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("학생 이름을 입력해주세요.");
		String stname = scan.next();
		for(int i=0; i<count; i++) {
			if(stname.equals(stArr[i].getStudentname())) {
				printStudent();
			} else if(stname.equals(stArr[i].getStudentname())==false) {
				System.out.println("이름이 존재하지 않습니다. 이름을 확인해주세요.");
			}
				
		} 
		
		
	}

	
	//	4. 수강신청 기능		void registerSubject(Scanner scan);
	@Override
	public void registerSubject(Scanner scan) {
		System.out.println("수강 신청할 학생의 이름을 입력해주세요.");
		String stname = scan.next();
		for(int i=0; i<count; i++) {
			if(stArr[i].getStudentname().equals(stname) && count < 5) {
				System.out.println("수강하실 과목 정보를 입력해주세요. 1)과목명 2)과목코드");
				Subject subadd = new Subject(scan.next(), scan.nextInt());
				stArr[i].insertsubinfo(subadd);
				System.out.println("등록 완료");
			} else if(stArr[i].getStudentname().equals(stname)==false){
				System.out.println("이름이 존재하지 않습니다. 이름을 확인해주세요.");
			} else if(count == 5) {
				System.out.println("5과목 이상 수강할 수 없습니다.");
			}
		} 
	}

	
	//	5. 수강철회 기능		void deleteSubject(Scanner scan);
	@Override
	public void deleteSubject(Scanner scan) {
		System.out.println("수강 철회할 학생의 이름을 입력해주세요.");
		String stname = scan.next();
		for(int i=0; i<count; i++) {
			if(stArr[i].getStudentname().equals(stname)) {
				System.out.println("수강 철회할 과목명을 입력해주세요.");
				String delsub = scan.next();
				stArr[i].delsubinfo(delsub);
				System.out.println("철회 완료");
			}
		} 
		
		
	}
	
}





