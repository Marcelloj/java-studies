package ExercicioPOO01;

public  class Product{


    private String name;
    private double price;
    private int quantity;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addStock(int amount){
        quantity = quantity + amount;
    }

    public void removeStock(int amount) {
        quantity = quantity - amount;
    }

    public double totalValue() {
        return price * quantity;
    }
    
    public boolean hasStock() {
        return quantity > 0;
    }
}