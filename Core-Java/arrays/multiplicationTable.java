import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] multiplicationResult = new int[4];
        for (int i = 0; i < 4; i++) {
            int multiplier = i + 6;
            multiplicationResult[i] = number * multiplier;
        }
        for (int i = 0; i < 4; i++) {
            int multiplier = i + 6;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }
    }
}