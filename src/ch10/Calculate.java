package ch10;


/*
문제 1. 사용자 입력값이 숫자가 아닐 경우 예외를 발생시키는
사용자 정의 예외 클래스를 선언하고, 해당 예외 클래스를 사용하여
사칙연산을 하는 계산기 프로그램을 작성하세요.
조건1) 예외 클래스를 따로 선언
조건2) 계산기 프로그램에서 예외처리 부분이 반드시 필요함
조건3) 메소드 throw 사용
*/

public class Calculate {
	private double num1;
	private double num2;
	
	public Calculate() { //생성자
		this("0","0");
	}
	
	public Calculate(String data1, String data2) { //main에서 값 2개 받는 생성자
		try {
			this.setNum1(data1);
			this.setNum2(data2);
		}
		catch(NotNumException e) {
			System.out.println(e.getStackTrace()+"에서 오류가 발생했습니다.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	
	public double getNum1() {
		return num1;
	}
	
//	NotNumException을 직접 처리하지 않고 setNum1 메서드를 호출한 곳에서 처리하도록 예외 넘기기를 함
	public void setNum1(String num1) throws NotNumException{
		//숫자인 정수, 실수 다 받도록 함
		try {
			this.num1 = Double.parseDouble(num1);
		}
		catch (Exception e) {
//			오류 발생 시 사용자 정의 Exception 인 NotNumException 예외를 발생 시킴
			throw new NotNumException("숫자를 입력하세요"); //처리될 NotNumException에 메시지 저장
		}
	}
	
	public double getNum2() {
		return num2;
	}
	
	public void setNum2(String num2) throws NotNumException{
		try {
			this.num2 = Double.parseDouble(num2);
		}
		catch (Exception e) {
			throw new NotNumException("숫자를 입력하세요");
		}
	}
	
	public void plus() {
		double result = 0;
		try {
			result = num1+num2;
			System.out.printf("두 수의 덧셈은 %.2f입니다.\n",result);
		}
		catch(ArithmeticException e) {
			System.out.println("잘못된 연산입니다.");
		}
	}
	
	public void minus() {
		double result = 0;
		try {
			result = num1-num2;
			System.out.printf("두 수의 뺄셈은 %.2f입니다.\n",result);
		}
		catch(ArithmeticException e) {
			System.out.println("잘못된 연산입니다.");
		}
	}
	
	public void multi() {
		double result = 0;
		try {
			result = num1*num2;
			System.out.printf("두 수의 곱셈은 %.2f입니다.\n",result);
		}
		catch(ArithmeticException e) {
			System.out.println("잘못된 연산입니다.");
		}
		
	}
	
	public void divide() {
		double result = 0;
		try {
			result = num1/num2;
			System.out.printf("두 수의 나눗셈은 %.2f입니다.\n",result);
		}
		catch(ArithmeticException e) {
			System.out.println("잘못된 연산입니다.");
		}
		
	}
}
