/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadinglab;

import static org.junit.Assert.*;
/**
 *
 * @author clanter
 */
public class CounterTest {

public void test(){
    Counter c = new Counter();
    assertEquals(0,c.value());
    for (int i=0;i < 30000; ++i){
        c.increment();
    }
    assertEquals(30000, c.value());
}

    
}
