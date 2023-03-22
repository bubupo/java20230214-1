package ch18.lecture.p01iostream;

import java.io.*;

public class C03Close {
	public static void main(String[] args) {
		//try-with-resourse
		
		try (OutputStream os = new FileOutputStream("");){
			
			os.write(1);
			os.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
