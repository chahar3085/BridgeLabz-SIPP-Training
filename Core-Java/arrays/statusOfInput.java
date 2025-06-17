import java.util.*;public class statusOfInput {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
             arr[i] = sc.nextInt();
             if(arr[i]%2==0){
                 System.out.println("Even number");
                 if(arr[i]<0){
                     System.out.println("Negative number");
                 }
                 else if(arr[i]>0){
                     System.out.println("positive number");
                 }
                 else{
                     System.out.println("zero");
                 }
             }
             else{
                 System.out.println("ood number");
                 if(arr[i]<0){
                     System.out.println("Negative number");
                 }
                 else if(arr[i]>0){
                     System.out.println("positive number");
                 }
                 else{
                     System.out.println("zero");
                 }
             }
        }

    }
}
