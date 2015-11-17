/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

import javax.swing.JOptionPane;

/**
 *
 * @author aabalalonso
 */
public class Boletin9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float num;
        int i = 1;
        num = Float.parseFloat(JOptionPane.showInputDialog("Introduce el numero del cual quieres saber su tabla de multiplicar"));
        do {
            while (i < 11) {
                JOptionPane.showMessageDialog(null, num + " * " + i + " = " + num * i);
                i++;
            }
        } while (i != 0);

    }
}
