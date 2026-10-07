package ExercicioFixa;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CurrencyConverter cota = new CurrencyConverter();

        System.out.print("Qual valor do Dolar: ");
        cota.cotacao = sc.nextDouble();

        System.out.print("Qual valor em Dolar: ");
        cota.quantidade = sc.nextDouble();

        System.out.println("Total pago em reais mais 6% de IOF: " + cota.totalPago());
        


        sc.close();
    }
}