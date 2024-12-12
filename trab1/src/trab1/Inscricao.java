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
public class Inscricao {
    private Date dataInscricao;
    private Prova prova;
    private Atleta atleta;
    private double valor;
    
    public Inscricao(Atleta a, Prova p){
        prova = p;
        atleta = a;
        dataInscricao = new Date();
       
    }   

    public Date getData() {
        return dataInscricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    

    public Prova getProva() {
        return prova;
    }

    public void setProva(Prova prova) {
        this.prova = prova;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void setAtleta(Atleta atleta) {
        this.atleta = atleta;
    }
     
    
    @Override
    public String toString(){
                
        String str = "Dados do Atleta:\n" + atleta.toString();
        
        
        return str;
    }

    
}
