import java.util.Scanner;
class D{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int f=1;
        int[] l=new int[n];
        for(int i=0;i<n;i++){
            l[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(l[i]>=n){
            f=0;
            break;
            }
        }
        if (f==0)
        System.out.print("NO");
        else
        System.out.print("YES");
    }
}