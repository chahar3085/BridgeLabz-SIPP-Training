import java .util.*;
public class atheleteRounds {
    public static double getRound(double base,double hypo,double height){
        double x= base+hypo+height;
        return x/5000;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base in meter=");
        double base = sc.nextInt();
        System.out.println("Enter the hypo in meter=");
        double hypo = sc.nextInt();
        System.out.println("Enter the height in meter");
        double height= sc.nextInt();
        double a = getRound(base,hypo,height);
        System.out.println(a);
    }
}
