package com.mcdermid;

import java.util.Scanner;
/**
 * A class to count the number of characters, words, and lines in files.
 */
public class FileCounter {

    int charCount;
    int lineCount;
    int wordCount;
    /**
     * Construct a FileCounter object.
     */
    public FileCounter() {
        this.charCount = 0;
        this.lineCount = 0;
        this.wordCount = 0;
    }

    /**
     * Processes an input source and adds its character, word, and line
     * counts to this counter.
     *
     * @param in the scanner to process
     */
    public void read(Scanner in) {
        String tmp = "";
        while (in.hasNextLine()) {
            tmp = in.nextLine();
            for (char x : tmp.toCharArray()) {
                if (x == ' ') {
                    wordCount++;
                }
                charCount++;
            }
            lineCount++;
        }
    }

    /**
     * Gets the number of words in this counter.
     *
     * @return the number of words
     */
    public int getWordCount() {
        if (charCount != 0 && wordCount == 0) {
            wordCount = lineCount; //there will be at least as many words as lines
        }
        return wordCount;
    }

    /**
     * Gets the number of lines in this counter.
     *
     * @return the number of lines
     */
    public int getLineCount() {
        return lineCount;
    }

    /**
     * Gets the number of characters in this counter.
     *
     * @return the number of characters
     */
    public int getCharacterCount() {
        return charCount;
    }


}