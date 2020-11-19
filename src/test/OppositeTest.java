package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Opposite;

public class OppositeTest {

	@Test
	  public void tests() {
	    assertEquals(-1, Opposite.opposite(1));
	    assertEquals(25, Opposite.opposite(-25));
	  }

}
