package org.newfische.example;

public class Medication {
    private String name;
    private double price;
    private boolean avaibility;

    public Medication(String name, double price, boolean avaibility) {
        this.name = name;
        this.price = price;
        this.avaibility = avaibility;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean getAvaibility() {
        return avaibility;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", avaibility='" + avaibility + '\'' ;
    }
}
