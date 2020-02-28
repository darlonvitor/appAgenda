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
public class Telefone {
    //atributos da classe
    private String numero;
    private String tipo;
    
    public Telefone(String numero){
        this.numero = numero;
        this.tipo = "";
    }
    //sobrecarga do construtor da classe
    public Telefone(String numero,String tipo){
        this(numero);
        this.tipo = tipo;
    }
    
    //metodo get
    public String getTelefone(){
        return this.numero + " " + this.tipo;
    }
}
