package ch10;

public class ThrowsMain {

	public static void main(String[] args) {
		
		try {
			System.out.println("----main try영역 시작----");
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
			System.out.println("----main try영역 종료----");
		}
		catch(Exception e) {
			System.out.println("오류가 발생했습니다.");
		}
	}
	
	public static void method1() {
		String data1 = "100";
		String data2 = "a100";
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
		}
		catch(NumberFormatException e) {
			System.out.println("method1에서 예외처리");
		}
	}

}
