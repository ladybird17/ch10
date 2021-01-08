package ch10;

public class FileInputStream implements AutoCloseable {
	private String file;
	public FileInputStream(String file) {
		this.file = file;
	}
	public void read() {
		System.out.println(file+" 을 읽었습니다.");
	}
	@Override
	public void close() throws Exception{
		System.out.println(file+" 을 닫습니다.");
		//AutoCloseable이 자동으로 실행시키는 close 메소드
	}
}
