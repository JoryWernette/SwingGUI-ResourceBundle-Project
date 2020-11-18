/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wernette;

import com.wernette.Languages.LanguageOptions;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Jory A. Wernette
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Languages.setResourceBundle(LanguageOptions.MAORI);
        // when the program runs, find out which lang to use
        // all I have to do is manually swich USA to whatever enum type I put in the Languages class

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainFrame(); // call the MainFrame constructor
            }
        });

    }

}
