package ch10;

//Exception 클래스를 상속한, 사용 정의 예외 클래스
public class BalanceException extends Exception {
	//생성자 두개 필요 : 기본 생성자, 매개변수 생성자
	public BalanceException() {
		
	}
	public BalanceException(String message) {
		super(message);
	}
}
