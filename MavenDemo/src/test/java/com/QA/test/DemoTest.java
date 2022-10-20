package com.QA.test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {


	@Test
	
	public void sum()
	{
		System.out.println("Sum");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30,a+b);
					
	}
	
@Test
	
	public void sub()
	{
		System.out.println("Sub");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10,b-a);
				
	}
	
@Test

public void Multi()
{
	System.out.println("Multi");
	int a = 10;
	int b = 20;
	Assert.assertEquals(200,b*a);
			
}

@Test

public void Div()
{
	System.out.println("Div");
	int a = 10;
	int b = 20;
	Assert.assertEquals(2,b/a);
			
}
}
