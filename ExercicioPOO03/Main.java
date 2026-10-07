package ExercicioPOO03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Título: ");
        String title = sc.nextLine();

        System.out.print("Autor: ");
        String author = sc.nextLine();

        System.out.print("Preço: ");
        double price = sc.nextDouble();

        System.out.print("Número de páginas: ");
        int pages = sc.nextInt();

        Book book = new Book(title, author, price, pages);

        System.out.print("Desconto (%): ");
        double percentage = sc.nextDouble();

        book.applyDiscount(percentage);

        System.out.println("Livro: " + book.getTitle());
        System.out.println("Autor: " + book.getAuthor());
        System.out.println("Preço final: " + book.getPrice());
        System.out.println("Páginas: " + book.getPages());
        System.out.println("Livro longo? " + book.isLongBook());

        sc.close();
    }
}