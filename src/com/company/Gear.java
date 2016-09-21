package com.company;

/**
 * Created by Viscus on 9/21/16.
 */
public class Gear extends Loot {
    public Gear(String loot, int amount, String category) {
        this.loot = loot;
        this.amount = amount;
        this.category = "gear";
    }
}
