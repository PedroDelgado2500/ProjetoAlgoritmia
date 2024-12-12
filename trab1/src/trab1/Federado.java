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
public class Federado extends Atleta {
    private String clube;
    private Date dataRegistoFed;

    public Federado( String nif, String nome, String morada ,
            String telefone,String email,Date dataNascimento,
            String c , Date dtrfed){
    super(nif , nome, morada, telefone , email, dataNascimento);
    clube = c;
    dataRegistoFed = dtrfed;    
    }
    

    public String getClube() {
        return clube;
    }

    public Date getDataRegistoFed() {
        return dataRegistoFed;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public void setDataRegistoFed(Date dataRegistoFed) {
        this.dataRegistoFed = dataRegistoFed;
    }
    @Override
    public String toString(){
         
         return super.toString()+clube+dataRegistoFed+"\n";
         
    }
}
    
