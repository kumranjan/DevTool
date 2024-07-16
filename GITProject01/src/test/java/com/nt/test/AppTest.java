package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest 
{
	@Test
	public void testWithPositive()
	{
		System.out.println("AppTest.testWithPositive() begin()");
		Arithmetic ar=new Arithmetic();

		int actual=ar.Sum(20,30);
		int expected=50;
		assertEquals(expected,actual);
		
	}
	@Test
	public void testWithNegative()
	{
		System.out.println("AppTest.testWithNegative()");
		Arithmetic ar=new Arithmetic();
		int actual=ar.Sum(-50,-20);
		int expected=-70;
		assertEquals(expected,actual);
		
	}
	
	
		
	}
    

