/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appagenda;

import java.util.Calendar;

/**
 *
 * @author darlo
 */
public class EContato extends Contato{
    protected String email,homepage;
    
    public EContato(String nome,Calendar nascimento,String email,String homepage){
        super(nome,nascimento);
        this.email = email;
        this.homepage = homepage;
    }
    
    @Override
    public String getDados(){
        return super.getDados() + "\nEmail: " + this.email + "\nHomepage: " + this.homepage;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getHomepage(){
        return this.homepage;
    }
}
