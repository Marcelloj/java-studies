package exercicioStatic;

public class Conversor {
    
    public static final double IOF = 0.06;

    public static double valorReais(double quantidade, double cotacao) {
        return cotacao * quantidade;
    }

    public static double IOF(double quantidade, double cotacao) {
        return valorReais(quantidade, cotacao) * IOF;
    }

    public static double valorTotal(double quantidade, double cotacao) {
        return valorReais(quantidade, cotacao) + IOF(quantidade, cotacao);
    }
}
