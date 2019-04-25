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
public class SeleccionAnidada {
    public static void main(String[] args) {
        // Se crea el escaner
        Scanner scan = new Scanner(System.in);
        // Se importan los mensajes
        String miExcelente = Operacion2.mExcelente;
        String miMuybuena = Operacion2.mMuybuena;
        String miRegular = Operacion2.mRegular;
        String miReprobado = Operacion2.mReprobado;
        // Se pide al usuario su calificacion
        System.out.println("Ingrese su califficacion: ");
        int calificacion = scan.nextInt();
        // Se calcula si esta aprobado o reprobado mediante el condicional if
        if (calificacion >= 90){
            System.out.printf("%s %d\n", miExcelente, calificacion);
        } else {
            if (calificacion < 90 && calificacion >= 80){
                System.out.printf("%s %d\n", miMuybuena, calificacion);
            } else {
                if (calificacion < 80 && calificacion >= 50){
                    System.out.printf("%s %d\n", miRegular, calificacion);
                } else {
                    System.out.printf("%s %d\n", miReprobado, calificacion);
                }
            }
        }
    }
    
}
