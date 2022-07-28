/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matrizpoo;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author USER
 */
public class MatrizPoo {
    public static void main(String[] arg){
      Scanner entrada = new Scanner(System.in);  
      int matriz[][], nFilas,nCol,sumaf,sumac;
      
      nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
      nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
      
       matriz = new int [nFilas][nCol];
      
      System.out.println("Digite la matriz");
      for (int i=0;i<nFilas;i++){
          for (int j=0;j<nCol;j++){
              System.out.print("Matriz["+i+"] ["+j+"]: ");
              matriz[i][j] = entrada.nextInt();
              
          
      }
          
      }
      
      System.out.println("\nLa matriz es: ");
      for (int i=0;i<nFilas;i++){
          for (int j=0;j<nCol;j++){
              System.out.print(matriz[i][j]+" ");
        }
        System.out.println(" ");
     
}
         for(int i=0;i<nFilas;i++){
             sumaf = 0;
             for (int j=0;j<nCol;j++){
                 sumaf += matriz[i] [j];
             } 
             System.out.print("\nLa suma de la fila["+i+"] es: "+sumaf);
             
         }
         System.out.println("");
         
         for(int j=0;j<nCol;j++){
             sumac = 0;
             for(int i=0;i<nFilas;i++){
                 sumac += matriz[i] [j];
             
             }
             System.out.print("\nLa suma de la colunma["+j+"] es: "+sumac);
             
         }
         System.out.println("");
    }
}
  
    

  