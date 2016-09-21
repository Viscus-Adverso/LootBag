package com.company;

/**
 * Created by Viscus on 9/21/16.
 */
public class Treasure extends Loot {
    public Treasure(String loot, int amount, String category) {
        this.loot = loot;
        this.amount = amount;
        this.category = "treasure";
    }
}
