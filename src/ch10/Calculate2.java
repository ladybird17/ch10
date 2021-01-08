package ch10;

public class Calculate2 {
	/*
	 문제 2. 문제1의 소스를 정수가 아닐 경우 예외를 발생하는 프로그램으로 수정
	 */
	
	private int num1;
	private int num2;
	
	public Calculate2() {
		this("0","0");
	}
	
	public Calculate2(String data1, String data2) {
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
	
	public int getNum1() {
		return num1;
	}
	
	public void setNum1(String num1) throws NotNumException{
		
		double result = 0.0;
		
		try {
			result = Double.parseDouble(num1);
		}
		catch (Exception e) {
			throw new NotNumException("숫자를 입력하세요");
		}
		
		try {
			this.num1 = Integer.parseInt(num1);
		}
		catch (Exception e) {
			throw new NotNumException("정수를 입력하세요");
		}
		
	}
	
	public int getNum2() {
		return num2;
	}
	
	public void setNum2(String num2) throws NotNumException{
		double result = 0.0;
		try {
			result = Double.parseDouble(num2);
		}
		catch(Exception e) {
			throw new NotNumException("숫자를 입력하세요");
		}
		try {
			this.num2 = Integer.parseInt(num2);
		}
		catch (Exception e) {
			throw new NotNumException("정수를 입력하세요");
		}
	}
	
	public void plus() {
		int result = 0;
		try {
			result = num1+num2;
			System.out.printf("두 수의 덧셈은 %d입니다.\n",result);
		}
		catch(ArithmeticException e) {
			System.out.println("잘못된 연산입니다.");
		}
	}
	
	public void minus() {
		int result = 0;
		try {
			result = num1-num2;
			System.out.printf("두 수의 뺄셈은 %d입니다.\n",result);
		}
		catch(ArithmeticException e) {
			System.out.println("잘못된 연산입니다.");
		}
	}
	
	public void multi() {
		int result = 0;
		try {
			result = num1*num2;
			System.out.printf("두 수의 곱셈은 %d입니다.\n",result);
		}
		catch(ArithmeticException e) {
			System.out.println("잘못된 연산입니다.");
		}
		
	}
	
	public void divide() {
		int result = 0;
		try {
			result = num1/num2;
			System.out.printf("두 수의 나눗셈은 %d입니다.\n",result);
		}
		catch(ArithmeticException e) {
			System.out.println("잘못된 연산입니다.");
		}
		
	}
}
