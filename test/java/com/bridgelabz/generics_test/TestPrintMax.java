package com.bridgelabz.generics_test;

import org.junit.Assert;
import org.junit.Test;



import com.bridgelabz.generics_main.PrintMax;
import com.bridgelabz.userregistration.UserRegistration;

public class TestPrintMax 
{
	//For Integer array _____________________________________
	@Test
	public void whenGivenIntegerArray_WithMaxNumber_AtFirstPosition()
	{
		Integer[] array = {99, 9, 0};
		Integer result = PrintMax.getMax(array);
		Integer max = 99;
		Assert.assertEquals(max, result);
	}
	
	@Test
	public void whenGivenIntegerArray_WithMaxNumber_AtSecondPosition()
	{
		Integer[] array = {9, 99, 0};
		Integer result = PrintMax.getMax(array);
		Integer max = 99;
		Assert.assertEquals(max, result);
	}
	
	@Test
	public void whenGivenIntegerArray_WithMaxNumber_AtThirdPosition()
	{
		Integer[] array = {9, 9, 99};
		Integer result = PrintMax.getMax(array);
		Integer max = 99;
		Assert.assertEquals(max, result);
	}
	
	
	//For Float array _________________________________________
	@Test
	public void whenGivenFloatArray_WithMaxNumber_AtFirstPosition()
	{
		Float[] array = {9.9f, 0.9f, 0.0f};
		Float result = PrintMax.getMax(array);
		Float max = 9.9f;
		Assert.assertEquals(max, result);
	}
	
	@Test
	public void whenGivenFloatArray_WithMaxNumber_AtSecondPosition()
	{
		Float[] array = {0.9f, 9.9f, 0.0f};
		Float result = PrintMax.getMax(array);
		Float max = 9.9f;
		Assert.assertEquals(max, result);
	}
	
	@Test
	public void whenGivenFloatArray_WithMaxNumber_AtThirdPosition()
	{
		Float[] array = {0.9f, 0.9f, 9.9f};
		Float result = PrintMax.getMax(array);
		Float max = 9.9f;
		Assert.assertEquals(max, result);
	}
}
