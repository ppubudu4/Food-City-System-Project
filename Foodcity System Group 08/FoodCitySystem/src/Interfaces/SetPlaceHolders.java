/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import org.jdesktop.swingx.prompt.PromptSupport;


public class SetPlaceHolders {
    
    private Color Col;
    
    public SetPlaceHolders(String placeHolder , JTextField TF){
        
        PromptSupport.setPrompt(placeHolder, TF);
        PromptSupport.setFocusBehavior(PromptSupport.FocusBehavior.SHOW_PROMPT, TF);
        PromptSupport.setFontStyle(Font.BOLD, TF);
    
    
    }
    
    public SetPlaceHolders(String placeHolder , JComboBox<String> TF){
        
         Col = Color.GRAY;
         
         
             TF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"'"+placeHolder+"'"}));
       
    
    }
    
}
