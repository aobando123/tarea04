/**
 * Sastreria
 * Descripción: calcula la cantiidad de tela que tiene que comprar
 * Fecha:9 de febrero del 2017
 * Autor:Adrián Obando Leitón
 * Fecha de modificación: 09-02-17
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosTarea;

//Librerias

import java.io.*;

public class Sastreria {

    public static void main(String[] args) throws IOException {//Inicia el programa
        
        //Variables
        int personas,tela;
        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        
        imprimir.println("Digite la cantidad de personas a la que va a hacer vestidos");
        personas = Integer.parseInt(leer.readLine()) ;
        tela= personas*3;
        imprimir.println("La cantidad de tela a comprar es: "+ tela);
        
    }//Termina el programa
}
