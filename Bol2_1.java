/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_1;

import java.util.Scanner;

/**
 *
 * @author jreyarijon
 */
public class Bol2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner porcent= new Scanner (System.in);
        float precio, pago;
        System.out.println("Teclee precio del artículo =");
        precio = porcent.nextFloat();
        System.out.println("Teclee la cantidad que pagará =");
        pago = porcent.nextFloat();
        float porcentaje = 100-(pago/precio*100);
        System.out.println("Porcentaje ="+ porcentaje);
        
        
    }
    
}
