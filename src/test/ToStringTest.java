package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.ToString;

class ToStringTest {


	@Test
	public void test1() {
		assertEquals("123", ToString.convertIntToString(123));
	}

}
