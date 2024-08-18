import java.util.Scanner;
public class assignmentoperator {
    public static void main(String args[]){
        int x;
        System.out.println("enter the value of a=");
        Scanner obj=new Scanner(System.in);
        x=obj.nextInt();
        x+=10;
        System.out.println(x);
        x-=10;
        System.out.println(x);

    }
    
}
