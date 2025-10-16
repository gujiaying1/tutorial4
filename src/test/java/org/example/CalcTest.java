package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {
    
    private Calc c = new Calc();
    
    @Test
    public void testAddition() {
        assertEquals(4, c.add(2, 2));
    }
    
    @Test
    public void testSubtraction() {
        assertEquals(2, c.subtract(4, 2));
    }
}
