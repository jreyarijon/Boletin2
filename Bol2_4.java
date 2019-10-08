/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_4;

import java.util.Scanner;

/**
 *
 * @author Josemolamazo
 */
public class Bol2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner desglose= new Scanner (System.in);
        int euros;
        System.out.println("Teclee una cantidad de dinero =");
        euros = desglose.nextInt();
        int billete100= euros/100;
        int billete20= (euros%100)/20;
        int billete5= ((euros%100)%20)/5;
        int moneda1= (((euros%100)%20)%5)/1;
        System.out.println("Billetes de 100 ="+ billete100+"Billete de 20 ="+ billete20+"billete de 5 ="+ billete5+"Monedas de 1 ="+ moneda1);
        
        
    }
    
}
