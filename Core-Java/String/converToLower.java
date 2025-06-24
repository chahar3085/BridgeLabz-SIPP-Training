import java.util.Scanner;

public class converToLower {

    public static String toLowerCaseManual(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();
        String manualLower = toLowerCaseManual(input);
        String builtInLower = input.toLowerCase();
        boolean isSame = compareStrings(manualLower, builtInLower);
        System.out.println("Manual Conversion: " + manualLower);
        System.out.println("Built-in Conversion: " + builtInLower);
        System.out.println("Are both results equal? " + isSame);
        sc.close();
    }
}