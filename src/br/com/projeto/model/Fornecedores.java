/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.model;

/**
 *
 * @author Catita_GS
 */
public class Fornecedores extends  Clientes {
    
    //atributos
    private String cnpj;    
    
    //getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString(){
        return this.getNome();        
    }
    
    
}
