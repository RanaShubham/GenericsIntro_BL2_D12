package com.bridgelabz.generics_test;

import org.junit.Assert;
import org.junit.Test;



import com.bridgelabz.generics_main.PrintMax;
import com.bridgelabz.userregistration.UserRegistration;

public class TestPrintMax 
{
	@Test
	public void whenGivenArray_WithMaxNumber_AtFirstPosition()
	{
		Integer[] array = {99, 9, 0};
		Integer result = PrintMax.getMax(array);
		Integer max = 99;
		Assert.assertEquals(max, result);
	}
	
	@Test
	public void whenGivenArray_WithMaxNumber_AtSecondPosition()
	{
		Integer[] array = {9, 99, 0};
		Integer result = PrintMax.getMax(array);
		Integer max = 99;
		Assert.assertEquals(max, result);
	}
	
	@Test
	public void whenGivenArray_WithMaxNumber_AtThirdPosition()
	{
		Integer[] array = {9, 9, 99};
		Integer result = PrintMax.getMax(array);
		Integer max = 99;
		Assert.assertEquals(max, result);
	}
}
