package ch18.lecture.p01iostream;

import java.io.*;

public class C07OutputStream {
	public static void main(String[] args) {
		try (var os = new FileOutputStream("output/output7.txt")){
			//한바이트 쓰기
			os.write(30);
			os.write(153548);
			//여러바이트 쓰기
			byte[] data = {3,3,3,3,3,3,3,3,3};
			os.write(data);
			//여러바이트 쓰기 (배열의 일부분)
			os.write( data, 0,3); //0번 부터 3개출력
			os.write(data, 4,5); //4번부터 5개 출력
			os.write(data, 0, data.length); //0번부터 전체
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
