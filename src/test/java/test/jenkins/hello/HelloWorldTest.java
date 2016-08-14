package test.jenkins.hello;

import static org.junit.Assert.fail;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void shouldPassFirstHello() {
		System.out.println("Should pass 1st hello world at present.");
	}
	
	@Test
	public void shouldPassSecondHello() {
		System.out.println("Should pass 2nd hello world at present.");
	}

	@Test
	public void shouldRunHelloAsExecpted() {
		boolean isFail = false;
		if (isFail) {
			System.out.println("Should fail hello world at present.");
			fail("*Error at fail hello !!!");
		}
		System.out.println("Should pass hello world as expected.");
	}
	
}
