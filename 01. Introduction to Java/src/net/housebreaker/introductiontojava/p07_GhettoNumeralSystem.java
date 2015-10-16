package net.housebreaker.introductiontojava;

import java.util.Scanner;

public class p07_GhettoNumeralSystem {
    public static void main(){
        System.out.println("\nProblem 7: Ghetto Numeral System:");

        String[] numbers = new String[] {"Gee", "Bro", "Zuz", "Ma", "Duh", "Yo", "Dis", "Hood", "Jam", "Mack"};

        System.out.print("Please enter a number: ");

        Scanner in = new Scanner(System.in);
        String number = String.valueOf(in.nextInt());
        int numberLength = number.length();

        for (int i = 0; i < numberLength; i++) {
            int ghettoNumber = (number.charAt(i) - '0');
            System.out.print(numbers[ghettoNumber]);
        }
    }
}