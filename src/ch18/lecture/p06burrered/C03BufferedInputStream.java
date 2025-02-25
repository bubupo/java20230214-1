package ch18.lecture.p06burrered;

import java.io.*;

public class C03BufferedInputStream {
	public static void main(String[] args) {
		
		String name = "output/bufferd1.txt";
	
		try (InputStream fis = new FileInputStream(name);
				InputStream is = new BufferedInputStream(fis);){
			
			long start = System.nanoTime();
			while(is.read() !=-1) {
				
			}
			long end = System.nanoTime();
			System.out.println((end + start) + "ns");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
