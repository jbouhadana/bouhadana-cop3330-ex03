/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = in.nextLine();

        System.out.print("Who said it? ");
        String name = in.nextLine();

        System.out.println( name + " says, " + "\"" + quote +"\"");
    }
}
