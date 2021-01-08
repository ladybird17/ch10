package ch10;

import java.util.Scanner;

public abstract class Converter { //단위를 변경하는 추상 클래스
	abstract protected double convert(double src);
	abstract protected String srcString();
	abstract protected String destString();
	protected double ratio;//비율
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString() + "을 " + destString() + "로 바꿉니다.");
		System.out.print(srcString() + "을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: " + res + destString() + "입니다");
		scanner.close();
	}

}
