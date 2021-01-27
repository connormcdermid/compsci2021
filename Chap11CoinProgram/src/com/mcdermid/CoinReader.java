package com.mcdermid;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Name: Connor McDermid
 * Lab: Chapter 11 Coin Program
 * Extra: Redoing some of AP's code because they are terrible and their only possible intended
 * implementation was awful.
 */
public class CoinReader {
    public static void main(String[] args) {
        boolean done = false;
        Scanner in = new Scanner(System.in);
        ArrayList<Coin> list = null;
        while (!done) {
            System.out.print("Filename: ");
            String filename = in.next();
            try {
                list = Coin.readFile(filename);
                done = true;
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Improperly formatted or nonexistent file. Please try again.");
            }
        }
        double total = 0;
        for (Coin c : list)
            total = total + c.getValue();
        System.out.println("Total=" + total);
    }
}