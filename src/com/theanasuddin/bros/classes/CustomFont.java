/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theanasuddin.bros.classes;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Anas
 */
public class CustomFont {
    
    Font PoppinsSemiBold;

    public CustomFont() {
        try {
            PoppinsSemiBold = Font.createFont(Font.TRUETYPE_FONT, new File("/fonts/Poppins-SemiBold.otf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(PoppinsSemiBold);
        } catch (FontFormatException | IOException e) {

        }
    }
}
