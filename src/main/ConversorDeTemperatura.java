package main;

import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bem vindo ao Conversor de Temperatura!");
        System.out.println("--------------------------------------");
        System.out.println("Celsius para Fahrenheit.");
        System.out.println("Digite a temperatura em graus Celsius: ");
        double num1 = sc.nextInt();
        
        double num2 = 32;
        
        double temp = num1 * 1.8 + num2;
        
        System.out.println("O valor de " +num1+ "°C em Fahrenheit é de: " +temp+ "°F. ");
        System.out.println("Encerrando...");
    }
    
}
