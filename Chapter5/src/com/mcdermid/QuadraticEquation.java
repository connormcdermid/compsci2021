package com.mcdermid;

/**
 * A class encoding a quadratic equation specified by the user.
 */
public class QuadraticEquation {
    /**
     * The first coefficient
     */
    private int a;
    /**
     * The second coefficient
     */
    private int b;
    /**
     * The constant
     */
    private int c;
    /**
     * The result of evaluating the discriminant
     */
    private double discriminant;

    /**
     * Constructs a new Quadratic based on the provided coefficients
     * @param a The first coefficient
     * @param b The second coefficient
     * @param c The constant
     */
    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = Math.pow(b, 2) - (4 * a * c); //not sure if inefficient to use this
    }

    /**
     * Determines whether or not the quadratic contains real roots, based on the discriminant.
     * @return true if the equation has solutions, false otherwise.
     */
    public boolean hasSolution() {
        return !(this.discriminant < 0);
    }

    /**
     * Returns the first solution to the quadratic equation.
     * @return A double containing the first solution.
     */
    public double getSolution1() {
        return (-b + Math.sqrt(discriminant))/(2 * a);
    }

    /**
     * Returns the second solution to the quadratic equation.
     * @return A double containing the second solution.
     */
    public double getSolution2() {
        return (-b - Math.sqrt(discriminant))/(2 * a);
    }

}
