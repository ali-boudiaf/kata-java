package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.XOR;

class XORTest {

	private static void testing(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }
    
    
    @Test
    public void simpleTest() {
    	assertEquals(true, XOR.xor(true, false));

    	assertEquals(false, XOR.xor(true, true));
    	
    	assertEquals(false, XOR.xor(false, false));
    	

    	assertEquals(true, XOR.xor(false, true));
    }
    
    @Test
    public void testBasic() {
        testing(XOR.xor(false, false), false);
        testing(XOR.xor(true, false), true);
        testing(XOR.xor(false, true), true);
        testing(XOR.xor(true, true), false);
    }

}
