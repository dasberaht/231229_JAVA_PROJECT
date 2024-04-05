package std;

import java.util.Scanner;

public interface StdProgram {

	void printStd();				//학생 정보출력
	void addStd(Scanner scan);		//학생 추가
	void modStd(Scanner scan);		//학생 정보수정
	void delStd(Scanner scan);		//학생 삭제
	void searchStd(Scanner scan);	//학생 검색
	
	void addSub(Scanner scan);		//점수 추가
	void modSub(Scanner scan);		//점수 수정
	void delSub(Scanner scan);		//점수 삭제
	
}
