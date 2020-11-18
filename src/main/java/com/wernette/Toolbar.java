/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wernette;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jory A. Wernette
 */
public class Toolbar extends JPanel implements ActionListener { // so we can do (this) to differentiate between which buttons were fired in this layout
    // Whenever you make a new one, make sure to actually add it to the main frame    private ResourceBundle messages = Languages.getResourceBundle();	

    private ResourceBundle messages = Languages.getResourceBundle();

    private JTextField name_field;
    private JLabel name_label;
    private JButton goButton;

    private StringListener textListener;

    public Toolbar() {
        setLayout(new FlowLayout(FlowLayout.LEFT)); // float butons to the left 
        
        name_label = new JLabel(messages.getString("inquiry"));
        add(name_label);
        
        name_field = new JTextField(/*messages.getString("inquiry"),*/ 20);
        add(name_field);

        goButton = new JButton(messages.getString("button-label"));
        add(goButton);
        goButton.addActionListener(this); // when this button is clicked, fire the @Override method      
    }

    public void setStringListener(StringListener listener) {
        this.textListener = listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //JButton clicked = (JButton) e.getSource(); // what object caused this to happen, what did I click?
        // this was useful when we had a full if block with 2 buttons
        if (textListener != null) {

            //textListener.getText(messages.getString("say-hello"));
            
            
            //System.out.println(name_field.getText());
            textListener.getText(name_field.getText());
        }
        //System.out.println(messages.getString("say-hello")); // prints in console- used for debugging, not for users

    }
}
