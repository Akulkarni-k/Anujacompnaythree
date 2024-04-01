package com.code.Anuja;

public class PasswordGenerator  {
	
	public String generatePassword(String name, int yearOfBirth) {
	    String password = null;
	    
	    if(name.length()<=4) {
	      password = name+yearOfBirth; 
	    }else {
	      String str = name.substring(0, 4);
	      password =str+yearOfBirth;
	    }
	    return password;
	  }
	
	
	
	}
	
	
	
	
	
	
	


