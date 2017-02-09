/**
 * Salario
 * Descripción: saca el salario de dos trabajadores
 * Fecha:9 de febrero del 2017
 * Autor:Adrián Obando Leitón
 * Fecha de modificación: 09-02-17
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosTarea;

//Librerias

import java.io.*;
import static oracle.jrockit.jfr.events.Bits.intValue;

public class Salario {
    //Constante
    public static final double IMP=0.15;

    public static void main(String[] args) throws IOException {//Inicia el programa
        //Variables
        int horasTra,salarioH;
        int empleado1,empleado2;
        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        //codigo
        //Salario del empleado 1
        imprimir.println("Digite las horas trabajadas del empleado 1");
        horasTra = Integer.parseInt(leer.readLine());
        imprimir.println("Digite el salario por hora del empleado 1");
        salarioH = Integer.parseInt(leer.readLine());
        empleado1=horasTra*salarioH;
        //Salario del empleado 2
        imprimir.println("Digite las horas trabajadas del empleado 2");
        horasTra = Integer.parseInt(leer.readLine());
        imprimir.println("Digite el salario por hora del empleado 2");
        salarioH = Integer.parseInt(leer.readLine());
        empleado2=horasTra*salarioH-intValue(horasTra*salarioH*IMP);
        //iMPRESION DE SALARIO
        imprimir.println("El salario del empleado 1 es: "+ empleado1);
        imprimir.println("El salario del empleado 2 es: "+ empleado2);
        
        
        

    }//Termina el programa
}