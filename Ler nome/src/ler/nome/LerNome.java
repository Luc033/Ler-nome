/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ler.nome;

/**
 *
 * @author morta
 */ import java.util.Scanner;

public class LerNome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String Nome;
    String Sobrenome;
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira seu nome");
    Nome = leitor.next();
    System.out.println("Agora o seu sobrenome"); 
    Sobrenome = leitor.next();
    System.out.println("Grande " + Sobrenome + ", " + Nome);  // TODO code application logic here
    }
    
}
