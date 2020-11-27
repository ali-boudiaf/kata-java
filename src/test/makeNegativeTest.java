package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.makeNegative;

public class makeNegativeTest {

	@Test
	  public void test1() {
	    assertEquals(-42, makeNegative.makeNegative(42));
	  }

}
