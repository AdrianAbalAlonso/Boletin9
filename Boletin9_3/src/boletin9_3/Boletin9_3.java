/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;
import javax.swing.JOptionPane;
/**
 *
 * @author aabalalonso
 */
public class Boletin9_3 {

   
    public static void main(String[] args) {
        float base=0 ;
        float altura=0 ;
        float arearectangulo ;
       
       
        do{ base=Float.parseFloat(JOptionPane.showInputDialog("Escribe base"));}while(base<0);
        do{altura=Float.parseFloat(JOptionPane.showInputDialog("Escribe altura"));}while(altura<0);
        arearectangulo=base*altura;
        JOptionPane.showMessageDialog(null,"Esta es el area " +arearectangulo);
    
    
    
    
    
    }
    
}
