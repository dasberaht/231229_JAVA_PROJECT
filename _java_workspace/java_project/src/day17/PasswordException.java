package day17;

public class PasswordException extends IllegalArgumentException {

	private static final long serialVersionUID = 1L;

	/*	사용자정의Exception 생성할 때 조건
	 * 	IllegalArgumentException 사용자정의Exception 정의 시 상속
	 * 
	 */
	
	public PasswordException(String message) {
		super(message);
	}
	
}
