/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
import paquete2.*;
/**
 *
 * @author Brandon
 */
public class SeleccionDoble {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); // Crear el escaner
        
        // Importar los mensajes
        String miMensaje = Operacion.mensaje;
        String miMensaje2= Operacion.mensaje2;
        
        // Se piden los datos
        System.out.printf("Ingrese su calificacion:");
        int calificacion = scan.nextInt();
        
        // Se revisa si esta aprovado o reprobado y se muestra el resultado
        if (calificacion >=85){
            System.out.printf("%s %d\n", miMensaje, calificacion);
        } else {
            System.out.printf("%s %d\n", miMensaje2, calificacion);
        }
        
        // Se pide la segunda calificacion
        System.out.println("Ingrese su calificacion:");
        int calificacion_2 = scan.nextInt();
        
        // Se revisa si esta aprobado o reprobado y su muestra el resultado
        if (calificacion_2 >= 85) {
            System.out.printf("%s %d\n", miMensaje, calificacion_2);
        } else {
            System.out.printf("%s %d\n", miMensaje2, calificacion_2);
        }
    }
}
