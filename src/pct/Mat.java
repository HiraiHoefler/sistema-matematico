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
                    //Média
                    System.out.println("\n\t\t\t Média \n");
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
