package ch12.sec12;

import java.lang.reflect.*;

public class PrintAnnotationExample {
	public static void main(String[] args) throws Exception{
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods) {
			//PrintAnnotation 얻기
			PrintAnnotation prtinAnnotation = method.getAnnotation
					(PrintAnnotation.class);
			//설정 정보를 이용해서 선 출력
			printLine(prtinAnnotation);
			
			//메소드 호출
			method.invoke(new Service());
			
			//설정 정보를 이용해서 선 출력
			printLine(prtinAnnotation);
		}
	}
	
	public static void printLine(PrintAnnotation printAnnotation) {
		if(printAnnotation != null) {
			//number 속성값 얻기
			int number = printAnnotation.number();
			for(int i = 0; i<number; i++) {
				//value 속성값 얻기
				String value = printAnnotation.value();
				System.out.println(value);
			}
			System.out.println();
		}
	}
}
