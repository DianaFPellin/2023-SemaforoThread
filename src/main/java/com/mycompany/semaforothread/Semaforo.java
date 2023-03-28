/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semaforothread;

public class Semaforo implements Runnable {
    private String sinal; 
    private boolean mudou; 
    private boolean inativo; 

    public Semaforo() {
        this.sinal = "Verde";
        this.mudou = false;
        this.inativo = false;
        new Thread(this).start(); //Minha própria classe irá instanciar uma Thread
    }
    
    //O método run é o código que a Thread precisa executar
    @Override
    public void run() {
        while(!inativo) {
            try {
                switch(this.sinal) {
                    case "Verde": 
                        Thread.sleep(2000); //A Thread espera en milisegundos
                        break;
                    case "Vermelho": 
                        Thread.sleep(2000); 
                        break;
                }
                this.mudarSinal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    public boolean isMudou() {
        return mudou;
    }

    public void setMudou(boolean mudou) {
        this.mudou = mudou;
    }

    public boolean isInativo() {
        return inativo;
    }

    public void setInativo(boolean inativo) {
        this.inativo = inativo;
    }
    
    //Métodos
    public void verificaPotencia(int ano) {
        try {
            if(ano > 2010) {
                Thread.sleep(500);
            } else {
                Thread.sleep(750);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    private synchronized void mudarSinal() {
        switch(this.sinal) {
            case "Vermelho": this.sinal = "Verde"; 
            break;
            case "Verde": this.sinal = "Vermelho";
            break;
        }
        
        this.mudou = true;
        notify();
    }   
    
    public synchronized void tempoSinal() {
        while(!this.mudou) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.mudou = false; 
    }
    
    public synchronized void desligar() {
        this.inativo = true;
    }
}
