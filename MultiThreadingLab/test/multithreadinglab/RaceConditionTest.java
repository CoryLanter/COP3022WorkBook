/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadinglab;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author clanter
 */
public class RaceConditionTest {
    
    public RaceConditionTest() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        Counter c = new Counter();
        assertEquals(0, c.value());
        fail("The test case is a prototype.");
    }
    
}
