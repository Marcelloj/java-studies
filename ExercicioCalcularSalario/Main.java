package ExercicioCalcularSalario;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da hora: ");
        int horas = sc.nextInt();

        System.out.print("Quantidade de horas trabalhadas: ");
        double valorHora = sc.nextDouble();

        System.out.println("Salário bruto: " + CalculadoraSalario.calcularSalarioBruto(valorHora, horas));
        System.out.println("Bônus: " + CalculadoraSalario.calcularBonus(valorHora, horas));
        System.out.println("Desconto: " + CalculadoraSalario.calcularDesconto(valorHora, horas));

        double total = CalculadoraSalario.calcularSalarioFinal(valorHora, horas);
        System.out.println("Salario final: " + total);


        sc.close();
    }
}
