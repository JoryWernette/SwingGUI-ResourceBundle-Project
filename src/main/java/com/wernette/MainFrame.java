/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wernette;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Jory A. Wernette
 */
public class MainFrame extends JFrame {
    
    private ResourceBundle messages = Languages.getResourceBundle();
    	
    private Toolbar toolbar; // create an instance
    //private JTextArea textArea;
    private TextPanel textPanel;
    //private JButton btn;
    
    public MainFrame() {
        //super("Hello World"); // calls the constructor of its parent, JFrame- so calls JFrames constructor
        	
        super(); // need to activate the frame before calling the setTitle so it has something to catch on to
        setTitle(messages.getString("title"));
        
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        setLayout(new BorderLayout()); // conainting, aranging, and resizing components
        	
        toolbar = new Toolbar();
        add(toolbar, BorderLayout.NORTH);
        // moving text area to our custom object in TextPanel
        //textArea = new JTextArea(); // create the thing, no name or prefilled text
        //add(textArea, BorderLayout.CENTER); // add it to the form and where to put it	
        toolbar.setStringListener(new StringListener() {
            @Override
            public void getText(String text) {
                textPanel.appendText(messages.getString("say-hello") + ", " + text + "\n");
            }
        });
        
        
        textPanel = new TextPanel();
        add(textPanel, BorderLayout.CENTER);
        
        /*btn = new JButton(messages.getString("button-label")); // remember to add this to the messages properties
        add(btn, BorderLayout.SOUTH);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //textArea.append(messages.getString("say-hello") + "\n");	
                textPanel.appendText(messages.getString("say-hello") + "\n");
            }
        });
        */
        setVisible(true);
    }
    
}
