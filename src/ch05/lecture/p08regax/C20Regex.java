package ch05.lecture.p08regax;

import java.util.Arrays;

public class C20Regex {
	public static void main(String[] args) {
		String str1 = " al ad al aldkjf ";
		String str2 = str1.replaceAll("\\s+", "");
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "allekf     ,    sldknrjmf,sldkrjf   ,    slakdjf";
		String[] str4 = str3.split("\s*,\s*");
		
		System.out.println(str3);
		System.out.println(Arrays.toString(str4));
	}
}
