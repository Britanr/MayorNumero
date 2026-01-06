package com.edu.espoch.mayornumero;

public class MayorNumero {

    public static void main(String[] args) {

        long inicio = System.nanoTime();

        for (int i = 0; i < 40; i++) {
            algoritmoUno(150, 200);
        }
        long fin = System.nanoTime();
        long tiempo = fin - inicio;

        System.out.println("Tiempo algoritmoUno " + tiempo);
    }

    public static int algoritmoUno(int num1, int num2) {
        int mayor; 

        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }

        return mayor; 
    }

    public static int algoritmoDos(int num1, int num2) {
        return Math.max(num1, num2); 
    }
}

