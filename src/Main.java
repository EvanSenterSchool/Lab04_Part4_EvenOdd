import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int inputNumber;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a whole number");
        inputNumber = scan.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println("Your number is even.");
        }
        else
            System.out.println("Your number is odd");
        }
    }
