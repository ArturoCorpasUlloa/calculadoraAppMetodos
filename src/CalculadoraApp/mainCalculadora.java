package CalculadoraApp;

import java.util.Scanner;

public class mainCalculadora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        funciones funcion = new funciones();
        float resultado;
        int opcionOperacion;

        do {
            System.out.println(" ");
            System.out.println("¿ Qué operación deseas realizar ?");
            System.out.println(" ");
            System.out.println("1) Suma \n2)Resta \n3)Multiplicación \n4)División \n5)Salir");
            opcionOperacion = entrada.nextInt();
        }   while (opcionOperacion < 1 || opcionOperacion > 5);

        System.out.println("Ingrese el primer numero: ");
        float n1 = entrada.nextFloat();
        funcion.setN1(n1);
        System.out.println("Ingrese el segundo numero: ");
        float n2 = entrada.nextFloat();
        funcion.setN2(n2);
        switch (opcionOperacion) {
            case 1:
                resultado = funcion.sumar();
                System.out.println(resultado);
                break;
            case 2:
                resultado = funcion.restar();
                System.out.println(resultado);
                break;
            case 3:
                resultado = funcion.multiplicar();
                System.out.println(resultado);
                break;
            case 4:
                resultado = funcion.dividir();
                System.out.println(resultado);
                break;
            case 5:
                System.out.println("Adios");
        }
    }
}
