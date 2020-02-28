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
public class ContatoComercial extends ContatoBasico{
    protected String atividade,funcionario;
    
    public ContatoComercial(String nome, String atividade, String funcionario){
        super(nome);
        this.atividade = atividade;
        this.funcionario = funcionario;
    }
    
    @Override
    public String getDados(){
        return super.getDados() + this.atividade + ":\nContato Sr(a): " + this.funcionario; 
    }
}
