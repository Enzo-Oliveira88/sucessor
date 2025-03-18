package com.mycompany.baroes_pisadinha;

import java.util.Scanner;

public class Baroes_pisadinha {
public static void main(String[] args) {
    Scanner tc = new Scanner (System.in);
    int janeiro = 15000, fevereiro = 23000, mar = 17000;
    int soma = janeiro + fevereiro + mar;
    int media = soma / 3;
        System.out.println("Os gastos totais foram: $" + soma);
        System.out.println("A média geral foi: $" + media);
        
    }
}
