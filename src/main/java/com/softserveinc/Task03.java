package com.softserveinc;



import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        System.out.print(">>> ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        System.out.print(">>> ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        System.out.print(">>> ");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        System.out.print(">>> ");
        int needCups = scanner.nextInt();

        int possibleWaterCup = water / 200;
        int possibleMilkCup = milk / 50;
        int possibleBeansCup = beans / 15;
        int possibleCups = possibleWaterCup;
        if (possibleMilkCup < possibleCups) {
            possibleCups = possibleMilkCup;
        }
        if (possibleBeansCup < possibleCups) {
            possibleCups = possibleBeansCup;
        }
        if (possibleCups < needCups) {
            System.out.println("No, I can make only " + possibleCups + " cup(s) of coffee");
        } else if (possibleCups > needCups) {
            int extraCups=possibleCups-needCups;
            System.out.println("Yes, I can make that amount of coffee (and even " + extraCups + " more than that)");
        } else  {
            System.out.println("Yes, I can make that amount of coffee");
        }
    }
}
