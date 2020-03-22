package com.epam.tdd_juint;

public class ReplaceFirstTwo {

	public String replace(String string) {
	        String res="";
	        int stringLength=string.length();
	        if((string.charAt(0)=='A') && (string.charAt(1)!='A')){
	            res=string.substring(1,stringLength);
	        }
	        if((string.charAt(0)=='A' )&&(string.charAt(1)=='A')){
	            res=string.substring(2,stringLength);
	        }
	        if ((string.charAt(0)!='A')&&(string.charAt(1)=='A')) {
	        	res=string.charAt(0)+string.substring(2);
	        }
	        if ((string.charAt(0)!='A')&&(string.charAt(1)!='A')) {
	        	res=string;
	        }
	        return res;
	}

}
