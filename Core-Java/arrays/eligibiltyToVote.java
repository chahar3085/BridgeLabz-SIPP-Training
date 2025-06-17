import java.util.*;
public class eligibiltyToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Enter the age ");
            int a = sc.nextInt();
            if(a>=18){
                System.out.println("person is eligible to vote");
            }
            else{
                System.out.println("Person is not able to Vote");
            }
        }
    }
}
