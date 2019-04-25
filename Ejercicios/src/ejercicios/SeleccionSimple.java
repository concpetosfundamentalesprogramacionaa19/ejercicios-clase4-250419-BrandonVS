/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import paquete2.*;
/**
 *
 * @author Brandon
 */
public class SeleccionSimple {
    
    public static void main(String[] args) {
        // Se declara e importan las variables
        int calificacion = 85;
        String miMensaje = Operacion.mensaje;
        // Se calcula el resulltado
        if (calificacion >= 85){
            System.out.printf("%s %d\n", miMensaje, calificacion);
        }
        // Se declara la segunda variable
        int calificacion_2 = 45;
        // Se calcula el resultado
        if (calificacion_2 >= 85){
            System.out.printf("%s %d\n", miMensaje, calificacion_2);
        }
    
            
            
    }
   
}