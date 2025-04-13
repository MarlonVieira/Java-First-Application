import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double rating = 0;
        double averageRating = 0;
        int countRating = 0;

        while (rating != -1) {
            System.out.printf("Insert your rating from to the movie or -1 to end: ");
            rating = read.nextDouble();
            if (rating > 0) {
                averageRating += rating;
            }
            countRating++;
        }
        System.out.println("The average rating is: "+ averageRating/countRating);
    }
}