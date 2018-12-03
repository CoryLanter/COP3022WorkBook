/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilab;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author clanter
 */
public class vennDiagram extends JComponent implements ChangeListener{
    
  private int xoffset = 160;
   public void paintComponent (Graphics g){
       
       Graphics2D g2 = (Graphics2D)g;
       Ellipse2D disk1 = new Ellipse2D.Double (10,10,200,200);
       g2.setColor(new Color(180,0,100, 125));
       g2.fill(disk1);
       
       Graphics2D g3 = (Graphics2D)g;
       Ellipse2D disk2 = new Ellipse2D.Double (xoffset,10,200,200);
       g3.setColor(new Color(155,155,200, 150));
       g3.fill(disk2);
   } 

    public Dimension getPreferedSize(){
        int width = 370;
        int height = 220;
        return new Dimension(width,height);
        
    }  
    @Override
     public void stateChanged(ChangeEvent event){
       JSlider spinner = (JSlider)event.getSource();
        this.xoffset = (Integer) spinner.getValue();
        this.repaint();
    }
        
        
    }

