package studentmanager2;

public class Subject2 {

	//	- Subject class : 하나의 수강과목정보를 저장하는 클래스
	//	- 과목코드, 과목이름, 학점, 시수(강의시간), 교수명, 학기, 시간표, 강의장
	//	- 멤버변수, 생성자, getter/setter, toString
	
	private String subName;			//과목명
	private int subTime;			//시수
	private String subProfessor;	//담당교수
	private String subScheduler;	//시간표
	
	//기본생성자
	public Subject2() {}
	
	//생성자 - 과목명만 받는 생성자
	public Subject2(String subName) {
		this.subName = subName;
	}

	//모든 생성자
	public Subject2(String subName, int subTime, String subProfessor, String subScheduler) {
		//super();
		this.subName = subName;
		this.subTime = subTime;
		this.subProfessor = subProfessor;
		this.subScheduler = subScheduler;
	}

	
	//getter/setter
	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public int getSubTime() {
		return subTime;
	}

	public void setSubTime(int subTime) {
		this.subTime = subTime;
	}

	public String getSubProfessor() {
		return subProfessor;
	}

	public void setSubProfessor(String subProfessor) {
		this.subProfessor = subProfessor;
	}

	public String getSubScheduler() {
		return subScheduler;
	}

	public void setSubScheduler(String subScheduler) {
		this.subScheduler = subScheduler;
	}
	
	//toString
	@Override
	public String toString() {
		return "[과목명:" + subName + ", 시수:" + subTime + ", 담당교수:" + subProfessor
				+ ", 시간표:" + subScheduler + "]";
	}
	
	
}
