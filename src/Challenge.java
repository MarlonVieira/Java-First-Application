public class Challenge {
    public static void main(String[] args) {
        double N2 = 13.5;
        int N1 = (int) N2;

        System.out.println("Casting: " + N1);

        String s = "Testin";
        char c = 'G';

        s = s + c;
        System.out.println(s);

        double priceProduct = 145.99;
        int quantity = 215;
        double totalPrice = priceProduct * (double) quantity;

        System.out.println("Total Price in Real R$: " + totalPrice);

        double valueDollars = 5.87;
        double convertToDollar = totalPrice * valueDollars;

        System.out.println("Value converted of Total Price in dollars $: " + convertToDollar);

        double originalPrice = 23.54;
        double discount = 5.60;
        double convertDiscount = discount /100;
        double newPrice = originalPrice - (originalPrice * convertDiscount);

        System.out.println("Original Price R$: " + originalPrice);
        System.out.println("Discount R$: " + discount);
        System.out.println("New Price w/ discount R$: " + newPrice);
    }
}