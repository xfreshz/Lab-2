/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coins;

import java.util.Scanner;

/**
 * This program calculates change
 *
 * @author Danish Khan and Dheyazen Alseelwe
 * @version 3/2/2015
 */
public class Coins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the amount in change: ");
        int pennies = in.nextInt();
        //This is the change you enter
        
        int quarters = pennies / 25;
        pennies = pennies % 25;
        //This gives you the amount in quarters

        int dimes = pennies / 10;
        pennies = pennies % 10;
        //This gives you the amount in dimes

        int nickels = pennies / 5;
        pennies = pennies % 5;
        //This gives the amount in nickles along with whatever is left over becomes pennies
        System.out.println("The change due is ");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
        System.out.println("Total number of coins = " + (quarters + dimes + nickels + pennies));

    }

}
