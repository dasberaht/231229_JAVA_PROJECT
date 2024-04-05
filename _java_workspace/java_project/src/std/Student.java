package std;

import java.util.HashMap;
import java.util.Objects;

public class Student {

	/* 	멤버변수 : 이름 / 나이 / 전화번호 / map(과목/점수) / 합계 / 평균
	 * 	생성자 / 메서드 / getter/setter / 출력메서드(toString)
	 * 	메서드
	 * 	 - 출력메서드(학생정보 / 과목점수(성적표) / 합계 / 평균) 
	 *   - map (과목, 점수) 데이터를 '추가'하는 메서드
	 *   - map (과목, 점수) 데이터를 '삭제'하는 메서드
	 */
	
	// 멤버변수는 private 설정
	// 클래스명은 대문자로 시작 / 변수명, 메서드명은 소문자로 시작
	// 변수명, 메서드명에 단어가 많아지면, 다음 시작단어 대문자 (*카멜케이스 기법)
	// indent : 들여쓰기 잘 맞추기
	
	private String name;
	private int age;
	private String phone;
	
	private HashMap<String, Integer> subject = new HashMap<String, Integer>();
	
	private int sum;
	private double avg;
	
	//기본생성자
	public Student() {}
	//이름 생성자
	public Student(String name) {
		this.name = name;
		this.age = 15;		// 나이 고정
	}
	
	
	public Student(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	
	
	//출력 메서드
	//학생 한 사람의 정보출력
	public void printOne() {
		System.out.print(name + "(" + age + ") / ");
		if(phone != null) {
			System.out.println(phone);
		}
		System.out.println();
		if(subject.size() <= 0) {
			System.out.println("점수가 없습니다.");
			System.out.println("----------------");
			return;
		}
		printSub();
		calc();
		System.out.println("result : " + sum  + "(" + avg + ")");
		System.out.println("----------------");
	}
	
	//학생의 성적표 출력 - map 출력
	public void printSub() {
		System.out.println("-----------------");
		for(String sub : subject.keySet()) {
			System.out.println(sub + " : " + subject.get(sub));
		}
		System.out.println("-----------------");
	}
	
	//합계 평균 계산 출력
	public void calc() {
		this.sum = 0;
		this.avg = 0;
		for(String sub : subject.keySet()) {
			sum += subject.get(sub);
		}
		avg = (double)sum / subject.size();
	}
	
	//과목 추가
	public void addSubject(String sub, int score) {
		subject.put(sub, score);
		System.out.println("*점수 추가");
	}
	
	//과목 삭제
	public void delSubject(String sub) {
		if(subject.remove(sub) == null) {
			System.out.println("해당 과목이 없습니다.");
			return;
		} 
		subject.remove(sub);
		System.out.println("*점수 삭제");
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", phone=" + phone + ", subject=" + subject + ", sum=" + sum
				+ ", avg=" + avg + "]";
	}
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	public HashMap<String, Integer> getSubject() {
		return subject;
	}
	public void setSubject(HashMap<String, Integer> subject) {
		this.subject = subject;
	}
	
	
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, avg, name, phone, subject, sum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)	//this 와 obj 의 주소가 같다면
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())	// 클래스 정보가 다르다면, false
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);	// 이름만 같다면(같은 객체로 본다), true 
//		return age == other.age && Double.doubleToLongBits(avg) == Double.doubleToLongBits(other.avg)
//				&& Objects.equals(name, other.name) && Objects.equals(phone, other.phone)
//				&& Objects.equals(subject, other.subject) && sum == other.sum;
	}
	
	

	
	
	
	
	
	
	
	
	
//	private String name;
//	private int age;
//	private String phone;
//	
//	private String subname;
//	private int score;
//	
//	private HashMap<String, Integer> map = new HashMap<String, Integer>();
//	
//	private int count;
//	
//	//기본생성자
//	public Student() {}
//	
//	//생성자
//	public Student(String name, int age, String phone, String subname, int score) {
//		this.name = name;
//		this.age = age;
//		this.phone = phone;
//		this.subname = subname;
//		this.score = score;		
//		map.put(subname, score);
//	}
//
//	//학생정보만 받는 생성자
//	public Student(String name, int age, String phone) {
//		this.name = name;
//		this.age = age;
//		this.phone = phone;
//	}
//	
//	//과목정보
//	public Student(String subname, int score) {
//		this.subname = subname;
//		this.score = score;
//	}
//	
//	
//	
//	
//	//	출력메서드(학생정보 / 과목점수(성적표) / 합계 / 평균) 
//	public void stdinfoprint(String name, int age, String phone, String subname, int score) {
//		System.out.println("[이름 : " + name + " / 나이 : " + age + " / 전화번호 : " + phone + " / 과목 : " + subname + " / 점수 : "
//				+ score + "]");
//	}
//	
//	
//	//getter/setter
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	public String getPhone() {
//		return phone;
//	}
//
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//
//	public HashMap<String, Integer> getMap() {
//		return map;
//	}
//
//	public void setMap(HashMap<String, Integer> map) {
//		this.map = map;
//	}
//
//	public String getSubname() {
//		return subname;
//	}
//
//	public void setSubname(String subname) {
//		this.subname = subname;
//	}
//
//	public int getScore() {
//		return score;
//	}
//
//	public void setScore(int score) {
//		this.score = score;
//	}
//
//	public int getCount() {
//		return count;
//	}
//
//	public void setCount(int count) {
//		this.count = count;
//	}
//
//	
//	
//	
//	@Override
//	public String toString() {
//		return "[이름 : " + name + " / 나이 : " + age + " / 전화번호 : " + phone + " / 과목 : " + subname + " / 점수 : "
//				+ score + "]";
//	}
//
//	
//	
//	
//
//	
//	
//	
//	
	
}
