import java.util.Scanner;
class s{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        double s=0.0;
        n=sc.nextInt();
        for(double i=1;i<=n;++i){
            s+=1/i;
        }
        System.out.printf("%.2f",s);
        
    }
}