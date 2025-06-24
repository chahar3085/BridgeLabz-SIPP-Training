import java.util.Scanner;

public class compare {

    public static char[] getChars(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        char[] userDefined = getChars(input);
        char[] builtIn = input.toCharArray();

        boolean isEqual = compareCharArrays(userDefined, builtIn);

        System.out.println("User-defined array: ");
        for (char c : userDefined) {
            System.out.print(c + " ");
        }

        System.out.println("\nBuilt-in array: ");
        for (char c : builtIn) {
            System.out.print(c + " ");
        }

        System.out.println("\nArrays are equal: " + isEqual);
    }
}