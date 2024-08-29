import java.util.Scanner;
public class factoral {
    public static void main(String[] args){
        int fac=1,i,n;
        System.out.print("Enter the number of factorail=");
        Scanner src=new Scanner(System.in);
        n=src.nextInt();
        for(i=1;i<=n;i++){
            fac=fac*i;
        }
        System.out.println("factorial of"+""+n+"is="+fac);
    }
}
