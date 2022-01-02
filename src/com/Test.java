package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[^Aeo973]");
		
		Matcher m = p.matcher("IndiA is Very biG country inside world 8973423");
		int count=0;
		
		while(m.find()) {
			
			System.out.println(m.start()+"...."+m.group());
			count = count+1;
		}
		System.out.println("Count: "+count);
		
		
		
		
		

	}

}
