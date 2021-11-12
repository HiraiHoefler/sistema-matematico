/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author B1-08
 */
public class Mat {
    public static void main(String[] args) {
        //Declaração de variáveis
        int op;
        
        //Criação e instância do objeto de entrada
        Scanner entrada = new Scanner(System.in);
        
        do{
            //Apresentação
            System.out.println("\n\t\t\t -- Sistema Matemático --\n");

            //Menu
            System.out.println("[1]. Fatorial");
            System.out.println("[2]. Média");
            System.out.println("[3]. Sair");

            //Opção
            System.out.print("Opção: ");
            op = entrada.nextInt();

            switch(op){
                case 1:
                    //Declaração de variáveis
                    int n;
                    double fat = 1;
                    
                    //Fatorial
                    System.out.println("\n\t\t\t Fatorial \n");
                    
                    //Entrada
                    System.out.print("Informe o núm. fatorial: "); 
                    n = entrada.nextInt();
                    
                    //Processamento
                    for(int i = n; i >= 1; i--){
                        fat *= i;
                    }
                    
                    //Saída
                    System.out.printf("%d! = %f", n, fat);                                                            
                    break;
                case 2:
                    //Declaração de variáveis
                    //int x1, x2;
                    int[] x; // = new int[4];
                    double soma = 0, media;
                    
                    //opção
                    System.out.println("informe a quantidade de números:");
                    int num = entrada.nextInt();
                    
                    //construção do vetor
                    x = new int[num];

                    //Média
                    System.out.println("\n\t\t\t Média \n");
                    
                    //Entradas
                    for(int i = 0; i <= x.length; i++){
                        System.out.print("Informe x1: ");
                        x[i] = entrada.nextInt();
                    }
                    /*
                    x[0] = entrada.nextInt();
                    System.out.print("Informe x2: ");
                    x[1] = entrada.nextInt();
                    System.out.print("Informe x3: ");
                    x[2] = entrada.nextInt();
                    System.out.print("Informe x4: ");
                    x[3] = entrada.nextInt();
                    */

                    //Processamento
                    for(int m: x)
                        soma += m;
                      //soma += x[0] + x[1] + x[2] + x[3];
                    media = soma/x.length;
                    
                    //Saída
                    System.out.printf("\n Média de "); // %d e %d e %d e %d é %.2f.\n\n\n", x[0], x[1], x[2], x[3], media);
                          for(int m: x)
                            System.out.printf(" %d",m);
                                System.out.printf("%.2.f \n\n\n ",media);
                    break;
                case 3:
                    //Sair
                    System.out.println("Abraço!!!");
                    break;
                default:
                    System.out.printf("Opção %d incorreta!", op);
            }
        }while(op != 3);                
    }
    
}
