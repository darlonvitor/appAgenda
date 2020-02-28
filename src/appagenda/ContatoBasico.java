/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appagenda;

/**
 *
 * @author darlo
 */

import java.util.ArrayList;

abstract public class ContatoBasico {
    //o protected permite que as subclasses tenham acesso aos atributos
   protected String nome;
   protected ArrayList<Telefone> telefones;
   
   public ContatoBasico(String nome){
       this.nome = nome;
       this.telefones = new ArrayList<>();
   }
   
   public String getNome(){
       return this.nome;
   }
   
   public void setNome(String nome){
       this.nome = nome;
   }
   
   public void setTelefone(Telefone tf){
       this.telefones.add(tf);
   }
   
   public String getDados(){
       String dados = this.nome + "\n";
       
       //usando foreach para percorrer o arraylist
       for(Telefone t:telefones){
           dados += t.getTelefone() + "\n";
       }
       return dados;
   }
   
}

