package com.mcdermid;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A coin with a monetary value.
 */
public class Coin {
    private final double value;
    private final String name;

    /**
     * Constructs a default coin. Use the read method to fill in the value and
     * name.
     *
     * Note: You can't do that! The values are final! AP doesn't know how to write Java!
     *  - C McDermid
     */
    public Coin() {
        value = 0;
        name = "";
    }

    /**
     * Constructs a coin.
     *
     * @param aValue the monetary value of the coin
     * @param aName  the name of the coin
     */
    public Coin(double aValue, String aName) {
        value = aValue;
        name = aName;
    }

    /**
     * Reads a file with coin values.
     *
     * @param filename the file name
     * @return an array of coins in the file
     */
    public static ArrayList<Coin> readFile(String filename) throws IOException {
        ArrayList<Coin> finalList = new ArrayList<>();
        Scanner in = new Scanner(new FileReader(filename));
        while(in.hasNextLine()) {
            try {
                finalList.add(Coin.read(in));
            } catch (IOException e) {
                System.out.println("The file is not properly formatted.");
                throw e;
            }
        }
        return finalList;
    }

    /**
     * Gets the coin value.
     *
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * Gets the coin name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Reads a coin value and name.
     *
     * @param in the Scanner
     * @return the Coin constructed from the file
     */
    private static Coin read(Scanner in) throws IOException { //should not return void. What? Who designed this?
        String buf = in.nextLine();
        if (!buf.matches("^\\S+\\s\\S+$")) {
            throw new IOException();
        }
        String name;
        String valbuf;
        double val;
        name = buf.substring(0, buf.indexOf(" "));
        valbuf = buf.substring(buf.indexOf(" ") + 1, buf.length() - 1);
        val = Double.parseDouble(valbuf);
        return new Coin(val, name);
    }
}