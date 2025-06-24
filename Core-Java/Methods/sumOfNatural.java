import java.util.Scanner;
public class sumOfNatural {
    public static int getSum(int n){
        int sum = 0;
        while(n>0){
            sum+=n;
            n--;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(getSum(n));
    }
}
