import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(25);
        list.add(34);
        list.add(38);
        list.add(7);
        list.add(1);
        System.out.println("Orignal list are="+list);

        Collections.sort(list); //ascending order
        System.out.println("shorting list are="+list);

        //decending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("decending order in the list"+list);
       

    }
    
}
