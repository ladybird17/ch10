package ch10;

public class MultiCatchException2Main {

	public static void main(String[] args) {

		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			//run configuration의 arguments에서 100, 200넣고 run 하면 매개값이 들어감
			int result = value1 + value2;
			System.out.println(data1+"+"+data2+"="+result);
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
		}
		catch(Exception e) {
			System.out.println("알수없는 예외 발생");
		}
		finally {
			System.out.println("다시 실행하세요");
		}
	}

}
