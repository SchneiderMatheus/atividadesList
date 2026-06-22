package application;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Digite dois valores (linhas e colunas): ");
        int linhas = sc.nextInt();
        int colunas = sc.nextInt();

        int [][] matriz = new int[linhas][colunas];

        for (int i = 0; i < matriz.length; i++) {
            for(int j =0; j<matriz[i].length; i++){
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Escolha um dos valores na matriz: ");
        int x = sc.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for(int j =0; j<matriz[i].length; i++){
                if (x == matriz[i][j]) {
                    System.out.println("Position:"+matriz[i]+matriz[j]);
                }
            }
        }
    }
}
