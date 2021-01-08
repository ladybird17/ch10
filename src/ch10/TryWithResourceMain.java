package ch10;



public class TryWithResourceMain {

	public static void main(String[] args) {
		String file = "c:\\java102\\reader.txt";
		FileInputStream fis1 = null;
	
		try {
			fis1 = new FileInputStream(file);
			fis1.read();
			throw new Exception();//강제 예외 발생
		}
		catch(Exception e) {
			System.out.println("일반 오류처리가 실행되었습니다.");
		}
		finally {
			try {
				if(fis1 != null) {
					fis1.close();
				}
			}
			catch(Exception e){
				System.out.println("finally에서 오류처리가 실행되었습니다.");
			}
		}
		
		System.out.println("\n-----Try with Resource-----\n");
		
		/*
		 try에 ()를 추가하여 괄호 안에 close()를 사용할 객체 생성
		 2라인 이상으로 입력할 경우
		 (
		 FileInputStream fs1 = new FileInputStream();
		 FileInputStream fs2 = new FileInputStream();
		 .
		 .
		 .
		 )
		 이렇게 하면 됨
		 
		 */
		try(FileInputStream fis2 = new FileInputStream("c:\\java102\\reader.txt")){
			
			fis2.read();
			//오류처리 전에 close가 자동으로 실행됨
			
		}
		catch(Exception e) {
			System.out.println("try with resource 예외처리가 실행되었습니다.");
		}
	}
}
