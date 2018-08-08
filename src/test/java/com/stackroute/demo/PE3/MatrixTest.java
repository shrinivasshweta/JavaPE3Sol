package com.stackroute.demo.PE3;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MatrixTest {
private static Matrix value;
	
	
	
	@BeforeClass
    public static void  setup() {
         value = new Matrix();

    }
    @AfterClass
    public static void teardown() {
        value= null;
    }
    @Test
    public void togetMat() {
    	int a[][]= {{2,4},{3,5},{1,7}};
        int b[][]= {{9,2},{1,4},{5,3}};
        int[][] r=new int[3][2];
        r=value.methodName(a, b);
        int[][] exp= {{11,6},{4,9},{6,10}};
        assertArrayEquals(exp,r);
    	
    }
    @Test
    public void test2() 
    {
        int a[][]= {{2,4},{3,5},{1,7}};
        int b[][]= {{9,2},{1,4},{5,3}};
        int[][] r=new int[3][2];
        r=value.methodName(a, b);
        int[][] exp= {{11,7},{5,9},{2,10}};
        assertNotEquals(exp,r);
    }
    
    @Test
    public void test3() 
    {
        int a[][]= {{2,-2},{-6,5}};
        int b[][]= {{-5,2},{1,4}};
        int[][] r=new int[2][2];
        r=value.methodName(a, b);
        int[][] exp= {{-3,0},{-5,9}};
        assertArrayEquals(exp,r);
    }
}
