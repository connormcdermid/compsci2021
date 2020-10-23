package com.mcdermid;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitStand {

    public static void main(String[] args) {
        //scanner object
        Scanner input = new Scanner(System.in);

        ArrayList<Fruit> basket = new ArrayList<Fruit>();

        String tmpname;
        String tmpans; //buffer for user answer yes/no
        int tmpquant;
        boolean userdone = false;


        do {
            System.out.println("Fruit Name: ");
            tmpname = input.nextLine();
            System.out.println("Fruit Quantity: ");
            tmpquant = Integer.parseInt(input.nextLine());
            basket.add(new Fruit(tmpname, tmpquant));

            System.out.println("Done? [Y|n]"); //capital y to indicate default yes
            tmpans = input.nextLine();
            if (tmpans.toUpperCase().charAt(0) == 'Y') {
                userdone = true;
            } else if (tmpans.toUpperCase().charAt(0) == 'N') {
                userdone = false;
            } else {
                userdone = true;
            }
        } while(!userdone);
        System.out.println("You have purchased: ");
        for (Fruit item : basket) {
            System.out.println(item);
        }
    }
}
