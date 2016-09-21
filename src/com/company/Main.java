package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, ArrayList<Loot>> users = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter your name adventurer.");
            String name = scanner.nextLine();

            ArrayList<Loot> loots = users.get(name);
            if (loots == null) {
                loots = new ArrayList<>();
                users.put(name, loots);
            }


            boolean isLoggedIn = true;
            while (isLoggedIn) {
                System.out.println("Press 1 to add items.");
                System.out.println("Press 2 to remove items.");
                System.out.println("Press 3 to change quantity.");
                System.out.println("press 4 to check items.");
                System.out.println("press 5 to log out.");

                String option = (scanner.nextLine());

                switch (option) {
                    case "1":
                        System.out.println("Enter your item.");
                        String loot = scanner.nextLine();
                        Loot loota = new Loot(loot, 1);
                        loots.add(loota);
                        break;
                    case "2":
                        System.out.println("Remove your item.");
                        int i = Integer.valueOf(scanner.nextLine());
                        loots.remove(i - 1);
                        break;
                    case "3":
                        System.out.println("Which item would you like to change");
                        int p = Integer.valueOf(scanner.nextLine());
                        Loot loot2 = loots.get(p - 1);
                        System.out.println("How much would you like the new amount to be?");
                        int o = Integer.valueOf(scanner.nextLine());
                        loot2.amount = o;
                        break;
                    case "4":
                        for (int k = 0; k < loots.size(); k++) {
                            Loot loot3 = loots.get(k);
                            int num = k + 1;
                            System.out.printf("%s %s %s\n", num, loot3.amount, loot3.loot);
                        }
                        break;
                    case "5":
                        isLoggedIn = false;
                        break;
                    default:
                        System.out.printf("wrong choice.");


                }


            }
        }
    }
}

