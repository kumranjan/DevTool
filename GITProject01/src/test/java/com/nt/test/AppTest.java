package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest 
{
	@Test
	public void testWithPositive()
	{
		Arithmetic ar=new Arithmetic();
		int actual=ar.Sum(10,20);
		int expected=30;
		assertEquals(expected,actual);
		
	}
    
}
