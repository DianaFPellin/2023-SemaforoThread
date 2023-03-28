/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.semaforothread;

import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        Carros carro_1 = new Carros(1, 1982, "Fuque"); 
        Carros carro_2 = new Carros(2, 2015, "Camaro Bumblebee"); 
        Carros carro_3 = new Carros(3, 2021, "Honda Civic"); 
        Carros carro_4 = new Carros(4, 2020, "Jeep"); 
        Carros carro_5 = new Carros(5, 2010, "Corolla"); 
        Carros carro_6 = new Carros(6, 2013, "Astra"); 
        Carros carro_7 = new Carros(7, 1994, "Vectra"); 
        Carros carro_8 = new Carros(8, 2019, "Ford Ranger"); 
        Carros carro_9 = new Carros(9, 2022, "Lamburghini");
        Carros carro_10 = new Carros(10, 1997, "Dodge Charge"); 
        Carros carro_11 = new Carros(11, 2010, "Gol"); 
        Carros carro_12 = new Carros(12, 2018, "Onix"); 
        Carros carro_13 = new Carros(13, 2017, "Mustang"); 
        Carros carro_14 = new Carros(14, 2020, "Saveiro"); 
        Carros carro_15 = new Carros(15, 2020, "Bronco"); 
        Carros carro_16 = new Carros(15, 2014, "C4"); 
        Carros carro_17 = new Carros(15, 2015, "Zafira"); 
        Carros carro_18 = new Carros(15, 2020, "Highlander"); 
        Carros carro_19 = new Carros(15, 2020, "EcoSport"); 
        Carros carro_20 = new Carros(15, 2020, "Caoa Chery");
        
        Queue<Carros> carros = new LinkedList<>();
            carros.add(carro_1); 
            carros.add(carro_2); 
            carros.add(carro_3); 
            carros.add(carro_4); 
            carros.add(carro_5); 
            carros.add(carro_6); 
            carros.add(carro_7); 
            carros.add(carro_8); 
            carros.add(carro_9); 
            carros.add(carro_10); 
            carros.add(carro_11); 
            carros.add(carro_12); 
            carros.add(carro_13); 
            carros.add(carro_14); 
            carros.add(carro_15); 
            carros.add(carro_16); 
            carros.add(carro_17); 
            carros.add(carro_18); 
            carros.add(carro_19); 
            carros.add(carro_20); 
            
            for (int i = 0; i < 20; i++) {
                System.out.println("Sinal está: " + semaforo.getSinal());
                
                while (semaforo.getSinal().equals("Verde")) {
                    if(!carros.isEmpty()) {
                       System.out.println("Carros em movimento... ");
                       semaforo.verificaPotencia(carros.element().getAno());
                       System.out.println("O carro " + carros.poll().getModelo() + " saiu");
                   } else {
                       break;
                   }
                }
                semaforo.tempoSinal();
            }
            semaforo.desligar();
    }
}
