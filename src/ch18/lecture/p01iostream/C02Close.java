package ch18.lecture.p01iostream;

import java.io.*;

public class C02Close {
	public static void main(String[] args) {
//		finally 블럭에서도 사용할 수 있게 try 블럭 밖에서 선언
		OutputStream os = null;
		try {
		//스트림 열고
		os = new FileOutputStream("output/output.txt");
		
		//어떤작업
		os.write(1);
		os.flush();
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		//스트림 닫고
		if(os !=null) {
			try{os.close();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
	}
}
}
