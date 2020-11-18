package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.BooleanToString;
import main.EvenOrOdd;

public class EvenOrOddTest {

	@Test
    public void testEvenOrOdd() {
		

        
        assertEquals("Even", EvenOrOdd.even_or_odd(6));
        
        assertEquals("Odd", EvenOrOdd.even_or_odd(7));       
    }

}
