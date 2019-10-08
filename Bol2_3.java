/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_3;

import java.util.Scanner;

/**
 *
 * @author Josemolamazo
 */
public class Bol2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner dinero = new Scanner(System.in);
        int billete100, billete20, billete5, moneda1;
        System.out.println("Teclee nº de billetes de 100 =");
        billete100 = dinero.nextInt();
        System.out.println("Teclee nº de billetes de 20 =");
        billete20 = dinero.nextInt();
        System.out.println("Teclee nº de billetes de 5 =");
        billete5 = dinero.nextInt();
        System.out.println("Teclee nº de monesdas de 1");
        moneda1 = dinero.nextInt();
        int valorBillete100 = 100;
        int valorBillete20 = 20;
        int valorBillete5 = 5;
        int valorMoneda1 = 1;
        int euros= (valorBillete100*billete100)+(valorBillete20*billete20)+(valorBillete5*billete5)+(valorMoneda1*moneda1);
        System.out.println("Euros ="+ euros);
    }
    
}
