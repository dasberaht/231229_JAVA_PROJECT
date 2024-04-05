package studentmanager;

//import java.util.Scanner;

public class Student {

//	- Student class : 한 학생의 정보를 저장하는 클래스
//	- 학번, 이름, 나이, 전화번호, 주소, 수강과목(여러 과목; 배열?)
//	- 멤버변수, 생성자, getter/setter, toString
//	- 멤버변수에 학생이 듣고자 하는 과목을 저장 Subject[]
//	- 메서드 :
//		0. 학생정보 출력 메서드
//		1. 수강과목 추가 메서드
//		2. 수강과목 삭제 메서드 (배열은 삭제의 개념이 없다)
//			배열의 값을 null로 변경
//			null 변경 후 남은 배열의 값들을 앞으로 땡겨와야 한다
//		3. 수강과목 출력 메서드
	
	private int studentcode;
	private String studentname;
	private int age;
	private String studentphone;
	private String studentaddress;
	
	private int count = 0;
	
	Subject sub = new Subject();
	Subject subArr[] = new Subject[5];
		
	
	public Student() {}

	public Student(int studentcode, String studentname, int age, String studentphone, String studentaddress) {
		//super();
		this.studentcode = studentcode;
		this.studentname = studentname;
		this.age = age;
		this.studentphone = studentphone;
		this.studentaddress = studentaddress;
	}

	//학생정보 출력 메서드
	public void printstudentinfo() {
		System.out.println("[학번:" + studentcode + "] 이름:" + studentname + "  나이:" + age + "  전화번호:" + 
							studentphone + "  주소:" + studentaddress);
	}
	
	
	//수강과목 출력 메서드
	public void printsubinfo() {
		if(count==0) {
			System.out.println("수강중인 과목이 없습니다.");
		}
		for(int i=0; i<count; i++) {
			System.out.println(subArr[i]);	
		}
	}
	
	
	//수강과목 추가 메서드
	public void insertsubinfo(Subject a) {
		
		if(count < 5) {
			subArr[count] = a;
			count++;
		}
		
	}
	
	
	//수강과목 삭제 메서드 (배열을 삭제하는 것이 아닌, null 값으로 바꾸는 것; 단, 배열의 순서를 앞으로 당겨야한다)
	public void delsubinfo(String subname) {
//		for(int i=0; i<count; i++) {
//			if(subArr[i].getSubname().equals(subname)) {
//				subArr[i] = null;
//			}
//		}
		
		for(int i=0; i<count; i++) {
			if(subArr[i].getSubname().equals(subname)) {
				subArr[i] = null;				
			}
			if(subArr[i]==null) {
				i--;
			}
		}
		
		
	}
	
	
	
	
	

	//getter/setter
	public int getStudentcode() {
		return studentcode;
	}



	public void setStudentcode(int studentcode) {
		this.studentcode = studentcode;
	}



	public String getStudentname() {
		return studentname;
	}



	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getStudentphone() {
		return studentphone;
	}



	public void setStudentphone(String studentphone) {
		this.studentphone = studentphone;
	}



	public String getStudentaddress() {
		return studentaddress;
	}



	public void setStudentaddress(String studentaddress) {
		this.studentaddress = studentaddress;
	}

	
	
	public Subject[] getSubArr() {
		return subArr;
	}

	
	
	public void setSubArr(Subject[] subArr) {
		this.subArr = subArr;
	}
	
	
	
	
	
}
