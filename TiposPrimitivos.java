/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tiposprimitivos;

/**
 *
 * @author teus
 */
import java.util.Scanner;
public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        System.out.println("digite  o nome do aluno");
        String nome = tecla.nextLine();
        System.out.println("digite a nota do aluno");
        float nota = tecla.nextFloat();
        System.out.println("A nota é " + nota);
        System.out.format("a nota de %s é %.4f\n", nome, nota);

    }
}
