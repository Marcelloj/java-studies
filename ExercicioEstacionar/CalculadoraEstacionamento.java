package ExercicioEstacionar;

public class CalculadoraEstacionamento {
    
    public static final double VALOR_HORA = 8.00, TAXA_NOTURNA = 0.15;

    public static double calcularValorBase(int horas) {
        return horas * VALOR_HORA;
    }

    public static double calcularTaxaNoturna(int horas) {
        if (horas> 5) {
            return calcularValorBase(horas) * TAXA_NOTURNA;
        } return 0;
        
    }

    public static double calcularTotal(int horas) {
        return calcularValorBase(horas) + calcularTaxaNoturna(horas);
    }
}
