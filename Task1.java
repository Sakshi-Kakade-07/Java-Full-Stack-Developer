/*Create a simple number guessing game where the user has to guess 
a randomly generated number
  within a certain range. The program will provide feedback to the user
 whether their guess is too high, too low or correct. The user will have 
  a limited no. of attempt to guess the correct no.
*/

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 50;
        int attempt = 4;
        int targetNumber = random.nextInt(maxRange - minRange + 1 ) + minRange;
        

        System.out.println("Welcome to the number Guessing Game!!");
        System.out.println("I have selected no. in between"+minRange+"to"+maxRange+".");
        System.out.println("You have "+attempt+"attempts to guess it");

        while(attempt > 0){
            System.out.println("Enter your guess: ");
            int guess = sc.nextInt();

            if(guess == targetNumber){
                System.out.println("Congrats! you have guessed correct no."+targetNumber);
                break;
            }else if(guess < targetNumber){
                System.out.println("Too low");
            }else{
                System.out.println("Too high");
            }
            attempt--;
            if(attempt>0){
                System.out.println("You have "+attempt+"attempt left.");
            }
        }
        if(attempt == 0){
            System.out.println("You have crossed limit of attempts. The correct no. was "+targetNumber);
        }
        
    }
}
