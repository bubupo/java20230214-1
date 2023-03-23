package ch18.lecture.exercise.exam10;

import java.io.*;

public class Example {
	public static void main(String[] args) {
		
		
		
		
		String origin = "";
		String copy = "";
		
		try (
				BufferedInputStream bis = new BufferedInputStream(System.in);
				InputStreamReader isr = new InputStreamReader(bis);
				
				
				){
			
		
		char[] inputFuleCharArray = new char[1024];
		System.out.print("원본 파일 경로");
		int len =  isr.read(inputFuleCharArray);
		
		origin = new String(inputFuleCharArray,0,len);
		origin = origin.strip();
		
		System.out.println("복사할 파일 경로");
		len = isr.read(inputFuleCharArray);
		
		copy = new String(inputFuleCharArray, 0, len);
		copy = copy.strip();
		
//		System.out.println(origin);
//		System.out.println(copy);
		
		File file = new File(origin);
		if(!file.exists()) {
			System.out.println("원본 파일이 존재하지 않습니다.");
			return;
		}
		
		int LastSlashIndex = copy.lastIndexOf("/");
		String copyFolder = copy.substring(0, LastSlashIndex);
		File file2 = new File(copyFolder);
		if(!file.exists()) {
			
		}
		
		return;
	}catch (Exception e) {
		e.printStackTrace();
	}
		
		
		//복사하는 코드
		try(
			var is = new FileInputStream(origin);
			var os  = new FileOutputStream(copy);
			
			BufferedInputStream bis = new BufferedInputStream(is);
			BufferedOutputStream bos = new BufferedOutputStream(os);
			){
				
			
			byte[] data = new byte[1024];
			int len =0;
			while ((len = bis.read(data)) != -1) {
				bos.write(data, 0, len);
			}
		
			bos.flush();
				
				
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
