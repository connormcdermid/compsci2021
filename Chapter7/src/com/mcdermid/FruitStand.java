package com.mcdermid;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Name: Connor McDermid
 * R7.1: An index is the ordinal number specifying location in an array.
 * Arrays are created with a limited possible number of indices, ArrayLists are theoretically infinite. Bounds
 * errors occur when an index that an array does not know (too large or negative) is referenced.
 * R7.2: The program tells me on what line the bounds error is, and this is usually enough.
 * R7.3: <code>
 *     ArrayList<x> accts = new ArrayList<x>();
 *     //fill arraylist
 *     System.out.println("Max value: " + Collections.max(accts));
 *     System.out.println("Min value: " + Collections.min(accts));
 * </code>
 * R7.4:
 * <code>
 *     ArrayList<String> x = new ArrayList<String>();
 *     String tmp;
 *     for (int i = 0; i < 10; i++) {
 *         tmp = Scanner.nextLine();
 *         x.add(tmp);
 *     }
 *     for (int i = 9; i > -1; i--) {
 *         System.out.println(x.get(i))
 *     }
 * </code>
 *
 * R7.8:
 * <code>
 *     int[] x = new int[10];
 *     for (int i = 0; i < 10; i++) {
 *         x[i] = Math.random() * (100 - 1) + 1
 *     }
 * </code>
 * R7.9: Index out of bounds error: for loop should say i < 10, not i <= 10
 * R7.10: Null
 * R7.11: a: for (int i = 0; i < data.length; i++) sum = sum + data[i];
 *        b: for (int i = 0; i < data.length; i++) if (data[i] == target) return true;
 *        c: int i = 0;
 *        for (int j = 0; j < data.length; j++) { data[i] = 2 * data[j]; i++; }
 * R7.12: a: for (x : data) sum += x;
 *        b: for (x : data) { if (x == data[0]) continue; sum += x; }
 *        c: for (x : data) { if (x == target) return x; }
 * R7.15: Parallel arrays use multiple arrays to represent a singular array of records. They are poor
 * practice because the arrays are linked only conceptually, not literally
 * R7.16: a: test that the arrays are equal using Arrays.equals()
 *        b: Arrays.clone()
 *        c: for (int i = 0; i < array.length; i++) array[i] = 0;
 *        d: ArrayList.clear()
 * R7.17: a: true
 *        b: true
 *        c: false
 *        d: true
 *        e: true
 *        f: false
 *        g: true
 *        h: false
 */
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
