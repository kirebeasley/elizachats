package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner patient = new Scanner(System.in);
        System.out.println("Hi! My name is Eliza. What is your name? ");
        String name = patient.nextLine();
        System.out.println("Hi, " + name + ". It is a pleasure to meet you. How are you doing today?");
        String feelings = patient.nextLine();
        System.out.println("Well I am here to make your day just a little better. What do you wish to discuss?");
        String discussion = patient.nextLine();
        System.out.println("Things will get better. Try to take things day by day! I'm here whenever you need me. Goodbye!");
        System.out.println("Here are your responses: " + name + ". " + feelings + ". " + discussion + ". ");







    }
}
