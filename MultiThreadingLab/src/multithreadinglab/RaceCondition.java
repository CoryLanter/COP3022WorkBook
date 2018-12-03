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
public class RaceCondition extends Thread{
    private Counter counter;
    
    public RaceCondition(Counter c){
        
        this.counter = c;
        
    }
    
    @Override
    public void run(){
        this.counter.increment();
    }
public static void main(String[] args){
    Counter mainCounter = new Counter();
    
    Thread[] threads = new Thread[300000];
    
    for(int i = 0; i < threads.length; i++){
        threads[i] = new RaceCondition(mainCounter);
        threads[i].start();
    }
    System.out.println("Final Count: " + mainCounter.value());
    
}
}
