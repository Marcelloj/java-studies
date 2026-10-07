package ExercicioCalcula;

public class CalculadoraCompra {

    public static final double taxaServico = 0.08;

    public static double calcularSubTotal(double preco, int quantidade) {
        return preco * quantidade;
    }

    public static double calcularTaxa(double preco, int quantidade) {
        return calcularSubTotal(preco, quantidade) * CalculadoraCompra.taxaServico;
    }

    public static double calcularTotal(double preco, int quantidade) {
        return calcularSubTotal(preco, quantidade) + calcularTaxa(preco, quantidade);
    }

    
}
