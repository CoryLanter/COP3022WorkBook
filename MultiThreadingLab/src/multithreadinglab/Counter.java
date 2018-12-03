/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreadinglab;

/**
 *
 * @author clanter
 */
public class Counter {
    private int value = 0;
    
    public void increment (){
        int temp = this.value;
        temp++;
        this.value = temp;
        
    }
    
    public int value(){
        return this.value;
    }
}
