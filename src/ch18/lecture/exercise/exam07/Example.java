package ch18.lecture.exercise.exam07;

import java.io.*;

public class Example {
	public static void main(String[] args) {
		//확인문제 7
		//filePath 값
		String filePath = "src/ch18/lecture/exercise/exam07/Example.java";
		try(
				FileReader fr = new FileReader(filePath);
				BufferedReader br = new BufferedReader(fr);) {
			
		
		
		
		int rowNumber = 0;
		String rowData;
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			System.out.println(rowNumber + "\t" +str);
			rowNumber++;
		}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
