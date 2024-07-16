package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest 
{
	@Test
	public void testWithPositive()
	{
		System.out.println("AppTest.testWithPositive()");
		Arithmetic ar=new Arithmetic();
		int actual=ar.Sum(50,50);
		int expected=100;
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
    

