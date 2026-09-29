package ExercicioPOO01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product pro = new Product();

        System.out.print("Nome do Products: ");
        String name = sc.nextLine();
        pro.setName(name);

        System.out.print("Preço: ");
        double price = sc.nextDouble();
        pro.setPrice(price);

        System.out.print("Quantidade inicial: ");
        int quantity = sc.nextInt();
        pro.addStock(quantity);

        System.out.print("Quantidade para adicionar: ");
        int amount = sc.nextInt();
        pro.addStock(amount);

        System.out.print("Quantidade para remover: ");
        amount = sc.nextInt();
        pro.removeStock(amount);


        System.out.println("Produto: " + pro.getName());
        System.out.println("Preço: " + pro.getPrice());
        System.out.println("Quantidade: " + pro.getQuantity());
        System.out.println("Valor total: " + pro.totalValue());
        System.out.println("Possui estoque: " + pro.hasStock());


        sc.close();


    }
    
}
