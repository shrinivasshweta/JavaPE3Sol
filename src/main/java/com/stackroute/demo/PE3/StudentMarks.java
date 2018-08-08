package com.stackroute.demo.PE3;

public class StudentMarks {
	public String methodName(int arr[]) 
	{
		int len = arr.length;
		try {
		for(int i=0;i<len;i++)
		{
			if((arr[i]>100)||(arr[i]<0))
			{
				throw new Exception("the grade is above 100");
			}
		}
		}catch(Exception e) {
			return e.getMessage();
		}
		return "the grades are fine";
	}
	}
 