package day13;

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

public class 학원과제 {

	public static void main(String[] args) {

		Student st = new Student();
		st.setName("홍길동");
		st.setPhone("010-1111-1111");
		st.printInfo();
		st.printCompany();
		st.printCourse();
		System.out.println();
		
		Student st1 = new Student("hong", "010-2222-2222", "incheon");
		st1.printInfo();
		st1.printCompany();
		st1.insertCourse("java", "5개월");
		st1.insertCourse("html", "1개월");
		st1.insertCourse("html", "1개월");
		st1.insertCourse("html", "1개월");
		st1.insertCourse("html", "3개월");
		st1.insertCourse("html", "1개월");
		st1.printCourse();
		System.out.println();
		
		Student st2 = new Student("pack", "000101", "010-3333-3333", 25, "seoul");
		st2.printInfo();
		st2.printCompany();
		st2.insertCourse("java", "5개월");
		st2.printCourse();
		System.out.println();
		Student st3 = new Student("pack2", "111111", "010-4444-4444", 20, "seoul");
		st3.printInfo();
		st3.printCompany();
		st3.insertCourse("java", "5개월");
		st3.insertCourse("html", "3개월");
		st3.printCourse();
		System.out.println();
		Student st4 = new Student("pack3", "222222", "010-5555-5555", 25, "incheon");
		st4.printInfo();
		st4.printCompany();
		st4.insertCourse("java", "5개월");
		st4.insertCourse("java", "6개월");
		st4.insertCourse("html", "1개월");
		st4.printCourse();
		System.out.println();
		Student st5 = new Student("pack4", "333333", "010-6666-6666", 26, "seoul");
		st5.printInfo();
		st5.printCompany();
		st5.insertCourse("java", "5개월");
		st5.insertCourse("html", "1개월");
		st5.printCourse();
		System.out.println();
		Student st6 = new Student("pack5", "444444", "010-7777-7777", 25, "guro");
		st6.printInfo();
		st6.printCompany();
		st6.insertCourse("java", "5개월");
		st6.printCourse();
		System.out.println();
		Student st7 = new Student("pack6", "555555", "010-8888-8888", 30, "incheon");
		st7.printInfo();
		st7.printCompany();
		st7.insertCourse("java", "5개월");
		st7.insertCourse("html", "6개월");
		st7.insertCourse("java", "3개월");
		st7.printCourse();
		System.out.println();
		
		
		
		Student[] std = new Student[8];
		std[0] = st;
		std[1] = st1;
		std[2] = st2;
		std[3] = st3;
		std[4] = st4;
		std[5] = st5;
		std[6] = st6;
		std[7] = st7;
		
		System.out.println("------------------------------");
		String searchName = "hong";
		//hong 학생의 '학생정보, 학원정보, 수강정보'를 출력
		System.out.println(searchName + " 님의 검색정보-----");
		for(int i=0; i<std.length; i++) {
			if(std[i].getName().equals(searchName)) {						// searchName.eqauls(std[i].getName()) 같은 식**
				std[i].printInfo();
				std[i].printCompany();
				std[i].printCourse();
			}
		}
		
		
		System.out.println("------------------------------");
		//incheon 지점의 학생들을 모두 검색하여 '학생정보'만 출력		
		System.out.println("incheon" + " 지점의 검색정보-----");
		for(int i=0; i<std.length; i++) {
			if(std[i].getBranch()!="incheon") {
				
			} else if(std[i].getBranch().equals("incheon")){
				std[i].printInfo();
			}
			
		}
		
		
		System.out.println("------------------------------");
		//java 과목을 수강하는 학생들을 검색하여 '학생정보, 학원정보(지점)' 출력
		String searchCourse = "java";
		System.out.println(searchCourse + " 수강 중인 학생정보-----");
		int cnt=0;
		while(cnt<std.length) {
			for(int i=0; i<std[cnt].getCourse().length; i++) {
				if(std[cnt].getCourse()[i] != null) {
					if(searchCourse.equals(std[cnt].getCourse()[i])) {
//						std[cnt].printCompany();
						std[cnt].printInfo();
//						std[cnt].printCourse();
					}
				}
			}
			cnt++;
		}
		
		
		
		
	
		
		

		
		
		
		
	}

}


class Student{
	
	private String name;
	private String birth;
	private String phone;
	private int age;
	private final static String COMPANY = "EZEN";		//final 은 대문자로 변수명 처리**
	private String branch;
	
	private String[] course = new String[5];			//수강과목
	private String[] period = new String[5];			//수강기간
	private int cnt;									//배열의 index 처리용 번지
	
	
	//기본생서자
	public Student() {}
	
	//생성자1
	public Student(String name, String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
	}
	
	//생성자2
	public Student(String name, String birth, String phone, int age, String branch) {
		this(name, phone, branch);						//생성자 호출(반드시 첫번째 라인에서만 호출이 가능하다)**
		this.birth = birth;
		this.age = age;
	}
	
	//method
	//학생의 기본정보 출력
	public void printInfo() {
		System.out.println("[학생정보]");
		System.out.println("이름 : " + name + "(" + age + "세, " + birth + ") / " + phone);
	}
	
	//학원, 지점 정보 출력
	public void printCompany() {
		System.out.println("[학원정보]");
		System.out.println("학원명 : " + COMPANY + " / 지점명 : " + branch);
	}

	//수강정보 출력
	public void printCourse() {
		if(course.length==0 || cnt==0) {	//등록한 과목이 없을 경우
			System.out.println("수강한 과목이 없습니다.");
			return;		//다음 식으로 넘어가지 않도록 중단**
		}
		//cnt 까지만 출력 -> 추가되지 않은 값은 출력되면 X
		for(int i=0; i<cnt; i++) {
			System.out.println("과정 : " + course[i] + "(" + period[i] + ")");
		}
	}
	
	//수강정보 등록(추가)
	//insertCourse()
	//매개변수 course, period 를 주고 -> 배열에 추가 (배열을 완성시킬 뿐, 리턴 값은 없다)
	public void insertCourse(String course, String period) {
		//현재 cnt = 0; 이며, 추가 값이 없는 상태
		if(cnt>=5) {
			//또는 배열을 더 늘려, 많은 수강을 받을 수도 있다. (배열 복사)**
			System.out.println("더 이상 수강하실 수 없습니다.");
			return;
		}
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public static String getCompany() {
		return COMPANY;
	}
	
}


