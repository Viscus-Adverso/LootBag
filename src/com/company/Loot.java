package com.company;

/**
 * Created by Viscus on 9/19/16.
 */
public class Loot {
    String loot;
    int amount;
    String category;




    public Loot(String loot, int amount) {
        this.loot = loot;
        this.amount = amount;
        this.category = category;
    }


    public Loot() {
    }

    public String getLoot() {
        return loot;
    }

    public void setLoot(String loot) {
        this.loot = loot;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
