/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;
import javax.swing.JOptionPane;
/**
 *
 * @author aabalalonso
 */
public class Boletin9_2 {

    
    public static void main(String[] args) {
       int i = 10;
      int suma = 0 ;
      double multiplicacion ;
      multiplicacion=1;
     
       while(i<90){
        suma+=i;
        multiplicacion*=i;
        i++;
       }  
       JOptionPane.showMessageDialog(null,"la suma sera "+suma);
       JOptionPane.showMessageDialog(null,"la multiplicacion sera "+multiplicacion);
    }  
}
