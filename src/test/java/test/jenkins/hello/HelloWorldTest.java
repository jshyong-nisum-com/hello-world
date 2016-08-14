package test.jenkins.hello;

import static org.junit.Assert.fail;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void shouludPassFirstHello() {
		System.out.println("Should pass 1st hello world at present.");
	}
	
	@Test
	public void shouludPassSecondHello() {
		System.out.println("Should pass 2nd hello world at present.");
	}

	@Test
	public void shouludFailHello() {
		System.out.println("Should fail hello world at present.");
		fail("*Error at fail hello !!!");
	}
	
}
