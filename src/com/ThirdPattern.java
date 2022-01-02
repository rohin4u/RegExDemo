package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdPattern {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("a?");
		Matcher m = p.matcher("abcdaabamnaaa");
		
		int count= 0;
		
		while(m.find()) {
			
			System.out.println(m.start()+"...."+m.group());
			count++;
		}
		System.out.println(count);

	}

}
