import java.util.Scanner;
class Disk
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t,s,b;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        b=b*512;
        s=b*s;
        t=t*2*s;
        System.out.println(t);
    }
}