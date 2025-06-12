import java.util.Scanner;
public class checkBmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter weight");
        double weight = sc.nextDouble();
        if(weight<=18.4){
            System.out.println("underweight");
        }
        else if(weight>18.4 && weight<25){
            System.out.println("normal");
        }
        else if(weight>=25 && weight<40){
            System.out.println("overweight");
        }
        else if(weight>=40){
            System.out.println("obese");
        }
        else{
            System.out.println("wrong weight");
        }


    }
}
