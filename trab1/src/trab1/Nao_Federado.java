/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trab1;
import java.util.*;
/**
 *
 * @author Pedro Rocha(a46161) e Yuran Mendes(a44783)
 * Engenharia Informática
 * 
 */
public class Nao_Federado extends Atleta {
    
    private boolean saude;
    
     public Nao_Federado( String nif, String nome, String morada ,
            String telefone,String email,Date dataNascimento, boolean sa){
         
     super(nif , nome,morada,telefone ,email ,dataNascimento);
    saude = sa;    
    
    }
    
    @Override
     public String toString(){
         
         return super.toString()+"Saudavel?-> "+saude+"\n\n";
     }
}
