/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.tool.modal;

import java.io.File;

/**
 *
 * @author Matheus
 */
public class FreeDuel {
    private static final int SIMON = 1712043; //Decimal do campo E0C = 3596 somando para o próximo personagem
    private String nome;
    private static File freeDuel;
    private static final int soma = 3596;
    
    public static final int getSoma(){
        return FreeDuel.soma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static File getFreeDuel() {
        return freeDuel;
    }

    public static void setFreeDuel(File freeDuel) {
        FreeDuel.freeDuel = freeDuel;
    }
    public static final int getSimon(){
         return FreeDuel.SIMON;
    }
    
}
