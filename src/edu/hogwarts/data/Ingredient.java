package edu.hogwarts.data;

public class Ingredient extends TeachingMaterial {
    private int quantity;

    public Ingredient(String name, int quantity) {
        super(name);
        this.quantity = quantity;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
