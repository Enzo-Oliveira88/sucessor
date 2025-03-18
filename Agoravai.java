package com.mycompany.agoravai;
import java.util.Scanner; // adicionar para o scanner funcionar 

public class Agoravai {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // adicionar scanner
         System.out.println("Digite um numero: "); // system out serve para aparecer a mensagem no cursor e colocar mensagem sempre em aspas
    int x1 = teclado.nextInt(); // declarar variavel do primeiro numero int se for numero inteiro
    System.out.println("Digite outro numero:"); // sempre colocar system out para uma nova mensagem 
    int x2 = teclado.nextInt(); // declarar outra variavel caso seja uma necessidade de uma operaçaode dois ou mais numeros 
    int soma = x1 + x2; // colocar soma conforme os nomes das variaveis 
    int multiplicacao = x1 * x2; // sempre se lembrar que o asterisco serve para multiplicacao
    System.out.println("o numero da soma e: " +soma); // colocar o nome +soma (ou o nome da variavel) para obter o resultado da soma 
    System.out.println("Digite um numero:" +multiplicacao); 
    boolean igual = x1 == x2; // esse == significa o = normal, e tem que ser ==
    System.out.println("os numeros sao iguais?" +igual); // 
    boolean maior = soma > 20; //  
    System.out.println("a soma dos dois numeros e maior que 20?" +maior); // aqui da mesma forma, porem para indicar se é maior 

    }
}
