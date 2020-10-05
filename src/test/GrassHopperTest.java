package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.GrassHopper;

public class GrassHopperTest {
	@Test
    public void test1() {
        assertEquals(1,
        GrassHopper.summation(1));
    }
	
	@Test
    public void test3() {
        assertEquals(3,
        GrassHopper.summation(2));
    }
	
    @Test
    public void test2() {
        assertEquals(36,
        GrassHopper.summation(8));
    }
}
