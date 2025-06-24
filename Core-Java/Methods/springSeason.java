import java.util.*;
public class springSeason {
    public static void getSeason(int month,int date) {
        if (month >= 3 && month <= 6) {
            if (month == 3) {
                if (date > 20) {
                    System.out.println("It is SpringSeason");
                } else {
                    System.out.println("It is not SpringSeason");
                }
            } else if (month == 6) {
                if (date < 20) {
                    System.out.println("It is SpringSeason");
                } else {
                    System.out.println("It is not SpringSeason");
                }
            } else {
                System.out.println("It is a springSeason");
            }
        }
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        int a= sc.nextInt();
        System.out.println("Enter the date");
        int b = sc.nextInt();
       getSeason(a,b);
    }
}
