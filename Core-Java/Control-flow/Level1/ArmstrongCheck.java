import java.util.Scanner;

public class ArmstrongCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int num1 = num;
        int result = 0;

        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, 3);
            num /= 10;
        }

        if (result == num1) {
            System.out.println(num1+ " is an Armstrong number.");
        } else {
            System.out.println(num1+ " is not an Armstrong number.");
        }
    }
}
