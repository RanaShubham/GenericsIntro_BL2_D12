package com.bridgelabz.generics_main;

public class PrintMax {

	//To get the max value of the passed array
	public static Integer getMax( Integer [] array) 
	{
		Integer max = array[0];
		
		for (Integer num : array)
		{
			if (num.compareTo(max) > 0)
				max = num;
		}
		return max;
	}
	
	
	public static void main(String[] args) 
	{
		Integer [] array = {11,23,33};
		
		System.out.println(PrintMax.getMax(array));
	}

}
