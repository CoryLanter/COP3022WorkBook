/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dec5lab;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author clanter
 */
public class SpiroGraph extends JFrame implements ActionListener{

private JPanel paper;

public SpiroGraph(){
    this.setSize(420, 480);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton go = new JButton("Draw");
this.paper = new JPanel();  
    this.add(go, BorderLayout.SOUTH);
    this.add(this.paper, BorderLayout.CENTER);
    go.addActionListener(this);



}

@Override
    public void actionPerformed(ActionEvent event){
        
    System.out.println("fjjjjjswefwewefefwfef \n butts");
    //make thread and start
    SpiroThread foo = new SpiroThread();
    foo.start();
    
    }
    
    private class SpiroThread extends Thread{
    
    
    public void run ()
    {
    Graphics g;
        g = paper.getGraphics();
    Graphics2D g2;
    g2 = (Graphics2D)g;
    for (int i = 0; i < 36; i++){
        
        try{
            Thread.sleep(100);
            g2.drawOval(50,180,300,40);
    g2.rotate(Math.toDegrees(5), 200, 200);
        }
        catch(InterruptedException e){}
 
    }
    }
    }
}
