package ExercicioFixa;

public class CurrencyConverter {

    public double quantidade;
    public double cotacao;

    public double valorReais() {
        return cotacao * quantidade;
    }

    public double iof() {
        return valorReais() * 0.06;
    }

    public double totalPago() {
        return valorReais() + iof();
    }
}