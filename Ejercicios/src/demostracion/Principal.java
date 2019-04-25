/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;
import java.util.Scanner;
/**
 *
 * @author Brandon
 */
public class Principal {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double tarifab = 3;// El valor de la tarifa basica
        double valor;// El valor mensual sin IVA
        double msg1;// Auxiliar del precio de los mensajes superiores a 40
        double msg2;// Auxiliar del precio de los mensajes superiores a 200
        double valorf;// El valor mensual con IVA
        // Se solicitan los mensajes
        System.out.println("Ingrese el numero de mensajes: ");
        int msg = scan.nextInt();
        // Se calcula el pprecio menual con condicionales
        if (msg == 40){
            valor = tarifab;
            System.out.printf("El valor mensual sera: %.2f", valor);
        } else {
            if (msg >= 40 && msg <= 200){
                msg1 = msg - 40;
                msg1 = msg1 * 0.05;
                valor = msg1 + tarifab;
                valorf = (valor * 12)/100;
                System.out.printf("El valor mensual sera: %.2f", valorf);
            } else {
                if (msg < 200){
                    msg2 = msg - 200;
                    msg2 = msg2 * 0.10;
                    msg1 = msg - msg2;
                    msg1 = msg1 - 40;
                    msg1 = msg1 * 0.05;
                    valor = msg2 + msg1 + tarifab;
                    valorf = (valor * 12)/100;
                    System.out.printf("El valor mensual sera: %.2f", valorf);
                }
            }
        }
        
    }
}
