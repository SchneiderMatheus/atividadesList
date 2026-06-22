package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantos funcionarios voce tem?");
        int n = sc.nextInt();
        sc.nextLine();

        Funcionarios [] lista = new Funcionarios[n];
        
        for(int i=0; i<lista.length; i++){
            System.out.println("Coloque ID Funcionario #"+(i+1));
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Coloque nome Funcionario #"+(i+1));
            String name = sc.nextLine();
            System.out.println("Coloque salário do Funcionario #"+(i+1));
            double salario = sc.nextDouble();
            sc.nextLine();
            lista[i] = new Funcionarios(id, name, salario);
        }
        
        System.out.println("Id do funcionario que receberá o aumento: ");
        int id = sc.nextInt();
        Funcionarios func = null;
        for(int i=0; i < lista.length; i++){
            if (lista[i].getId() == id) {
                func = lista[i];
                break;
            } 
        }
        if (func != null) {
            System.out.println("Digite a porcentagem de aumento: ");
                double porcentagem = sc.nextDouble();
                func.increaseSalary(porcentagem);
                System.out.println("Aplicado o aumento salarial com sucesso!");
        } else
            System.out.println("ID não encontrado!");

    System.out.println("\nLista de Funcionarios: ");

        for(int i=0; i < lista.length; i++){
            System.out.println(lista[i]);
        }
        sc.close();
    }
}
