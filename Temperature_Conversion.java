import java.util.Scanner;
class Area
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,r;
        a=sc.nextFloat();
        r=((a*9)/5)+32;
        System.out.printf("%.2f",r);
    }
}