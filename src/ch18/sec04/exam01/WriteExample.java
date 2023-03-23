package ch18.sec04.exam01;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try (var writer = new FileWriter("output/test.txt");){
			
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			char[] arr = {'C','D','E'};
			writer.write(arr);
			
			writer.write("FGH");
			
			writer.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}