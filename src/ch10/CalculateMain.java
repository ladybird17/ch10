package ch10;

public class CalculateMain {

	public static void main(String[] args) {
		
		//숫자만 받는 프로그램
		Calculate cal1 = new Calculate("10","5a");
		cal1.plus();
		cal1.minus();
		cal1.multi();
		cal1.divide();
		
		//정수만 받는 프로그램
		Calculate2 cal2 = new Calculate2("10","5.5");
		cal2.plus();
		cal2.minus();
		cal2.multi();
		cal2.divide();

	}

}
