package ch18.lecture.p03inputstream;

import java.io.*;

public class C02InputStream {
	public static void main(String[] args) {
		try (var is = new FileInputStream("output/test3.db")){
			
			int data = 0;
			while ((data = is.read()) != -1) {
				System.out.println(data);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
