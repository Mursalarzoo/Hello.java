package com.main;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        //declaring the variable String and call it "name"
        String name;
        //declaring the Scanner variable in and create a Scanner that reads input from System.in
        Scanner in = new Scanner(System.in);
        //printing the output
        System.out.print("What is your name?");
        // The Scanner class provides the methods nextLine, that reads a line of input from the keyboard and returns a String.
        name = in.nextLine();
        //printing the put with the name which we got as input.
        System.out.printf("Nice to meet you," + name + "!");
    }

}



