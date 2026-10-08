package ExercicioPedido;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Preço do produto: ");
    double preco = sc.nextDouble();

    System.out.print("Quantidade: ");
    int quantidade = sc.nextInt();

    System.out.println("Subtotal: " + CalcularPedido.CalcularSubtotal(preco, quantidade) );
    System.out.println("Desconto: " + CalcularPedido.calcularDesconto(preco, quantidade));
    System.out.println("Taxa de entrega: " + CalcularPedido.TAXA_ENTREGA);

    double total = CalcularPedido.CalcularTotal(preco, quantidade);

    System.out.println("Total a pagar: " + total);
    
    sc.close();
    
 }
}
