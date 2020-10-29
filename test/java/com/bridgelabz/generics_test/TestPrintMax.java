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
		Integer result = (Integer) new PrintMax(7,4,5).getMax();
		Integer max = 7;
		Assert.assertEquals(max, result);
	}
	
	@Test
	public void whenGivenIntegerArray_WithMaxNumber_AtSecondPosition()
	{
		Integer result = (Integer) new PrintMax(7,9,5).getMax();
		Integer max = 9;
		Assert.assertEquals(max, result);
	}
	
	@Test
	public void whenGivenIntegerArray_WithMaxNumber_AtThirdPosition()
	{
		Integer result = (Integer) new PrintMax(7,9,15).getMax();
		Integer max = 15;
		Assert.assertEquals(max, result);
	}
	
	
	//For Float array _________________________________________
	@Test
	public void whenGivenFloatArray_WithMaxNumber_AtFirstPosition()
	{
		Float result = (Float) new PrintMax(9.9f, 0.9f, 0.0f).getMax();
		Float max = 9.9f;
		Assert.assertEquals(max, result);
	}
	
	@Test
	public void whenGivenFloatArray_WithMaxNumber_AtSecondPosition()
	{
		Float result = (Float) new PrintMax(1.9f, 9.9f, 0.0f).getMax();
		Float max = 9.9f;
		Assert.assertEquals(max, result);
	}
	
	@Test
	public void whenGivenFloatArray_WithMaxNumber_AtThirdPosition()
	{
		Float result = (Float) new PrintMax(1.9f, 0.9f, 9.9f).getMax();
		Float max = 9.9f;
		Assert.assertEquals(max, result);
	}
	
	//For String array
	@Test
	public void whenGivenStringArray_WithMaxNumber_AtFirstPosition()
	{
		String result = (String) new PrintMax("Zebra", "Lion", "Pig").getMax();
		String max = "Zebra";
		Assert.assertEquals(max, result);
	}
	
	@Test
	public void whenGivenStringArray_WithMaxNumber_AtSecondtPosition()
	{
		String result = (String) new PrintMax("Lion", "Zebra", "Pig").getMax();
		String max = "Zebra";
		Assert.assertEquals(max, result);
	}
	
	@Test
	public void whenGivenStringArray_WithMaxNumber_AtThirdtPosition()
	{
		String result = (String) new PrintMax("Pig", "Lion", "Zebra").getMax();
		String max = "Zebra";
		Assert.assertEquals(max, result);
	}
}
