/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprogrma;

/**
 *
 * @author Maikiely
 */
public class Pessoa {
    private String nome; 
    private String sobrenome;
    private int idade;
    
    public void setNome(String text){
       nome = text;
    }
    public void setSobrenome(String text){
        sobrenome = text;
    }
    public void setIdade(int n){
        idade = n;
    }
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    public int getIdade(){
        return idade;
    }
    public String toString(){
        String msg = nome +" "+ sobrenome+" "+idade;
        return msg;
    }
     public String toStringToFile(){
        String msg = nome +"#"+ sobrenome+""+idade;
        return msg;
    }
}

