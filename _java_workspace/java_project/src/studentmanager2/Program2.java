package studentmanager2;

import java.util.Scanner;

public interface Program2 {
	/*	1. 학생리스트 출력 기능	void printStudent();
	2. 학생 등록 기능		void insertStudent(Scanner scan);
	3. 학생 검색 기능		void searchStudent(Scanner scan);
	4. 수강신청 기능		void registerSubject(Scanner scan);
	5. 수강철회 기능		void deleteSubject(Scanner scan);
	*/
	
	void printStudent();
	void insertStudent(Scanner scan);
	void searchStudent(Scanner scan);
	void registerSubject(Scanner scan);
	void deleteSubject(Scanner scan);
	
}