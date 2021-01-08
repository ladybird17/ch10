package ch10;

public class ArrayIndexOutOfBoundsExceptionMain {

	public static void main(String[] args) {
		
		try {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0] : "+data1);
			System.out.println("args[1] : "+data2);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("오류가 발생했습니다.");
			e.printStackTrace();
		}
		System.out.println("정상 종료");
	}

}
