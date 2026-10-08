package ExercicioCalcularEnergia;

public class CalculadoraEnergia {

    public static final double TARIFA_KWH = 0.95, TAXA_EXTRA = 0.10;

    public static double calcularConsumo(double leituraAnterior, double leituraAtual) {
        return leituraAtual - leituraAnterior;
    }

    public static double calcularValorBase(double leituraAnterior, double leituraAtual) {
        return calcularConsumo(leituraAnterior, leituraAtual) * TARIFA_KWH;
    }

    public static double calcularTaxaExtra(double leituraAnterior, double leituraAtual) {
        if ( calcularConsumo(leituraAnterior, leituraAtual) > 200) {
        return calcularConsumo(leituraAnterior, leituraAtual) * TAXA_EXTRA;
        } return 0;
    }

    public static double calcularTotal(double leituraAnterior, double leituraAtual) {
        return calcularValorBase(leituraAnterior, leituraAtual) + calcularTaxaExtra(leituraAnterior, leituraAtual);
    }
    
}
