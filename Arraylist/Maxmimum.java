import java.util.ArrayList;

public class Maxmimum {
    public static void main(String[] args) {
        
    
    ArrayList<Integer>list=new ArrayList<>();
    
    //add element in arraylist
    list.add(5);
    list.add(23);
    list.add(7);
    list.add(97);
    list.add(12);
    System.out.println(list);
    int max=Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
      //  if(max<list.get(i)){
       //     max=list.get(i);
       // }
       
       //or
       max=Math.max(max,list.get(i));

    }
    System.out.println("Maximum Element in the Array liost="+max);

    
}

}
