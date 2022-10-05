package FoodOrderProgram;

import java.security.PrivateKey;

public class FoodItems {
    private String coldrink;
    private String name;
    private String size;
    private final int price = 399;


    public FoodItems() {
    }

    public FoodItems(String coldrink, String name, String size) {
        this.coldrink = coldrink;
        this.name = name;
        this.size = size;
    }

    public String getColdrink() {
        return coldrink;
    }

    public void setColdrink(String coldrink) {
        this.coldrink = coldrink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }
}

