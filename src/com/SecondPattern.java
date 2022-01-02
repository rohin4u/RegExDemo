package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondPattern {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile(".");
		Matcher m = p.matcher("india is my country @$%789334");
		
		int count=0;
		
		while(m.find()) {
			
			System.out.println(m.start()+"....."+m.group());
			count++;
		}
		System.out.println("Count : "+count);
		
		

	}

}
