/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semaforothread;

/**
 *
 * @author Aluno
 */
public class Carros {
    private int placa; //Identifica o carro
    private int ano; //Determinar a potencia do motor
    private String modelo; //Determina também a potencia do motor
    
    public Carros(int placa, int ano, String modelo) {
        this.placa = placa; 
        this.ano = ano; 
        this.modelo = modelo;
    } 

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Carros{" + "placa=" + placa + ", ano=" + ano + ", modelo=" + modelo + '}';
    }
    
    
    
}
