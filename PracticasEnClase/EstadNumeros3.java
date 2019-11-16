/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadnumeros3;

import java.util.Scanner;

/**
 *
 * @author SALAS
 */
public class EstadNumeros3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num, num1, sum, c, multiplos;
        float media;
        System.out.print("Ingrese cantidad de numeros: ");
        num = sc.nextInt();
        c = 1 ;
        sum = 0;
        multiplos = 0;
        if ( num > 0 ){
            while ( c <= num){
                System.out.print("Ingrese numero: ");
                num1 = sc . nextInt();
                if (num1 % 5 == 0){
                    multiplos = multiplos + 1;
                }
                sum = sum + num1;
                c = c + 1;
            }
            media =  sum / num;
            System.out.println("La media aritmetica es: " + media);
             System.out.println("Cantidad de multiplos de 5  es :" + multiplos);
        } else {
            System.out.println("Dato incorrecto");
        }
    }
    
}
