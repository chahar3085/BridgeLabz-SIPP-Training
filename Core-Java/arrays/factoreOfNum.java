import java.util.*;
public class factoreOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        ArrayList<Integer> ll = new ArrayList<>();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                ll.add(i);
            }
        }
        ll.add(n);
        System.out.println(ll);
    }
}
