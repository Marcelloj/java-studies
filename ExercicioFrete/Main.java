package ExercicioFrete;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Distancia em KM: ");
        double km = sc.nextDouble();

        System.out.print("Peso da encomenda: ");
        double peso = sc.nextDouble();
        
        System.out.println("Valor da distnância: " + CalcularFrete.calcularDistancia(km));
        System.out.println("Taxa de peso: " + CalcularFrete.calcularTaxaPeso(km, peso));

        double total = CalcularFrete.calcularFrete(km, peso);

        System.out.println("Frete total: " + total);

        sc.close();
    }
    
}
