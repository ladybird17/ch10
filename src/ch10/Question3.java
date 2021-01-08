package ch10;

/*
 문제 3. Converter 클래스를 상속받아 
 원화를 달러로 변환하는 Won2Dollar 클래스를 생성하세요.
 실행을 위한 main 메서드는 아래와 같음
 
 결과
 원을 달러로 바꿉니다.
 원을 입력하세요 >> 24000
 변환 결과 : 20.0달러 입니다.
 */

public class Question3 {
	public static void main(String args[]) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
		toDollar.run();
	}

}
