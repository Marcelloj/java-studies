package ExercicioCalcula;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Preço do produto: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        int quanlidade = sc.nextInt();

        double total = CalculadoraCompra.calcularTotal(preco, quanlidade);

        System.out.println("total pago | Mais 8% de TAXA! : " + total);
        

        sc.close();
    }
}
