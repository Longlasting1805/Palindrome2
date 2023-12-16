import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int palindrome;

        do {
            System.out.print("Enter a 5 digit numbers: ");
            palindrome = input.nextInt();

            if (palindrome < 10000 || palindrome > 99999){
                System.out.println("Invalid input. Please enter exactly 5 digits.");
            }


        }while (palindrome < 10000 || palindrome > 99999);
        System.out.println("You entered: "+ palindrome);

    }
}
