package com.company;

import java.util.Scanner;

public class Main {

    public void LetsPrint(){

        int age = 18;
        String name = "Vergil Li";

        System.out.printf("Hi %n");
        System.out.printf("My name is %s %n",name);
        System.out.printf("My age is %s %n", age);
        System.out.printf("My name is %s %n My age is %d", name, age);
    }

    public void PartyVote(){

        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter the name of Party 1: %n");
        String Party1 = sc.nextLine();
        System.out.printf("Enter the number of vote of %s: %n", Party1);
        int Vote1 = sc.nextInt();
        sc.nextLine();
        System.out.printf("Enter the name of Party 2: %n");
        String Party2 = sc.nextLine();
        System.out.printf("Enter the number of vote of %s: %n", Party2);
        int Vote2 = sc.nextInt();
        sc.nextLine();
        System.out.printf("Enter the name of Party 3: %n");
        String Party3 = sc.nextLine();
        System.out.printf("Enter the number of vote of %s: %n", Party3);
        int Vote3 = sc.nextInt();
        sc.nextLine();

        double Pct1 = (Vote1 * 100) / (double) (Vote1 + Vote2 + Vote3);
        double Pct2 = (Vote2 * 100) / (double) (Vote1 + Vote2 + Vote3);
        double Pct3 = (Vote3 * 100) / (double) (Vote1 + Vote2 + Vote3);

        System.out.printf("The %s party got %.2f percent of vote%n", Party1, Pct1);
        System.out.printf("The %s party got %.2f percent of vote%n", Party2, Pct2);
        System.out.printf("The %s party got %.2f percent of vote%n", Party3, Pct3);

    }

    public  void Price(){
        Scanner sc = new Scanner(System.in);

        int Final = 0;

        System.out.printf("Please choose 1 - queen, 2 - king, 3 - pullout%n");
        int Value1 = sc.nextInt();
        sc.nextLine();
        switch (Value1) {
            case 1:
                System.out.printf("You have chosen queen for £120%n");
                Final = 120;
                break;
            case 2:
                System.out.printf("You have chosen king for £139%n");
                Final = 139;
                break;
            case 3:
                System.out.printf("You have chosen pullout for £190%n");
                Final = 190;
                break;
        }
        System.out.printf("Please choose 1 - lakeside, 2 - park view%n");
        int Value2 = sc.nextInt();;
        sc.nextLine();
        switch (Value2){
            case 1:
                Final = Final + 15;
                break;
            case 2:
                Final = Final + 30;
        }
        System.out.printf("The new price is %s", Final);

    }

    public static void main(String[] args) {
	// write your code here
        //Main printer = new Main();
        //printer.LetsPrint();
        //Main Vote = new Main();
        //Vote.PartyVote();
        Main Bed = new Main();
        Bed.Price();
    }
}
