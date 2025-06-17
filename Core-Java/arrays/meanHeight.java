import java.util.Scanner;
public class meanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the heights");
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Mean of heights ="+ sum/n);

    }
}
