package com.mcdermid;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 This class prints a report on the contents of a file.
 Name: Connor McDermid
 Lab: Chapter 11 I/O
 */
public class FileAnalyzer
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Filename: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        FileCounter counter = new FileCounter();
        FileReader reader = new FileReader(name);
        Scanner fileIn = new Scanner(reader);
        counter.read(fileIn);
        fileIn.close();
        System.out.println("Characters: " + counter.getCharacterCount());
        System.out.println("Words: " + counter.getWordCount());
        System.out.println("Lines: " + counter.getLineCount());
        /*
        So, the testP11_1.in file contains 1 word, 1 line, 9 characters, saying "test1.out"
        The file testP11_1.out file says that our program
        should evaluate to 43 characters and several words and lines.
        Given the contents of the testP11_1.in file, this is not the case.
         */
        //P11.2
        FileCounter counter2 = new FileCounter();
        name = in.nextLine();
        boolean more = true;
        while (more) {
            FileReader reader2 = new FileReader(name); //compiler will optimise away instantiations
            Scanner fileIn2 = new Scanner(reader2);
            counter2.read(fileIn2);
            name = in.nextLine();
            if (name.equals("")) {
                more = false;
            }
        }
        System.out.println("Characters: " + counter2.getCharacterCount());
        System.out.println("Words: " + counter2.getWordCount());
        System.out.println("Lines: " + counter2.getLineCount());
    }
}