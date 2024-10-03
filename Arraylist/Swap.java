import java.util.*;
public class Swap {
    public static void swap(ArrayList<Integer>list,int ind1,int ind2){
        int temp=list.get(ind1);
        list.set(ind1,list.get(ind2));
        list.set(ind2,temp); 

        System.out.println("After Swapping in this arraylist="+list);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(23);
        list.add(4);
        list.add(7);
        list.add(95);
        System.out.println("Orignal list are="+list);
        int ind1=1,ind2=3;
        swap(list, ind1, ind2);
        
    }
    
}
