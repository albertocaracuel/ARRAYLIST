/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejecicio;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author alberto
 */
public class Ej24 {

    private static int Aleatorio(int max, int min) {
        Random aleatorio = new Random();
        int enteroAleatorio = aleatorio.nextInt(max - min + 1) + min;
        return enteroAleatorio;
    }

    public static void main(String[] args) {
        //primera parte
        //creo los arraylist y le especifico el tamaño
        ArrayList<Integer> lista1 = new ArrayList<Integer>();
        lista1.ensureCapacity(Aleatorio(15, 5));

        ArrayList<Integer> lista2 = new ArrayList<Integer>();
        lista2.ensureCapacity(Aleatorio(20, 10));
        //creo los for para añadirle los valores a los array list
        for (int i = 0; i < Aleatorio(15, 5); i++) {
            Aleatorio(100, 50);
            lista1.add(Aleatorio(100, 50));
        }

        for (int i = 0; i < Aleatorio(20, 10); i++) {
            Aleatorio(100, 50);
            lista2.add(Aleatorio(100, 50));
        }
        //muestro los arraylist
        System.out.println(lista1);

        System.out.println(lista2);

        //segunda parte
        //creo la tercera lista
        ArrayList<Integer> lista3 = new ArrayList<Integer>();
        //comparo los dos array
           
    for (Integer element : lista1) { 
        if (!lista2.contains(element)) { 
            lista3.add(element); 
        } 
    }   
  
//        for (int i = 0; i < lista1.size(); i++) { //Itera elementos del primer ArrayList
//            for (int j = 0; j < lista1.size(); j++) {
//                if (lista1.get(i).equals(lista2.get(j))) { //Compara si los valores son iguales.
//
//                } else {
//                    //le añado el valor comparado y q no es igual de la lista1
//                    lista3.add(lista1.get(i));
//                }
//            }
//
//        }
        
//        Set<Integer> hashSet = new HashSet<Integer>(lista3);
//        lista3.clear();
//        lista3.addAll(hashSet);
        //imptimo la tercera lista
        System.out.println(lista3);

        //tercera parte
        ArrayList<Integer> lista4 = new ArrayList<Integer>();

        for (int i = 0; i < lista1.size(); i++) { //Itera elementos del primer ArrayList

            if (lista1.get(i) % 2 == 0) { //Compara si los valores son iguales.

            } else {
                lista4.add(lista1.get(i));
            }

        }

        for (int i = 0; i < lista2.size(); i++) { //Itera elementos del primer ArrayList

            if (lista2.get(i) % 3 == 0) { //Compara si los valores son iguales.

            } else {
                lista4.add(lista2.get(i));
            }

        }
//expresion lambda
        lista4.stream().forEach(a -> System.out.println(a));
    }
}
