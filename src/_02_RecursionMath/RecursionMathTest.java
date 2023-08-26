package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(21, RecursionMath.recursiveMultiplication(3, 7));
        assertEquals(3200, RecursionMath.recursiveMultiplication(32, 100));
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	assertEquals(5, RecursionMath.recursiveDivision(25, 5));
    	assertEquals(3, RecursionMath.recursiveDivision(9, 3));
    	assertEquals(0, RecursionMath.recursiveDivision(0, 0));
        //fail("Write some tests!");
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
    	assertEquals(4, RecursionMath.recursivePower(2, 2));
    	assertEquals(8, RecursionMath.recursivePower(2, 3));
    	assertEquals(5555, RecursionMath.recursivePower(5555, 1));
    }
}
