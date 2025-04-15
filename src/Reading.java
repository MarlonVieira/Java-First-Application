import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.printf("Insert your favorite movie: ");
        String Movie = read.nextLine();
        System.out.printf("Insert the release date: ");
        int releaseDate = read.nextInt();
        System.out.printf("Insert your rating from to the movie: ");
        double rating = read.nextDouble();

        System.out.println("Your favorite movie is: " + Movie);
        System.out.println("Release date: " + releaseDate);
        System.out.println("Rating: " + rating);
    }
}