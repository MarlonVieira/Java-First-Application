import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double number = 0;
        double number1 = 0;
        double number2 = 0;
        double numberMulti = 0;
        double numberOddEven = 0;
        int numberFactorial = 0;
        int resultFactorial = 1;

        System.out.printf("Enter a number: ");
        number = read.nextDouble();

        if (number > 0) {
            System.out.println("Positive Number!");
        } else if (number < 0) {
            System.out.println("Negative Number!");
        } else {
            System.out.println("Neutral Number!");
        }

        System.out.printf("Enter two numbers, first number: ");
        number1 = read.nextDouble();
        System.out.printf("Second number: ");
        number2 = read.nextDouble();

        if (number1 == number2) {
            System.out.println("Equal numbers!");
        } else if (number1 > number2) {
            System.out.println("Number "+ number1 +" greater than number "+ number2);
        } else {
            System.out.println("Number "+ number2 +" greater than number "+ number1);
        }

        System.out.printf("Enter a number to get its multiplication table: ");
        numberMulti = read.nextDouble();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " * " + numberMulti + " = " + numberMulti * i);
        }


        System.out.printf("Enter a number to get whether it is odd or even: ");
        numberOddEven = read.nextDouble();

        if (numberOddEven % 2 == 0){
            System.out.println("It's even!");
        } else {
            System.out.println("It's odd!");
        }

        System.out.printf("Enter a number to calculate the factorial: ");
        numberFactorial = read.nextInt();

        for (int i = 1; i <= numberFactorial; i++) {
            resultFactorial *= i;
        }

        System.out.println("The factorial of " + numberFactorial + " is: " + resultFactorial);
    }
}
