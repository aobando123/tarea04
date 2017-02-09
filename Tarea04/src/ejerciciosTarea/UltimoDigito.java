/**
 * Ultimo digito
 * Descripción: saca el ultimo digito de un numero
 * Fecha:9 de febrero del 2017
 * Autor:Adrián Obando Leitón
 * Fecha de modificación: 09-02-17
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosTarea;

//Librerias

import java.io.*;

public class UltimoDigito {

    public static void main(String[] args) throws IOException {//Inicia el programa
        //Variables
        int num,ultDigito;
        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        //codigo
        imprimir.println("Digite un numero");
        num= Integer.parseInt(leer.readLine());
        ultDigito=num%10;
        
        imprimir.println("El ultimo digito es "+ ultDigito);

    }//Termina el programa
}