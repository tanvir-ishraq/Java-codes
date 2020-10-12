
package guessinggame;

/**
 * @author Ishraq
 */

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int theNUMBER;
    int max;
    Scanner scan = new Scanner(System.in);
    
    public GuessTheNumber() {   //default constructor
        Random rand = new Random();
        max = 100;
        theNUMBER = Math.abs(rand.nextInt()) % (max+1);
    }
    
    public void play() {
        while(true) {
            int move = scan.nextInt();
            if (move > theNUMBER) {
                System.out.println("your number is too big");
            } else if (move < theNUMBER) {
                System.out.println("your number is too small");
            } else {
                System.out.println("YOU GUESSED CORRECT!");
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        GuessTheNumber guessingGame = new GuessTheNumber();
        System.out.println("Welcome to guessing game! "
                    + "Here you have to guess our number between 0 and " + guessingGame.max
                    + ". If you guess correctly you win!");
        guessingGame.play();
    }
    
}
