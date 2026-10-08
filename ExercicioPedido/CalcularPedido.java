package ExercicioPedido;

public class CalcularPedido {

    public static  final double TAXA_ENTREGA = 10.00;

    public static double CalcularSubtotal(double preco, int quantidade) {
        return preco * quantidade;
    }

    public static double calcularDesconto(double preco, int quantidade) {
        if (CalcularSubtotal(preco, quantidade) > 200) {
            return CalcularSubtotal(preco, quantidade) * 0.10;
        }
        return 0;
    }

    public  static double CalcularTotal(double preco, int quantidade) {
       return CalcularSubtotal(preco, quantidade) - calcularDesconto(preco, quantidade) + TAXA_ENTREGA;
    }
}