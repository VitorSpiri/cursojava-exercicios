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
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] a = new int[3];;
        int[] b = new int[a.length];
        double[] c = new double[a.length];
        
        for (int i = 0; i < a.length; i++) {
            
          System.out.print("Digite um valor para posição " + i +" : ");  
          a[i] = scan.nextInt();
  
        }
        
         for (int i = 0; i < b.length; i++) {
            
          System.out.print("Digite um valor para posição " + i +" : ");  
          b[i] = scan.nextInt();
  
        }
         
         for (int i = 0; i < c.length; i++) {
         
             c[i] = a[i]/b[i];
        }
         
        System.out.println();
         
        System.out.print("Vetor A = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println();
        
        System.out.print("Vetor B = ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        
        System.out.println();
        
        System.out.print("Vetor C = ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }        
        
        
        
    }
}
