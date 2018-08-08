package com.stackroute.demo.PE3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class DateMetTest {

private static DateMet value;
	
	@BeforeClass
    public static void  setup() {
         value = new DateMet();

    }
    @AfterClass
    public static void teardown() {
        value= null;
    }
    @Test
    public void testDate() {
    	assertEquals("Mon 06/08/2018Sun 12/08/2018",value.getDate());
    }
    @Test
    public void testDate1() {
    	assertNotNull(value.getDate());
    }
}
