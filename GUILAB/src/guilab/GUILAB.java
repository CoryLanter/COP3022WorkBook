
package guilab;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeListener;
public class GUILAB {

   
    public static void main(String[] args) {
    
        JFrame window = new JFrame("Vennnnn");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vennDiagram venn = new vennDiagram();
        vennDiagram venn2 = new vennDiagram();
        JTextField sTitle = new JTextField("cri");
        sTitle.setEditable(false);
        sTitle.setHorizontalAlignment(JTextField.CENTER);
        window.add(sTitle, BorderLayout.NORTH);
        window.add(venn, BorderLayout.CENTER);
        window.add(venn2, BorderLayout.CENTER);
        //JButton button = new JButton("close");
        //window.add(button, BorderLayout.SOUTH);
        window.setSize(800,800);
        window.setVisible(true);
     
        JSlider nums = new JSlider(10,210, 160);
        nums.addChangeListener((ChangeListener) venn2);
        window.add(nums, BorderLayout.SOUTH);
        
       
       
        
        
        
       window.pack();
    }
    
}
