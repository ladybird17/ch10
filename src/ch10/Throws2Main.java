package ch10;

public class Throws2Main {

	public static void main(String[] args) {
		try {
			findClass();
		}
		catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
		try {
			method1();
		}
		catch(NullPointerException e) {
			System.out.println("값이 null입니다.");
		}
	}
	public static void findClass() throws ClassNotFoundException {
		
		
		Class clazz = Class.forName("java.lang.String2");
		/*
		 예외가 발생하는 영역에 직접 try/catch사용하여 예외처리해야하지만, 
		 throws를 사용하면 해당 메서드를 호출한 곳에서
		 try/catch를 사용하여 예외처리 할 수 있음
		*/
		
//		try {
//			Class clazz = Class.forName("java.lang.String2");
//		}
//		catch(ClassNotFoundException e){
//			System.out.println("클래스가 존재하지 않습니다.(findClass에서 오류처리)");
//		}
	}
	
	public static void method1() throws NullPointerException{
		String data = null;
		System.out.println(data.toString());
	}

}
