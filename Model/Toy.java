package Model;

import java.io.Serializable;

public class Toy implements Serializable {
    private int id;
    private String name;
    private int amount;
    private double chance;

    public Toy(int id, String name, int amount, double chance) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.chance = chance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (amount >= 0 && amount <= 100) {
            this.amount = amount;
        }
    }

    public double getChance() {
        return chance;
    }

    public void setChance(double chance) {
        if (chance >= 0) {
            this.chance = chance;
        }
    }

    @Override
    public String toString() {
        return "Toy { " + "id = " + id +
                ", name = '" + name + "\'" +
                ", amount = " + amount +
                " }";
    }

    public String toStringOffAmount() {
        return "Toy { " + "id = " + id +
                ", name = '" + name + "\'" +
                " }";
    }
}
