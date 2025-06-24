import java.util.Scanner;
public class AvgOfRandom {
    public static int getAvg(int a,int b,int c,int d,int e){
        return (a+b+c+d+e)/5;
    }
    public static int getMax(int a,int b,int c,int d,int e){
        int x = Math.max(a,b);
        int y = Math.max(c,d);
        int z = Math.max(x,y);
        int ans = Math.max(z,e);
        return ans;
    }
    public static int getMin(int a,int b,int c,int d,int e){
        int x = Math.min(a,b);
        int y = Math.min(c,d);
        int z = Math.min(x,y);
        int ans = Math.min(z,e);
        return ans;
    }

    public static void main(String[] args){
        int a = (int)(Math.random()*9000)+1000;
        System.out.println(a);
        int b = (int)(Math.random()*9000)+1000;
        System.out.println(b);
        int c = (int)(Math.random()*9000)+1000;
        System.out.println(c);
        int d = (int)(Math.random()*9000)+1000;
        System.out.println(d);
        int e = (int)(Math.random()*9000)+1000;
        System.out.println(e);
        System.out.println("average "+getAvg(a,b,c,d,e)+"maximum"+getMax(a,b,c,d,e)+"minimum"+getMin(a,b,c,d,e));
    }

}
