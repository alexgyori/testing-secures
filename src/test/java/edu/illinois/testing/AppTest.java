package edu.illinois.testing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testApp()
    {

	String cond = System.getenv("MYVAR");
	String value = System.getenv("MYVARIABLE");
	if (cond.equals("ONE")) {
	    assertEquals(null, value);
	} else {
	    assertEquals("2w2344", value);
	}
    }
}
