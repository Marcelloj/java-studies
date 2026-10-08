package ExercicioFrete;

public class CalcularFrete {
    
    public static final double VALOR_KM = 1.20, TAXA_PESO = 0.05;

    public static double calcularDistancia(double km) {
        return km * VALOR_KM;
    }
     
    // Regra - se o peso for maior que 20 kg, cobrar 5% sobre o valor da distância; senão, taxa 0
    public static double calcularTaxaPeso(double km, double peso) {
        if (peso > 20) {
            return calcularDistancia(km) * TAXA_PESO;
        } return 0;
    }

    public static double calcularFrete(double km, double peso) {
        return calcularDistancia(km) + calcularTaxaPeso(km, peso);
    }
}
