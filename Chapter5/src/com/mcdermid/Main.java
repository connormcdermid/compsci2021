package com.mcdermid;

/**
 * Name: Connor McDermid
 * Lab: Chapter 5
 * Requirements: Exercise P5.1.
 * Write a program that prints all real solutions to the quadratic equation ax2 + bx + c = 0.
 * Read in a, b, c and use the quadratic formula.
 * If the discriminant b2 - 4ac is negative, display a message stating that there are no real solutions.
 * Implement a class QuadraticEquation whose constructor receives the coefficients a, b, c of the quadratic equation.
 * Supply methods getSolution1 and getSolution2 that get the solutions,
 * using the quadratic formula, or 0 if no solution exists.
 * The getSolution1 method should return the smaller of the two solutions.
 * Supply a method boolean hasSolutions()
 * that returns false if the discriminant is negative.
 * Exercise P5.2. Write a program that takes user input describing a playing card in the following shorthand notation
 * A - Ace
 * 2-10 - values
 * J - jack
 * Q - queen
 * K - King
 * D - diamonds
 * H - hearts
 * S - spades
 * C - clubs
 *
 * Your program should print the full description of the card.
 * For example,
 * Enter the card notation:
 * 4S
 * Four of spades
 * Implement a class Card whose constructor takes the card notation string and whose getDescription method returns
 * a description of the card.
 * If the notation string is not in the correct format, the getDescriptionmethod should return the string ”Unknown”.
 */

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //read in all numbers from user
        int vala = input.nextInt();
        int valb = input.nextInt();
        int valc = input.nextInt();
        //pass to object
        QuadraticEquation equation = new QuadraticEquation(vala, valb, valc);
        if (!equation.hasSolution()) {
            System.out.println("This equation does not have any real roots.");
        } else {
            System.out.println("This equation's roots are "
                    + equation.getSolution1()
                    + " and "
                    + equation.getSolution2());
        }

        //PART 2

        System.out.println("Please, enter a card.");
        String cleanser = input.nextLine();
        String crd = input.nextLine();
        Card card = Card.parseCard(crd);
        System.out.println(card.getCardDescription());
    }
}
