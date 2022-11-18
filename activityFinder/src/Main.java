import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double weather;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the weather degree (Celcius) : ");
        weather = input.nextInt();
        if (weather <= 5) {
            System.out.println("The weather is : " + weather + " Drink hot choclate great idea ");
        } else if (weather >= 6 && weather < 16) {
            System.out.println("The weather is : " + weather + " Watching the ski is great idea ");
        } else if (weather > 16 && weather < 26) {
            System.out.println("The weather is :" + weather + " Walking is the best think for this weather ");
        } else if (weather > 25) {
            System.out.println("The weather is : " + weather + " Swimming in the canyon good idea for chill ");
        }
    }
}