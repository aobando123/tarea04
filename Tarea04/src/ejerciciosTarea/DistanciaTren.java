/**
 * Nombre del programa Distancia recorrida por un tren
 * Descripción: Determinar la distancia recorrida por untren de punto A al punto B
 * Fecha:9 de febrero del 2017
 * Autor:Jose Solano Montoya
 * Fecha de modificación: 09-02-17
 * Modificado por: Jose Solano Montoya
 */
package ejerciciosTarea;

//Librerias
import java.io.*;

public class DistanciaTren {

    public static void main(String[] args) throws IOException //Inicia el programa
    {
        //Variables
         int tiemp1, tiemp2, velociT, hora1, hora2, min1, min2, tiempTot,mint, distancia;
         
        //Entrada y Salidas
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        PrintStream imprimir = System.out;
        imprimir.println("Digite el tiempo de inicio");
        tiemp1=Integer.parseInt(leer.readLine());
        imprimir.println("Digite el tiempo de llegada");
        tiemp2=Integer.parseInt(leer.readLine());
        imprimir.println("Digite la velocidad constante del tren");
        velociT= Integer.parseInt(leer.readLine());
        
        hora1= tiemp1/100;
        hora2= tiemp2/100;
        min1= tiemp1 %100;
        min2= tiemp2 %100;
         if (hora1>hora2)
         {
             hora1=hora2+(24-hora1);
         }
         else
         {
             hora1=hora1-hora2;
         }
         if(min1>min2)
         {
            min1=min1-min2;
         }
         else
         {
             min1=min2-min1;
         }
        mint= min1/60;
        
        tiempTot= mint+hora1;
        
        distancia= tiempTot *velociT;
        
        imprimir.println("La distancia recorrida del punto A al punto B es de "+ distancia);
    }//Termina el programa
}