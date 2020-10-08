package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.FirstClass;

public class FirstClassTest {

	@Test
	public void testSum() throws Exception {
		byte a = 8;
		byte b = 2;
		assertEquals(10, FirstClass.sum(a, b));
	}

}
