package ExercicioCalcularEnergia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Leitura anterior: ");
        double leituraAnterior = sc.nextDouble();

        System.out.print("Leitura atual: ");
        double leituraAtual = sc.nextDouble();

        System.out.println("Consumo: " + CalculadoraEnergia.calcularConsumo(leituraAnterior, leituraAtual) + " kwh");
        System.out.println("Valor base: " + CalculadoraEnergia.calcularValorBase(leituraAnterior, leituraAtual));
        System.out.println("Taxa extra: " + CalculadoraEnergia.calcularTaxaExtra(leituraAnterior, leituraAtual));

        double total = CalculadoraEnergia.calcularTotal(leituraAnterior, leituraAtual);

        System.out.println("Total a pagar: " + total);

        sc.close();
    }
    
}
