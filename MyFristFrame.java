
package za.ac.tut.ui;


import java.awt.Color;
import javax.swing.JFrame;

public class MyFristFrame extends JFrame {

    public MyFristFrame() 
    {
        //JFrame frame = new JFrame("MyFristFrame");
        setTitle("My Frist GUI");
        setSize(400, 450);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.PINK);
        setVisible(true);
    }
   
    
            
}
