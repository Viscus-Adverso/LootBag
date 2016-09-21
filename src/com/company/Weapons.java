package com.company;

/**
 * Created by Viscus on 9/21/16.
 */
public class Weapons extends Loot {
    public Weapons(String loot, int amount, String category) {
        this.loot = loot;
        this.amount = amount;
        this.category = "weapon";
    }
}
