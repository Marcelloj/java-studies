package ExercicioEstacionar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de horas estacionado: ");
        int horas = sc.nextInt();

        System.out.println("Valor base: " + CalculadoraEstacionamento.calcularValorBase(horas));
        System.out.println("Taxa noturna: " + CalculadoraEstacionamento.calcularTaxaNoturna(horas));

        double total = CalculadoraEstacionamento.calcularTotal(horas);

        System.out.println("Total a pagar: " + total);

        sc.close();
    }
    
}
