import java.util.Scanner;

public class arrayndexOutOfBound {

    public static void generateException(String[] names) {
        System.out.println("Generating ArrayIndexOutOfBoundsException (no handling):");
        System.out.println("Accessing index 10: " + names[10]); // Will cause exception
    }

    public static void handleException(String[] names) {
        System.out.println("Handling ArrayIndexOutOfBoundsException:");
        try {
            System.out.println("Accessing index 10: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        System.out.println("Enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            names[i] = sc.nextLine();
        }
        handleException(names);

        sc.close();
    }
}