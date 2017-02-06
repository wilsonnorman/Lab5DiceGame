package bootcamp;

import java.util.Scanner;


public class Lab5 {

    public static void main(String[] args) {
        System.out.println("Welcome to Big Norm's Casino");
        // Ask user for sides of dice
        String userInput = ("y");
        // get user input
        Scanner scan = new Scanner(System.in);
        while (userInput.equals("y")) {
            System.out.println("How many sides would you like on your dice and place your bet");


            int sides = scan.nextInt();


            //ask user to roll dice
            System.out.println("Press any number to roll");
            // get user input
            scan.nextInt();
            // roll dices
            int result1 = diceRoll(sides);// calling a method
            int result2 = diceRoll(sides);


            //show results
            System.out.println("Result1 = " + result1);
            System.out.println("Result2 = " + result2);
            System.out.println("Total = " + (result1 + result2));
            //Ask if user would like to continue




            System.out.println("Would you like to continue? (y/n)");

            userInput = scan.next();

        }



    }

        public static int diceRoll(int sides) {



            int n = (int) ((Math.random() * sides + 1));
            return n;



    }





}
