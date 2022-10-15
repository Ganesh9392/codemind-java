import java.util.Scanner;
class K{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sm=0;
        int[] l=new int[n];
        for(int i=0;i<n;i++){
            l[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            sm=sm+l[i];
        }
        System.out.println(sm);
    }
}