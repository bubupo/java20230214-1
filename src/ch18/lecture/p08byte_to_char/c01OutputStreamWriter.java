package ch18.lecture.p08byte_to_char;

import java.io.*;

public class c01OutputStreamWriter {
	public static void main(String[] args) throws IOException {
		String fileName = "output/byte1.txt";
		OutputStream os = getOutput(fileName);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		os.write('e');
		os.write('b');
		os.write('한');
		
		os.close();
	}
	
	public static OutputStream getOutput(String fileName) throws FileNotFoundException{
		OutputStream os = new FileOutputStream(fileName);
		
		return os;
	}
}
