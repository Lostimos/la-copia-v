/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.stany.ejemplo.primerprojecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author stany
 */
public class prueba{
    
    BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    private final String cadena = "";
    private int tamanio=0;
    private String []vector;
    
    public String []SepararNumeros(String cadena) throws IOException{
        
    System.out.println("Ingrese la operacion que desea :\n");
    cadena=leer.readLine();
    tamanio=cadena.length();
    
    for(int contador=0;contador<tamanio;contador++){
    if(Character.isDigit(cadena.charAt(contador))){
    vector[contador]=vector[contador]+cadena.charAt(contador)+"\n";
    }
    }
    
    
        return vector;
    }
    
}
