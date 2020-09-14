package com.mcdermid;

import java.util.Scanner;

/**
 * Name: Connor
 * Lab: P2.9 & P2.10
 * Extra: extra replacement
 * Date: 2020-09-14
 *
 * Questions:
 * A object is an instantiation of a class, an object reference is referencing the class directly
 * An object is an instantiation of a class, an object variable is a variable containing an object
 * An object is an instantiation of a class, a class is a blueprint for an object
 * = in java is assignment, where in math it is the equality operator. (Java's ==)
 * As long as every variable is instantiated before it's used, it doesn't really matter, but
 * instantiating with 0 guarantees no undefined behaviour.
 */
public class ReplaceTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        //need backslashes: "$" is a metacharacter with regex, must be escaped
        System.out.println(str.replaceAll("i", "!").replaceAll("s", "\\$")
                            .replaceAll("p", "\\&"));


        String hello = "Hello World";
        String holder = hello.replaceAll("e", "\\^");
        String holder2 = holder.replaceAll("o", "e");
        String fin = holder2.replaceAll("\\^", "o");
        System.out.println(fin);

    }
}
