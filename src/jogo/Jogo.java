/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogo;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nome;
        String classe;
        String comecar;
        int vida;
        int dano; 
        
        System.out.println("OlÃ¡, seja bem-vindo. Vamos criar seu personagem, qual serÃ¡ o nome do seu personagem?");
        nome = entrada.nextLine();
        
        System.out.println("Uau, que criatividade para nome, agora me diga, qual serÃ¡ a classe do seu personagem?");
        classe = entrada.nextLine (); 
        
        System.out.println("OK, quanto de vida terÃ¡ seu personagem?");
        vida = entrada.nextInt(); 
        
        System.out.println("seu personagem estÃ¡ pronto, vamos para batalha! Antes disso, digite ok para comeÃ§ar.");
        comecar = entrada.nextLine();
        
        
        do {
            System.out.println("Qual dano recebido?");
            dano = entrada.nextInt();
            
            vida = vida - dano;
            
            System.out.println("Sua vida Ã©" + vida);
            
        } while (vida >= 0);
        
       
        if (vida <= 0) {
            System.out.println("Voce morreu seu babaca");
            
        }
        
        
                
        
        
        
        
              
            
    }
    
}

