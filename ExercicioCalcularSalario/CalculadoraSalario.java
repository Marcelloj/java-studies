package ExercicioCalcularSalario;

public class CalculadoraSalario {

    public static final double BONUS = 0.05;

    public static double calcularSalarioBruto(double valorHora, int horas) {
        return valorHora * horas;
    }

    // Regra - Se o salario bruto for maior que 3000, recebe 5% de bônus; senão, bônus 0
     public static double  calcularBonus(double valorHora, int horas) {
        if (calcularSalarioBruto(valorHora, horas) > 3000) {
            return calcularSalarioBruto(valorHora, horas) * BONUS;
        } return 0;

     }

     public static double calcularDesconto(double valorHora, int horas) {
        return calcularSalarioBruto(valorHora, horas) * 0.08;
    }

    public static double calcularSalarioFinal(double valorHora, int horas) {
        return calcularSalarioBruto(valorHora, horas) + calcularBonus(valorHora, horas) - calcularDesconto(valorHora, horas);
    }
    
}
