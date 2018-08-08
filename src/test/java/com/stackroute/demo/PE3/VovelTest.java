package com.stackroute.demo.PE3;
import static org.junit.Assert.assertArrayEquals;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class VovelTest {
private static Vovel value;
	
	@BeforeClass
    public static void  setup() {
         value = new Vovel();

    }
    @AfterClass
    public static void teardown() {
        value= null;
    }
    @Test
    public void toGetVovel() {
    	String[] str= {"India","United States","Germany","Egypt","czechoslovakia"};
    	String[] s1= {"Ind","Untd Stts","Grmny","Egypt","czchslvk"};
    	assertArrayEquals(s1,value.getVovel(str));
    }
    
}
