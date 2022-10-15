import java.lang.Math;
import java.util.Scanner;
class L{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double  n=s.nextDouble();
        double t=0.0;
        t=Math.sqrt(n);
        if(n%t==0)
        System.out.println("True");
        else
        System.out.println("False");
    }
}