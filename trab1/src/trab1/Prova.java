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
 */
public class Prova {
    private String designacao;
    private String modalidade;
    private String localidade;
    private double preco;
    private Date datahora;
    private ArrayList<Inscricao> inscricoes ; // lista de inscricoes
    
    
    
    //construtor
    public Prova(String designacao, String modalidade,
            String localidade, double preco, Date datahora) {
        this.designacao = designacao;
        this.modalidade = modalidade;
        this.localidade = localidade;
        this.preco = preco;
        this.datahora = datahora;
        inscricoes = new ArrayList(); 
    }      
   
     public String getDesignacao(){
        return designacao;
    } 

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getDatahora() {
        return datahora;
    }

    public void setDatahora(Date datahora) {
        this.datahora = datahora;
    }

    public ArrayList<Inscricao> getInscricoes() {
        return inscricoes;
    }

    public void setInscricoes(ArrayList<Inscricao> inscricoes) {
        this.inscricoes = inscricoes;
    }

      
    public boolean addInscFederado(String nif, String n, String m,
            String t, String e, Date dN, String c, Date dF){
        
        Federado f = new Federado(nif,n,m,t,
                e,dN,c,dF);         
        
        Inscricao incF = new Inscricao(f, this);
        System.out.println(incF.toString());
       return inscricoes.add(incF); // adicionando o tipo de atletas ao lista qu contem o conjunto de atletas
    }
    
    public boolean addInscNaoFederado(String nif, String n,
            String m, String t, String e, Date dN, boolean s){
        
        Nao_Federado nF = new Nao_Federado(nif,n,m,t,
                e,dN,s);  
        Inscricao  incNF = new Inscricao(nF, this);
        System.out.println(incNF.toString());
        return inscricoes.add(incNF);
         // adicionando o tipo de atletas ao lista que contem o conjunto de atletas
    }
    
    public boolean removerInscricao(String nif){
        for( Inscricao insc:inscricoes){
            if(insc.getAtleta().getNif().contains( nif)){
                return inscricoes.remove(insc);            
            }
        }
        return true;
    }
    
    public double totalFacturado(){ 
         double total = 0;
         
         for (int i = 0; i<inscricoes.size(); i++){   
             long dif = (datahora.getTime()-inscricoes.get(i).getData().getTime());
          if(dif >= 604800000){
         total += preco*0.9;
         }
          else if(dif >= 259200000){
         total += preco*0.95;
         }
          else{
          total += preco;
          }
         }
         return total;
    }
    
    public boolean equals(Object obj){
        if (obj==null ||this.getClass()!=obj.getClass())return false;
        else return designacao==((Prova)obj).designacao;
    }
   public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    
    public String toString(){
      return "Designação: "+designacao+"\nModalidade: "+modalidade+"\nLocalidade: "+localidade
              +"\nPreco: "+preco+"\nData: "+datahora;
    }    
}