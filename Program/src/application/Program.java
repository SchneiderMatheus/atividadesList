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
        
        for(int i=0; i<lista.length; i++){
            System.out.println("Coloque ID");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Coloque nome");
            String name = sc.nextLine();
            System.out.println("Coloque salário");
            double salario = sc.nextDouble();
            sc.nextLine();
            Funcionarios  funf = new Funcionarios(id, name, salario);
        }

        
        sc.close();
    }
}
