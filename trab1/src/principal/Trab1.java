/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;


import java.util.*;

import trab1.Prova;

/**
 *
 * @author Pedro Rocha(a46161) e Yuran Mendes(a44783)
 * Engenharia Informática
 * 
 */
public class Trab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Date dF1 = new Date(2022, 1, 11);
    Date dF2 = new Date(2022, 2, 4);
    Date datahora1 = new Date(2022,12,29);
    Date datahora2 = new Date(2023,5,3);
    Date datahora3 = new Date(2023,3,12);
    Date dataNascimento1 = new Date(2000,11,25);
    Date dataNascimento2 = new Date(2000,1,1);
    Date dataNascimento3 = new Date(1989,4,20);
    
    
    Prova p1 = new Prova("Box", "Peso-Pesado", "Vila Real", 12.99, datahora1);
    
    
  

  
    p1.addInscFederado("2111111", "Yuran", "Rua A", "233344444", "yuran@email.com", dataNascimento1, "Porto", dF1);
    p1.addInscNaoFederado("23333333", "Pedro", "Rua B" , "99888888", "pedro@email.com", dataNascimento2, true);
    
    System.out.println("Total Facturado: "+p1.totalFacturado()+"\n");
    System.out.println("Dados da Prova:\n"+p1.toString());
    
   
    
    
    
    }
}