package com.stackroute.demo.PE3;

import java.util.*;
import java.text.*;

public class DateMet {

public String getDate(){
					// Get calendar set to current date and time
     Calendar c = Calendar.getInstance();

      				// Set the calendar to monday of the current week
     c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

     				// Print dates of the current week starting on Monday
     DateFormat df = new SimpleDateFormat("E dd/MM/yyyy");
     String s1= df.format(c.getTime());
	        for (int i = 0; i <6; i++) 
	        {c.add(Calendar.DATE, 1);}        
	      
       s1 =s1+ df.format(c.getTime()).toString();
        
       return s1;
		     }
}