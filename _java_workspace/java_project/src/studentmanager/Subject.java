package studentmanager;

public class Subject {

//	- Subject class : 하나의 수강과목정보를 저장하는 클래스
//	- 과목코드, 과목이름, 학점, 시수(강의시간), 교수명, 학기, 시간표, 강의장
//	- 멤버변수, 생성자, getter/setter, toString
	
	private int subcode;
	private String subname;
	private int subpoint;
	private int subtime;
	private String profname;
	private String semester;
	private String timetable;
	private String place;
	
	
	//기본생성자
	public Subject() {}

	//생성자1
	public Subject(int subcode, String subname, int subpoint, int subtime, String profname, String semester,
			String timetable, String place) {
//		super();
		this.subcode = subcode;
		this.subname = subname;
		this.subpoint = subpoint;
		this.subtime = subtime;
		this.profname = profname;
		this.semester = semester;
		this.timetable = timetable;
		this.place = place;
	}


	//생성자2		과목코드만 받는 -> 수강신청용
	public Subject(String subname, int subcode) {
		this.subname = subname;
		this.subcode = subcode;
	}
	
	
	@Override
	public String toString() {
		return "[과목코드:" + subcode + "]" + " 과목명:" + subname;
	}


	
	
	//getter/setter
	public int getSubcode() {
		return subcode;
	}


	public void setSubcode(int subcode) {
		this.subcode = subcode;
	}


	public String getSubname() {
		return subname;
	}


	public void setSubname(String subname) {
		this.subname = subname;
	}


	public int getSubpoint() {
		return subpoint;
	}


	public void setSubpoint(int subpoint) {
		this.subpoint = subpoint;
	}


	public int getSubtime() {
		return subtime;
	}


	public void setSubtime(int subtime) {
		this.subtime = subtime;
	}


	public String getProfname() {
		return profname;
	}


	public void setProfname(String profname) {
		this.profname = profname;
	}


	public String getSemester() {
		return semester;
	}


	public void setSemester(String semester) {
		this.semester = semester;
	}


	public String getTimetable() {
		return timetable;
	}


	public void setTimetable(String timetable) {
		this.timetable = timetable;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}
	
	
	
	
	
	
	
	
	
}
