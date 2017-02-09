/**
 * Promedio de 3 numeros
 * Descripción:  sacar el promedio de 3 numeros
 * Fecha:9 de febrero del 2017
 * Autor:Adrián Obando Leitón
 * Fecha de modificación: 09-02-17
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosTarea;

//Librerias

import java.io.*;

public class Promedio {

    public static void main(String[] args) throws IOException {//Inicia el programa
        //Variables
        int num1, num2, num3;
        double prom;
        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;

        //Codigo
        imprimir.println("Digite tres numeros separados por enter: ");
        num1=Integer.parseInt(leer.readLine());
        num2=Integer.parseInt(leer.readLine());
        num3=Integer.parseInt(leer.readLine());
        
        prom=(num1+num2+num3)/3.0;
        
        imprimir.println("el promedio de los tres numeros es: "+ prom);

    }//Termina el programa
}
