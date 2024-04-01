package junittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Firstclass {
	@Test
	public void equalsTest()
	{
		String name="Anuja";
		Assertions.assertTrue(name.equals("Anuja"));
		System.out.println();
			}
	
	@Test
	public void equalsTestNegative() {
		String name ="Anuja";
		Assertions.assertFalse(name.equals("Anuja1"));
		System.out.println("hi Anuja");
	}

}
