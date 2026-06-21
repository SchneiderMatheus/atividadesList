package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos funcionarios voce tem:?");
        int n = sc.nextInt();
        sc.nextLine();

        Funcionarios [] lista = new Funcionarios[n];
        
        
        sc.close();
    }
}
