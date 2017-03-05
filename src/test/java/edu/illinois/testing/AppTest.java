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

	String value = System.getenv("MYVARIABLE");
	
        assertEquals("2w2344", value);
    }
}
