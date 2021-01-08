package ch10;

public class NumberFormatExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "100";
		String data2 = "a100";

		try {
			cal(data1,data2);
		}
		catch(NumberFormatException e) {
			System.out.println("오류가 발생했습니다.");
			System.out.println("정수로 변환할 수 없는 데이터가 입력되었습니다.");
			return;
		}
		finally {
			/*
			 무조건 실행되어야 하는 코드
			 try 영역에서 오류가 있어도 실행되고, 오류가 없어도 실행.
			 try 혹은 catch 부분에 return 키워드가 있어도 finally 영역 실행.
			 */
			System.out.println("finally 영역 실행");
		}
		//return으로 인해 실행안됨
		System.out.println("프로그램이 정상 종료 되었습니다.");
	}
	
	public static void cal(String data1, String data2) {
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		//a100은 정수로 변환불가라서 오류 발생
		
		int result = value1 + value2;
		
		System.out.println(data1 + "+" + data2 + "=" + result);
	}

}
