import java.util.Scanner;
public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        for(int i=2;i<a;i++){
            if(a%i==0){
                System.out.println("Not a prime number");
                return;
            }
        }
        System.out.println("it is a prime number");

    }
}
