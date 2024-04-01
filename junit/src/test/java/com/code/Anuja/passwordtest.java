package com.code.Anuja;

import org.junit.jupiter.api.Test;

import junit.framework.TestCase;

class passwordtest extends TestCase {

	@Test
	  public void testGeneratePassword() {
	    String name= "Joseph";
	    int yearOFBirth = 1998;
	    
	    String expected = "Jose1998";
	    
	    PasswordGenerator passwordGenerator = new PasswordGenerator();
	    String actual = passwordGenerator.generatePassword(name, yearOFBirth);
	    
	    assertEquals(expected, actual);
	  }
	
	
	
}
