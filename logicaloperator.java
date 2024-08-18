import java.util.*;

public class logicaloperator {
    public static void main(String []args){
        int a,b,c;
        System.out.println("inter the three integer value=");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();

        //performs the And operator
        System.out.println("performs the operation are (And Operation)"+"  ");
        System.out.println((a>b)&&(b>c));
        System.out.println((a>b)&&(b<c));
        System.out.println((a<b)&&(b<c));

        //perform the or operator
        System.out.println("performs the operation are (OR Operation)"+"  ");
        System.out.println((a>b)||(b>c));
        System.out.println((a>b)||(b<c));
        System.out.println((a<b)||(b<c));

        //perform the Not operator
        System.out.println("Perform the Operation are(not operator) "+"  ");
        System.out.println(!(a>b));
        System.out.println(!(b>c));
        System.out.println(!(a>c));

    }
}
