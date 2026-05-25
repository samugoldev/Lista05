/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testeaula;

import java.util.Scanner;

/**
 *
 * @author samug
 */
public class Lista05 {
    public static void main(String[] args) {
        
        //Entrada de dados
        try (Scanner teclado = new Scanner(System.in)) {
            //Entrada de dados
            System.out.println("Digite a sua altura (Exemplo: 1.76)");
            float altura = teclado.nextFloat();
            
            System.out.println("Digite seu peso (Kg): ");
            float peso = teclado.nextFloat();
            
            //Calculo IMC
            float imc = peso / (altura * altura);  
                    
                    //Resultado
                    System.out.println("\nSeu IMC é: " + imc);
                    
                    //
                    if (imc < 18.5 ) {
                        System.out.println("Você está abaixo do peso ideal.");
                    } else if (imc >= 18.5 && imc < 25) {
                        System.out.println("Você esta no peso ideal");
                    }else if (imc >= 25 && imc < 30){
                        System.out.println("Você esta com sobrepeso");
                    }else {
                        System.out.println("Você esta acima do peso");
                    }
                    
                    teclado.close();
        }            
    }
}
