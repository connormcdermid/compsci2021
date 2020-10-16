package com.mcdermid;

/**
 * Encodes a standard playing card.
 */
public class Card {
    private final int value;
    private final Suit suit;

    /**
     * Constructs a new Card out of a given face value and suit.
     * @param value An integer containing the value of the card -- ace is low.
     * @param suit A {@link Suit} specifying the card's suit.
     */
    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    /**
     * A static method constructing a Card from user input. Expected in the format <code><value><suit></code>
     * @param usr A {@link String} containing the raw user input
     * @return A {@link Card} encoding the card specified by the user.
     */
    public static Card parseCard(String usr) {
        Suit cardsuit = null; //initialise to null to prevent it from yelling at me later
        switch (usr.charAt(usr.length() - 1)) {
            case 'H' -> cardsuit = Suit.HEARTS;
            case 'D' -> cardsuit = Suit.DIAMONDS;
            case 'C' -> cardsuit = Suit.CLUBS;
            case 'S' -> cardsuit = Suit.SPADES;
            default -> {
                System.out.println("Error: invalid suit.");
                System.exit(-2);
            }
        }
        int cardvalue = 0;
        // jack, queen, and king are all value 10
        switch (usr.charAt(0)) {
            case 'A' -> cardvalue = 1;
            case '2', '3', '4', '5', '6', '7', '8', '9' -> cardvalue = Character.getNumericValue(usr.charAt(0));
            case '1' -> cardvalue = 10;
            case 'J' -> cardvalue = 11;
            case 'Q' -> cardvalue = 12;
            case 'K' -> cardvalue = 13;
            default -> System.out.println("Error: invalid card value." + usr.charAt(0));
        }
        return new Card(cardvalue, cardsuit);
    }

    /**
     * Returns a human-readable description of this Card's value and {@link Suit}.
     * @return A {@link String} containing a human-readable description of the card.
     */
    public String getCardDescription() {
        if (value > 10) {
            return switch (value) {
                case 11 -> "Jack of " + suit;
                case 12 -> "Queen of " + suit;
                case 13 -> "King of " + suit;
                default -> "Unknown";
            };
        } else if (value == 1) {
            return "Ace of " + suit;
        } else {
            return value + " of " + suit;
        }
    }
}
