package application;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite valor para linhas : ");
        int linhas = sc.nextInt();
        System.out.println("Digite valor para colunas : ");
        int colunas = sc.nextInt();

        int [][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for(int j =0; j<colunas; i++){
                System.out.println("Digite numeros para: "+i +":"+j);
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Escolha um dos valores na matriz: ");
        int x = sc.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for(int j =0; j<matriz[i].length; i++){
                if (x == matriz[i][j]) {
                    System.out.println("Posição:"+matriz[i]+matriz[j]);
                    System.out.println("Esquerda::"+matriz[i][j-1]);
                    System.out.println("Direita:"+matriz[i][j+1]);
                    System.out.println("Cima:"+matriz[i-1][j]);
                    System.out.println("baixo:"+matriz[i+1][j]);
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}
