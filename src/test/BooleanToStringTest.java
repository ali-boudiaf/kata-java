package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.BooleanToString;

public class BooleanToStringTest {

	@Test
	public void testTrue() {
		assertEquals(BooleanToString.convert(true), "true");
	}

	@Test
	public void testFalse() {
		assertEquals(BooleanToString.convert(false), "false");
	}

}
