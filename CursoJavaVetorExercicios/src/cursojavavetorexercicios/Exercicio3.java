/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavavetorexercicios;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] a = new int[8];
        int[] b = new int[a.length];
        
        for (int i = 0; i < a.length; i++) {
            
          System.out.print("Digite o valor da posição " + i + " : ");
          a[i] = scan.nextInt();
           
          b[i] = a[i]*a[i];
        }
        
        System.out.print("Valores do Vetor A: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
        
        System.out.print("Valores do Vetor B: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
   
}
