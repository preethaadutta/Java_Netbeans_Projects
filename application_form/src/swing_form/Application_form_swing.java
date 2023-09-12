
package swing_form;

import javax.swing.*;
import java.awt.*;

public class Application_form_swing 
{
    Application_form_swing()
    {
        JFrame f=new JFrame("Form"); //Swing is the title of the frame
        f.setSize(800,800); //it sets the dimensions of the frame using pixels here 200 pixels width and height
        f.setVisible(true); //it makes the frame visible on the screen true means visible
        f.setLayout(new FlowLayout());
        //when the frame is closed it'll terminate the entire application and return to console
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel l=new JLabel();
        f.add(l);
        //setText() method changes the text that appears on the label to string str
        l.setText("Application Form");
        //setFont() to set font of JLabel text //l.setFont(new Font("Font_name",Font.BOLD,Font_size));
        l.setFont(new Font("Times New Roman",Font.BOLD,24)); //Verdana
        //setForeground() to set foreground colour of the component
        l.setForeground(Color.BLUE);
    }
    public static void main(String args[])
    {
        new Application_form_swing(); //calling the constructor
    }
}
