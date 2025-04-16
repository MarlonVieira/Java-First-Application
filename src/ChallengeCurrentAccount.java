import java.util.Scanner;

public class ChallengeCurrentAccount {
    public static void main(String[] args) {
        String name = "Marlon Gabriel Gonçalves Vieira";
        String typeAccount = "Current";
        double initialValue = 2500;
        Scanner read = new Scanner(System.in);
        int Enter = 0;

        System.out.println("**********************************************");
        System.out.println("\nName: " + name);
        System.out.println("Account Type: " + typeAccount);
        System.out.println("Initial Value: R$ " + initialValue);
        System.out.println("\n**********************************************");

        String menu = """
                
                Operations:
                1- Check Value
                2- Receive value
                3- Transfer value
                4- Break
                """;

        while (Enter != 4) {

            System.out.printf(menu);
            System.out.printf("Enter the desired option:");
            Enter = read.nextInt();

            switch (Enter) {
                case 1:
                    System.out.println("Value in the account: " + initialValue);
                    break;
                case 2:
                    System.out.printf("Enter the amount to be received: ");
                    initialValue += read.nextDouble();
                    System.out.println("Updated value: " + initialValue);
                    break;
                case 3:
                    System.out.printf("Enter the amount you wish to transfer: ");
                    initialValue -= read.nextDouble();
                    System.out.println("Updated value: " + initialValue);
                    break;
                default:
                    System.out.printf("Not a valid option: ");
                    break;
            }
        }
    }
}