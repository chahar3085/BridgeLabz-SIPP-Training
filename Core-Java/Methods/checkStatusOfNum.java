import java.util.*;
public class checkStatusOfNum {
    public static int getStatus(int n){
        if(n<0){
            return -1;
        }
        else if(n>0){
            return 1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(getStatus(n));
    }
}
