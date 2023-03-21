package ch11.lectyre.p01exception;

import java.util.*;

public class C04RuntimeExecption {
	public static void main(String[] args) {
		var list = new ArrayList<String>();
		list.add("java");
		
		System.out.println(list.get(1));
		
		System.out.println("continue...");
	}
}
