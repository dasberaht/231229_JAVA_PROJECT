package day12;

public class Class05 {

	/* 객체를 생성할 때 값을 초기화 하는 방법
	 * : 기본값, 명시적 초기값, 초기화 블럭, 생성자
	 * 
	 * 1. 기본값 : 기본적으로 지정되는 값 int = 0, String = null
	 * 2. 명시적 초기값 : 멤버변수를 선언함과 동시에 값을 지정하는 방법
	 * 	private String name = "홍길동"
	 * 3. 초기화 블럭 : { } 멤버변수를 초기화
	 * 4. 생성자 : 객체를 생설할 때 초기화하여 생성
	 * 
	 * 초기값의 우선순위
	 * 기본값 < 명시적 초기값 < 초기화 블럭 < 생성자(가장 우선순위가 높음)
	 * 
	 */
	
		
	public static void main(String[] args) {
		
		EzenStudent ez = new EzenStudent("인천", "홍길동", "java", "1111");
		//toString()메서드가 없으면 객체의 주소가 출력
		//toString()메서드가 있으면 toString이 출력
		System.out.println(ez); 	//ez.toString() 같은의미
		
		
		//학생 5명 생성
		EzenStudent ez1 = new EzenStudent("강남", "영영이", "java", "2222");
		System.out.println(ez1);
		EzenStudent ez3 = new EzenStudent("부산", "동동이", "sql ", "3333");
		System.out.println(ez3);
		EzenStudent ez4 = new EzenStudent("구로", "미상이", "sql " , "4444");
		System.out.println(ez4);
		EzenStudent ez5 = new EzenStudent("강원", "동상이", "java", "5555");
		System.out.println(ez5);
		EzenStudent ez6 = new EzenStudent("강원", "경상이", "java", "6666");
		System.out.println(ez6);
		EzenStudent ez7 = new EzenStudent("충청", "영상이", "java", "7777");
		System.out.println(ez7);
		
		System.out.println("------------------------------------------------");
		
		//학생 정보를 담을 배열을 생성
		//배열명 studentArr
		EzenStudent studentArr[] = new EzenStudent[7];
		studentArr[0] = ez;
		studentArr[1] = ez1;
		studentArr[2] = ez3;
		studentArr[3] = ez4;
		studentArr[4] = ez5;
		studentArr[5] = ez6;
		studentArr[6] = ez7;
		System.out.println(studentArr[6]);
		
		System.out.println("------------------------------------------------");
		
		//searchName의 학생이 듣고있는 과목을 출력
		String searchName = "동동이";
		System.out.println("--" + searchName + " 학생이 듣고 있는 과목--");

		
		for(int i=0; i<studentArr.length; i++) {	
			if(studentArr[i].getName().equals(searchName)) {
				System.out.println(studentArr[i].getGroup());
			}
		}
		
		
		//영영이 학생이 java를 들으려고 했는데 sql로 변경
		//영영이의 정보를 출력
		
		String modify = "영영이";
				
		for(int i=0; i<studentArr.length; i++) {
			if(studentArr[i].getName().equals(modify)) {
				studentArr[i].setGroup("sql");
				System.out.println(studentArr[i]);
			}
		}

		System.out.println("------------------------------------------------");

		// 자바를 듣고있는 학생명단(모든정보)을 출력 -> 학생이 없으면 명단이 없습니다. 출력
		String subject = "dd";
		int a = 0;
		
		for(int i=0; i<studentArr.length; i++) {
			if(studentArr[i].getGroup().equals(subject)) {
				System.out.println(studentArr[i]);
				a++;
			}	
		}
		if(a==0) {
			System.out.println("명단이 없습니다.");
		} 
		
		
		
		
		
	}


	
}


class EzenStudent {
// 학생의 정보를 생성하는 클래스
// 멤버변수 : 이름, 전화번호, 과정명
	
	private String gigum = "incheon";	// 명시적 초기값
	private String name;				// 기본 초기값 null
	private String group;
	private String phone;
	
	
	//생성자
	public EzenStudent() {
	}
	
	

	public EzenStudent(String gigum, String name, String group, String phone) {
	// super();				//내 부모클래스의 생성자 호출
		this.gigum = gigum;
		this.name = name;
		this.group = group;
		this.phone = phone;
	}


	
	{
		// 초기화 블럭 영역
		gigum = "인천";
		name = "미상";
		group = "미정";
		phone = "000";
	}
	
	
	
	

	// toString() : print 메서드와 비슷한 일을 함
	@Override
	public String toString() {
		return gigum+" [ 이름 : " + name + " / 과정 : " + group + " / 번호 : " + phone + " ]";
	}


	
	//getter / setter
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getGroup() {
		return group;
	}



	public void setGroup(String group) {
		this.group = group;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}


	





	
}





