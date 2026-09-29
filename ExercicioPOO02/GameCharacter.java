package ExercicioPOO02;


public class GameCharacter {

    private String name;
    private int health;
    private int level = 1;

    public String getName() {
        return name;
    }

    public  int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int amount) {
        health = health - amount;
    }

    public void heal(int amount) {
        health = health + amount;
    }

    public int levelUp() {
        return level + 1;
    }

    public boolean isAlive() {
        return health > 0;
    }
    
}
