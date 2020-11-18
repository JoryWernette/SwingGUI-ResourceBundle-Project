/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wernette;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Jory A. Wernette
 */
public class Languages {

    public enum LanguageOptions {
        USA, SPANISH, GERMAN, MAORI, LUXEMBOURGISH
    }; // Add more language options
    private static ResourceBundle messages = ResourceBundle.getBundle("messages", Locale.getDefault());

    public static ResourceBundle getResourceBundle() {
        return messages;
    }

    public static void setResourceBundle(LanguageOptions language) {
        Locale locale = Locale.getDefault();
        switch (language) {
            case USA:
                locale = Locale.US;// check oracle doc for language/region locale 
                break;
            case SPANISH:
                locale = new Locale("es", "MX");// there is no locale code in Java for Spanish so need the full constructor
                break;
            case GERMAN:
                locale = new Locale("de", "DE");
                break;
            case LUXEMBOURGISH:
                locale = new Locale("de", "LU");
                break;
            case MAORI:
                locale = new Locale("mi");
                break;
            
            // Add more cases for each language
        }
        messages = ResourceBundle.getBundle("messages", locale);
    }
}
