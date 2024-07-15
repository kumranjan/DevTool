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
		int actual=ar.Sum(10,20);
		int expected=30;
		assertEquals(expected,actual);
		
	}
	@Test
	public void testWithNegative()
	{
		System.out.println("AppTest.testWithNegative()");
		Arithmetic ar=new Arithmetic();
		int actual=ar.Sum(-10,-20);
		int expected=-30;
		assertEquals(expected,actual);
		
	}
	@Test
	public void testWithMixedNUmber()
	{
		System.out.println("AppTest.testWithMixedNUmber()");
		Arithmetic ar=new Arithmetic();
		int actual=ar.Sum(-100,120);
		int expected=20;
		assertEquals(expected,actual);
		
	}
    
}
