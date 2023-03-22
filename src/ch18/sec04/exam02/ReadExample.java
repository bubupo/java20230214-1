package ch18.sec04.exam02;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		try (var reader1 = new FileReader("output/test.txt")){
			Reader reader = null;
			
			reader = new FileReader("output/test.txt");
			
			while(true) {
				int data = reader1.read();
				if(data == -1)break;
				System.out.println((char)data);
			}
			
			reader1.close();
			System.out.println();
			
			
			reader = new FileReader("output/test.txt");
			char[] data = new char[100];
			while(true) {
				int num = reader1.read(data);
				if(num == -1)break;
				for(int i = 0; i<num; i++) {
					System.out.println(data[i]);
				}
			}
			reader1.close();
		} catch (Exception e) {
			e.printStackTrace();
	}
}
}
