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

public class Agenda {
    private ArrayList<ContatoBasico> contatos;
    
    public Agenda(){
        contatos = new ArrayList<>();
    }
    
    //adicionando novo contato
    public void insetir(ContatoBasico c){
        this.contatos.add(c);
    }
    
    //buscar contato pelo nome
    public ContatoBasico buscar(String nome){
        //usando forEach para encontrar o contato
        for( ContatoBasico c : contatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                return c;
            }
        }
        return null;
    }
    
    //buscar contato pela posiçao na lista
    public ContatoBasico buscar(int pos){
        return (pos>=0 && pos<contatos.size()) ? contatos.get(pos) : null;
    }
    
    //buscar por email entre os EContatos
    public EContato buscarEmail(String email){
        for(ContatoBasico c : contatos){
            if(c instaceof EContato){//verificando se o contato é uma instância de EContato
                EContato ec = (EContato)c;
                if(ec.getEmail().equalsIgnoreCase(email)){
                    return ec;
                }
            }
        }
        return null;
    }
    
    //busca geral, retorna um array com os resultados da busca de uma palavra 
    public ContatoBasico[] buscaGeral(String keyWord){
        ArrayList<ContatoBasico> todos = new ArrayList<>();
        for(ContatoBasico c:contatos){
            if(c.getDados().contains(keyWord)){//verificando a ocorrencia da key word
                todos.add(c);
            }
        }
        
        ContatoBasico[] vet = new ContatoBasico[contatos.size()];
        return todos.toArray(vet);
    }
    
    //retorna um array com todos os contatos salvos na agenda
    public ContatoBasico[] buscarTodos(){
        ContatoBasico[] vet = new ContatoBasico[contatos.size()];
        return contatos.toArray(vet);
    }
    
    //obtendo numero de contatos 
    public int quantidade(){
        return contatos.size();
    }
}
