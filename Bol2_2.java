/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_2;

import java.util.Scanner;

/**
 *
 * @author Josemolamazo
 */
public class Bol2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner temp= new Scanner (System.in);
        double grados;
        System.out.println("Teclee la T (Gº) =");
        grados = temp.nextDouble();
        double g = grados;
        double k = grados+273;
        double f = k*1.8-459.7;
        System.out.println("Grados celsius ="+ g+"Grados kelvin ="+ k+"Grados fahrenheit ="+ f);
        
        
        
    }
    
}
