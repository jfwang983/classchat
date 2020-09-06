import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * Write a description of class PopUp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PopUp
{
    String title;
    String desc;
    
    JTextField titleInput;
    JTextField descInput;
    
    JButton submitButton;
    
    JFrame win;
    
    JPanel contents;
    
    public PopUp(String tabTitle)
    {
        /*win = new JFrame();
        win.setSize(500, 200);
        win.setTitle(tabTitle);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setLayout(new BorderLayout());
        

        
        titleInput = new JTextField();
        descInput = new JTextField();
        
        win.add(titleInput, BorderLayout.CENTER);
        win.add(descInput, BorderLayout.CENTER);
        
        JButton submitButton = new JButton("Submit");
        win.add(submitButton, BorderLayout.EAST);
        ListenForButton l = new ListenForButton();
        submitButton.addActionListener(l);
        
        win.setVisible(true);*/
    }
    
    public class ListenForButton implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(((JButton)e.getSource()).getText().equals("Submit"))
            {
                title = titleInput.getText();
                
                desc = descInput.getText();
                
                GUIManager.popUpIsOpen = false;
                win.dispose();
            }
        }
    }
}
