package ExercicioPOO02;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        GameCharacter game = new GameCharacter();

        System.out.print("Nome do personagem: ");
        String name = sc.nextLine();
        game.setName(name);

        System.out.print("Vida inicial: ");
        int health = sc.nextInt();
        game.setHealth(health);

        System.out.print("Dano recebido: ");
        int amount = sc.nextInt();
        game.takeDamage(amount);

        System.out.print("Quantidade de cura: ");
        amount = sc.nextInt();
        game.heal(amount);

        game.levelUp();

        System.out.println("personagem: " +  game.getName());
        System.out.println("Vida atual: " + game.getHealth());
        System.out.println("Nivel: " + game.getLevel());
        System.out.println("Está vivo? " + game.isAlive());

        sc.close();
    }
    
}
