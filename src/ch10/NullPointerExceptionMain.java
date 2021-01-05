package ch10;

public class NullPointerExceptionMain {

	public static void main(String[] args) {
//		String data = null;
//		System.out.println(data.toString());
		
		try {
			String data = null;
			System.out.println(data.toString());
		}
		
		catch(NullPointerException e) {
			System.out.println("오류가 발생했습니다.");
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getStackTrace());
		}
		
		System.out.println("오류 발생 후 출력되는 문자열");
	}

}
