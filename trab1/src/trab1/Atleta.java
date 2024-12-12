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
public abstract class Atleta {
    protected String nif;
    protected String nome;
    protected String morada;
    protected String telefone;  
    protected String email;
    protected Date dataNascimento;
    
    private LinkedHashSet<Inscricao> inscricoes;

    public Atleta(String nif, String nome, String morada,
            String telefone, String email, Date dataNascimento) {
        
        this.nif = nif;
        this.nome = nome;
        this.morada = morada;
        this.telefone = telefone;
        this.email = email;
        this.dataNascimento = dataNascimento;
        inscricoes = new LinkedHashSet(); // listas de inscriçoes por parte do Atleta 
    }  
    
    public String getNif() {
        return nif;
    }

    public String getNome() {
        return nome;
    }

    public String getMorada() {
        return morada;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setMorada(String m) {
        this.morada = m;
    }

    public void setTelefone(String t) {
        this.telefone = t;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public void setDataNascimento(Date dN) {
        this.dataNascimento = dN;
    }
    
    
    public boolean removerInscricao(Inscricao insc){
        return inscricoes.remove(insc);
    }
    
     public boolean addInscricao(Inscricao insc){  // adcicionando uma inscicao a lista de inscricoes do atleta
        return inscricoes.add(insc);        
    }
     
     public String toString(){
         return "NIF: "+nif+"\nNome: "+nome+"\nMorada: "+morada
              +"\nEmail: "+email+"\nData: "+dataNascimento+"\n";
         
     }
     
  }
