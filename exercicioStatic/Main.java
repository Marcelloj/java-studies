package exercicioStatic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual cotação do dollar: ");
        double cotacao = sc.nextDouble();

        System.out.print("Qual a quantidade de dollar: ");
        double quantidade = sc.nextDouble();

        double total = Conversor.valorTotal(quantidade, cotacao);

        System.out.println("Total pago em reais mais 6% do IOF: " + total);
        sc.close();
    }
    
}
