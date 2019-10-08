/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol2_5;

import java.util.Scanner;

/**
 *
 * @author Josemolamazo
 */
public class Bol2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner soldo = new Scanner(System.in);
       float soldoFixo, soldoBruto, soldoLiquido, importeVendas, quilometraxe, diasDesplazamiento;
       System.out.println("Teclee soldo fixo =");
       soldoFixo = soldo.nextFloat();
       System.out.println("Teclee importe total de vendas =");
       importeVendas = soldo.nextFloat();
       System.out.println("Teclee quilometraxe total =");
       quilometraxe = soldo.nextFloat();
       System.out.println("Teclee días de desplazamiento =");
       diasDesplazamiento = soldo.nextFloat();
       float comision = (float)0.05*importeVendas;
       float kmEuros = 2*quilometraxe;
       float dietasEuros = 50*diasDesplazamiento;
       float soldoTotal = soldoFixo+comision+kmEuros+dietasEuros;
       float irpf = (float)0.18*soldoTotal;
       float ss = 36;
       float soldoNeto = (float)soldoTotal-(irpf+ss);
       System.out.println("Soldo Bruto ="+ soldoTotal+ "Soldo Liquido ="+ soldoNeto);
               
      

       
       
       
       
        
    }
    
}
