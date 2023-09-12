
package firstAWT;
import java.awt.*;
import java.awt.event.*;

public class FirstAWT extends Frame implements ItemListener
{
    CheckboxGroup Obj = new CheckboxGroup();
    Label label;
    //Frame f1= new Frame("CheckboxGroup");
    Checkbox ckBox1,ckBox2;
    FirstAWT()
    {
        label = new Label();            
        label.setAlignment(Label.CENTER);    
        label.setSize(400,100);  
        ckBox1 = new Checkbox("C++", Obj, true);    
        ckBox1.setBounds(100,100, 50,50);    
        ckBox2 = new Checkbox("Java", Obj, false);    
        ckBox2.setBounds(100,150, 50,50); 
        add(label);
        add(ckBox1);    
        add(ckBox2);    
        ckBox1.addItemListener(this); 
        ckBox2.addItemListener(this);
        setSize(400,400);    
        setLayout(null);    
        setVisible(true);    
        addWindowListener (new WindowAdapter() 
        {    
            public void windowClosing (WindowEvent e) 
            {    
                dispose();    
            }    
        }                 );
    }
    public void itemStateChanged(ItemEvent e) 
    {      
        if(e.getSource()==ckBox1)  
            label.setText("C++ Checkbox: "     
            + (e.getStateChange()==1?"checked":"unchecked"));   
        if(e.getSource()==ckBox2)  
        label.setText("Java Checkbox: "     
        + (e.getStateChange()==1?"checked":"unchecked"));    
     }  
    public static void main(String[] args) 
    {
      new FirstAWT();  
    }
}
