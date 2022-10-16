import java.util.Scanner;
import java.lang.Math;
class L{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        double p=s.nextDouble();
        double r=s.nextDouble();
        double t=s.nextDouble();
        double rr=0.0;
        rr=p*(Math.pow((1+r/100),t));
        System.out.printf("%.2f",rr);
    }
}