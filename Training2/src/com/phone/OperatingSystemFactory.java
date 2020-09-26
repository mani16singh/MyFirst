package com.phone;

public class OperatingSystemFactory {
	
	public OS getInstance(String str) {
		
		if(str.equals("OPEN"))
		return new Android();
		
		else if(str.equals("CLOSE"))
			return new IOS();
		else 
			return new Windows();
	}

}
