package com.stackroute.demo.PE3;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class StudentMarksTest {
	private static StudentMarks value;
	
	@BeforeClass
    public static void  setup() {
         value = new StudentMarks();

    }
    @AfterClass
    public static void teardown() {
        value= null;
    }

    @Test
    public void togetGrades() {
    	int arr[]= {10,20,80,101};
    	assertEquals(new String("the grade is above 100"),value.methodName(arr));
    	
    }

    @Test
    public void togetGrades1() {
    	int arr[]= {10,20,80,100};
    	assertEquals("the grades are fine",value.methodName(arr));
    	
    }
    @Test
    public void togetGrades2() {
    	int arr[]= {-1,120,180,110};
    	assertEquals(new String("the grade is above 100"),value.methodName(arr));
    	
    }

}
