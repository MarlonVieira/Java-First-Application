public class Conditional {
    public static void main(String[] args) {
        int releaseYear = 2022;
        boolean included = false;
        double rating = 9.1;
        String planType = "premium";

        if (releaseYear >= 2022) {
            System.out.println("Recent release!");
        } else {
            System.out.println("Old Movie!");
        }

        if (included && planType.equals("premium")) {
            System.out.println("Can watch the movie!");
        } else {
            System.out.println("Can't Watch the movie!");
        }
    }
}