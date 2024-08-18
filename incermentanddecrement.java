

import java.util.*;
public class incermentanddecrement {
    public static void main(String[] args){
        int x,y;
        Scanner obj=new Scanner(System.in);
        x=obj.nextInt();
        y=obj.nextInt();
        System.out.println(x);
        System.out.println(y);
        System.out.println("pre increment"+(++x));
        System.out.println("pre decrement"+(--x));
        System.out.println("post increment"+(x++));
        System.out.println("post decrement"+(x--));
    }
    
}
