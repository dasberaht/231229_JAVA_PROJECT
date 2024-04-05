package day12;

public class 과제 {

	public static void main(String[] args) {
		
		Student s = new Student("홍길동", "010101", "010-1111-1111", "20살");
		s.setPlace("인천");
		s.printStudentInfo();
		s.printAcademyInfo();
		s.subAdd("자바1", "12개월");
		s.subAdd("자바2", "6개월");
		s.subAdd("자바3", "12개월");
		s.subAdd("자바4", "6개월");
		s.subAdd("자바5", "12개월");
		s.subAdd("자바6", "12개월");
		s.printsubInfo();
		
	}

}

/* 학생 정보를 관리하는 클래스 생성
 * 학생기본정보 : 이름, 생년월일, 전화번호, 나이 					//멤버변수
 * 학원정보 : 학원명 = "EZEN"							//final static, 지정
 * 수강정보 : 수강과목, 수강기간(날짜 혹은 몇개월)				//ex) 자바 6개월/ 파이썬 7개월
 *  => 수강정보는 여러과목을 들을 수 있음(5과목까지 가능하도록)		//배열[5]
 *  
 * ex) 홍길동 000001 010-1111-1111 25
 * 	   EZEN (인천)
 * 	   자바 6개월, 파이썬 1개월, 빅데이터 3개월 ...
 * 
 * 기능(메서드)
 * 1. 학생기본정보를 출력하는 기능
 * 2. 학원정보를 출력하는 기능
 * 3. 수강정보를 출력하는 기능
 * 4. 학생의 수강정보를 추가하는 기능
 * 
 */

class Student {

	//멤버변수
	private final static String ACADEMY = "EZEN";
	private String name;
	private String birth;
	private String phone;
	private String age;
	private String period;
	private String place;

	private String sub;
	private String subArr[] = new String[5];
	private String periodArr[] = new String[5];
	
	int count = 0;
	
	
	//생성자
	public Student() {}


	public Student(String name, String birth, String phone, String age) {
//		super();
		this.name = name;
		this.birth = birth;
		this.phone = phone;
		this.age = age;
	}

	
	//학생기본정보 출력
	public void printStudentInfo() {
		System.out.println("이름 : " + name + " / " + "생년월일 : " + birth + " / " + "전화번호 : " + phone + " / "  + "나이 : " + age);
	}
	
	//학원정보 출력
	public void printAcademyInfo() {
		System.out.println("학원 : " + ACADEMY + "(" + place + ")");
	}
	
	
	//수강정보 출력
	public void printsubInfo() {
		for(int i=0; i<subArr.length; i++) {
			System.out.println("과정 : " + subArr[i] + "(" + periodArr[i] + ")");
		} 
	}
	
	
	//수강정보 추가
	public void subAdd(String sub2, String period2) {
		if(count < 5) {
			this.subArr[count] = sub2;
			this.periodArr[count] = period2;
			count++;
		} else {
			System.out.println("과정은 5개 이상 수강할 수 없습니다.");
		}
	}
	


	//getter/setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBirth() {
		return birth;
	}


	public void setBirth(String birth) {
		this.birth = birth;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getPeriod() {
		return period;
	}


	public void setPeriod(String period) {
		this.period = period;
	}


	public String getSub() {
		return sub;
	}


	public void setSub(String sub) {
		this.sub = sub;
	}


	public String[] getSubArr() {
		return subArr;
	}


	public void setSubArr(String[] subArr) {
		this.subArr = subArr;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}

	

	
}

