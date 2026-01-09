package com.edu.espoch.mayornumero;

public class MayorNumero {

    public static void main(String[] args) {
        System.out.println("Medicion del tiempo nanotime");
        
        int repeticiones = 15;
        int num1 = 5;
        int num2 = 6;
        
        
        System.out.println("ALGORITMO 1 (If)");
        long tiempoTotal = 0;
        
        for (int i = 0; i < repeticiones; i++) {
            long inicio = System.nanoTime();
            int resultado = algoritmoUno(num1, num2);
            long fin = System.nanoTime();
            
            long tiempo = fin - inicio;
            tiempoTotal += tiempo;
            
            System.out.println((i + 1) + ">>  Tiempo de ejecucion (nanosegundos): " + tiempo);
        }
        
        long promedio = tiempoTotal / repeticiones;
        System.out.println(">> Promedio de las repeticiones: " + promedio );
        System.out.println(">> El mayor es: " + num2 ); 
        
        System.out.println("\n==============================================================\n");
        
        // Segundo Algoritmo
        System.out.println("ALGORITMO 2(Math.max)");
        tiempoTotal = 0;
        
        for (int i = 0; i < repeticiones; i++) {
            long inicio = System.nanoTime();
            int resultado = algoritmoDos(num1, num2);
            long fin = System.nanoTime();
            
            long tiempo = fin - inicio;
            tiempoTotal += tiempo;
            
            System.out.println((i + 1) + ">>  Tiempo de ejecucion (nanosegundos): " + tiempo);
        }
        
        promedio = tiempoTotal / repeticiones;
        System.out.println(">> Promedio de las repeticiones: " + promedio);
        System.out.println(">> El mayor es: " + num2 );
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