package com.softserveinc;

import java.util.Arrays;
import java.util.Scanner;

/*
    Task: Write a program that calculates the amount of ingredients needed to make a certain amount of coffee.

    The program should calculate how much water, coffee, and milk are necessary to make the specified amount of coffee.
    One cup of coffee made on this coffee machine contains 200 ml of water, 50 ml of milk, and 15 g of coffee beans.
    The user should input the amount of coffee he needs, in cups, for all the guests.

    The example below shows how your output might look.
    The symbol >>> represents the user input. Notice that it's not the part of the input.

    Example 1

    Write how many cups of coffee you will need:
    >>> 25
    For 25 cups of coffee you will need:
    5000 ml of water
    1250 ml of milk
    375 g of coffee beans

    #### Example 2

    Write how many cups of coffee you will need:
    >>> 125
    For 125 cups of coffee you will need:
    25000 ml of water
    6250 ml of milk
    1875 g of coffee beans
 */
public class Task02 {
    public static void main(String[] args) {
        int[] ingredients={200,50,15};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        System.out.print(">>> ");
        int cups = scanner.nextInt();
        String need= "For " + cups + " cups of coffee you will need:";
        String water=cups*ingredients[0] + " ml of water";
        String milk=cups*ingredients[1] + " ml of milk";
        String beans=cups*ingredients[2] +" g of coffee beans";
        String total=String.join("\n", need, water,milk,beans);
        System.out.println(total.toString());
    }
}
