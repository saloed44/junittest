package ua.epam.jtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {

	
	private Greeting greet;

	@Before
	public void setup(){
		System.out.println("Setup");
		greet = new GreetingImpl();
		
	}
	
	@Test
	public void greetShouldReturnValidOutput() {
		String result = greet.greet("Junit");
		assertNotNull(result);
		assertEquals("Junit Junit", result);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowTheExceptionForNameIsNull(){
		greet.greet(null);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowTheExceptionForNameIsBlank(){
		greet.greet("");
	}
	
	@After
	public void teardown(){
		System.out.println("teardown");
		greet = null;
	}
}
