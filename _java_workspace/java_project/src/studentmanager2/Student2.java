package studentmanager2;

public class Student2 {

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
//		int -> 정수형 숫자 -> 연산이 필요한 자료
	
	private String stdNum;
	private String stdName;
	private String stdPhone;
	
	private Subject2[] subjectList = new Subject2[5];
	private int cnt;	//subjectList 배열의 index 역할
	
	//기본생성자
	public Student2() {}
	
	
	//생성자
	public Student2(String stdNum, String stdName, String stdPhone) {
		this.stdName = stdName;
		this.stdNum = stdNum;
		this.stdPhone = stdPhone;
	}

	
	//[메서드]
	//학생정보메서드 (toString 사용가능)
	public void stdPrint() {
//		System.out.println("**학생정보**");
		System.out.println("학생명:"+stdName+"("+stdNum+") / "+stdPhone);
	}
	
	//수강과목출력메서드 : 배열로 여러과목이 존재**(for문 활용)
	public void subPrint() {
		//Subject 클래스의 toString을 호출하여 출력
		if(cnt==0) {	//if문을 먼저 처리(에러 날 수 있는 것을 먼저 확인)***
			System.out.println("수강 중인 과목이 없습니다.");
			return;		//return 후 아래 식을 처리하지 않도록 하기 위함
		}
		for(int i=0; i<cnt; i++) {
			System.out.println(subjectList[i]);		//toString 호출 (toString은 객체의 내용이 문자로 리턴 sysout(객체) -> toString 호출)***
		}
	}
	
	
	//수강과목추가메서드
	//매개변수 : 수강과목 객체 Subject; subjectList 배열에 해당 객체 담기
	public void insertSubject(Subject2 sub) {
		//배열이 다 찼다면, 배열을 늘려주기? -> 배열은 길이를 정하면 변경 불가
		//따라서, 더 긴 길이의 배열을 생성하여 배열 복사 후 배열 바꾸기***
		if(cnt == subjectList.length) {
			Subject2[] tmp = new Subject2[subjectList.length+5];

			//배열복사
			System.arraycopy(subjectList, 0, tmp, 0, cnt);
			subjectList = tmp;

		}
		
		//subjectList 배열에 해당 객체 담기
		subjectList[cnt] = sub;
		cnt++;
		
	}
	
	
	//수강과목삭제메서드*****
	public void deleteSubject(String subName) {
		//수강과목 배열에서 subName을 검색하여 삭제
		int index = -1;
		if(subName == null) {
			return;
		} 
		for(int i=0; i<cnt; i++) {		// 위치 찾기
			if(subjectList[i].getSubName().equals(subName)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("찾는 과목이 없습니다.");
			return;
		}
		//삭제 : 찾은 위치부터 뒷 번지를 -> 앞 번지로 옮기는 작업; 끝 번지는 null 처리
		for(int i=index; i<cnt-1; i++) {	// cnt의 범위를 하나 적게한다 (배열의 마지막 번지가 다음 수가 없기 때문에 하나 전까지만 범위를 설정)
			subjectList[i] = subjectList[i+1];
		}
		//끝 번지는 null 처리
		subjectList[cnt-1] = null;
		//한 과목 삭제 -> 과목 개수가 줄어듬
		cnt--;
		
	}
	
	
	
	
	
	
	
	
	
	//getter/setter
	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdPhone() {
		return stdPhone;
	}

	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}

	
	//toString
	@Override
	public String toString() {
		return "Student2 [stdNum=" + stdNum + ", stdName=" + stdName + ", stdPhone=" + stdPhone + ", cnt=" + cnt + "]";
	}
	
	
	
	
	
}
