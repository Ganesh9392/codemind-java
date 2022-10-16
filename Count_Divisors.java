import java.util.Scanner;
class L{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int n3=s.nextInt();
        int c=0;
        for(int i=n1;i<=n2;i++){
            if(i%n3==0)
            c+=1;
        }
        System.out.print(c);
    }
}