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

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Contato extends ContatoBasico {
    protected Calendar dtNascimento;
    
    public Contato(String nome, Calendar nascimento){
        super(nome);//chamando o construtor da classe pai (superclasse)
        this.dtNascimento = nascimento;
    }
    
    @Override
    public String getDados(){
        return super.getDados() + "\n Nascido em:\n"
                + dtNascimento.get(Calendar.DATE)+"/"
                + dtNascimento.get(Calendar.MONTH)+"/"
                + dtNascimento.get(Calendar.YEAR) + "\nidade: " + this.getIdade();
    }
    
    public int getIdade(){
        Calendar hoje = new GregorianCalendar();//iniciando obj com a data de hoje
        
        int idade  = hoje.get(Calendar.YEAR) - dtNascimento.get(Calendar.YEAR);//diferença entre o ano de nascimento e o ano corrente
        hoje.set(Calendar.YEAR,dtNascimento.get(Calendar.YEAR));
        
        if(hoje.before(this.dtNascimento)){//verificando se a idade está completa
            idade--;
        }
        return idade;
    }
}
