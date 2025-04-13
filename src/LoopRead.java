import java.util.Scanner;

public class LoopRead {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double rating = 0;
        double averageRating = 0;

        for (int i = 0; i < 3; i++) {
            System.out.printf("Insert your rating from to the movie: ");
            rating = read.nextDouble();
            averageRating += rating;
        }
        System.out.println("The average rating is: "+ averageRating/3);
    }
}