package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un numero cualquiera: ");
        int numero= scanner.nextInt();
        System.out.println("...:::Sentencia IF, ELSE IF, ELSE:::... ");
        if(numero <= 10 && numero>0){
            System.out.println("Es menor ó igual a 10");
        }else if(numero < 100 && numero>10){
            System.out.println("El numero es mayor a 10 pero menor a 100");
        }else{
            System.out.println("Numero 0, numero negativo o mayor a 100");
        }

        System.out.println("...:::Switch:::... ");
        switch(numero % 2){
            case 0:
                System.out.println("El numero es par");
                break;
            case 1:
            case-1:
                System.out.println("El numero es impar");
                break;
        }


        System.out.println("...:::FOR:::... ");
        System.out.println("contando del 1 al "+numero+":");
        for(int i=1 ; numero>=i ;i++){
            System.out.println(i);
        }

        System.out.println("...:::WHILE:::... ");
        System.out.println("Cuenta regresiva desde " + numero + ":");
        int conteo = numero;
        while(conteo>0){
            System.out.println(conteo);
            conteo--;
        }

        System.out.println("...:::DO WHILE:::... ");
        System.out.println("Ingrese un número mayor que 10 para salir: ");
        int entrada;
        do {
            entrada = scanner.nextInt();
        } while (entrada <= 10);
        System.out.println("Saliste :0");
        scanner.close();
    }
}