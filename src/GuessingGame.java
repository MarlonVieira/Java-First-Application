import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int random = new Random().nextInt(100);

        for (int i = 0; i < 5; i++) {
            int guess = 0;

            if (i > 0 && i < 5) {
                System.out.printf("You have " + (5 - i) + " chances left, try to guess a number again: ");
            } else {
                System.out.printf("Enter a number to guess: ");
            }

            guess = read.nextInt();

            if (random == guess) {
                System.out.println("You got it Right! NICE! :)");
                break;
            } else if (random > guess) {
                System.out.println("The number is bigger, Nice try!");
            } else {
                System.out.println("The number is smaller, Nice try!");
            }

            if (i == 4 && random != guess) {
                System.out.println("End of attempts! the number is: "+ random +", SORRY! :(");
            }
        }
    }
}
