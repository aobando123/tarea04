/**
 * Velocidad
 * Descripción: calcular la velocidad en base a la distancia y tiempo
 * Fecha:9 de febrero del 2017
 * Autor:Adrián Obando Leitón
 * Fecha de modificación: 09-02-17
 * Modificado por: Adrián Obando Leitón
 */
package ejerciciosTarea;

//Librerias
import java.io.*;

public class Velocidad {

    public static void main(String[] args) throws IOException {//Inicia el programa
        double tiempo, distancia, velocidad;
        //variables de entrada y salida
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;

        //codigo
        imprimir.println("Digite la distancia recorrida en kilometros");
        distancia = Double.parseDouble(leer.readLine());
        imprimir.println("Digite el tiempo que se ha durado en horas");
        tiempo = Double.parseDouble(leer.readLine());

        velocidad = tiempo * distancia;
        imprimir.println("La velocidad que se recorre es:" + velocidad);

    }//Termina el programa
}
