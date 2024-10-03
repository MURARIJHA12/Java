import java.util.ArrayList;
public class Classroom {
    public static void main(String[] args) {
        //Defined of array list

        ArrayList<Integer>list= new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();

        //Add the value 
        list.add(1);
        list.add(12);
        list.add(3);
        list.add(8);
        list2.add("MURARI");
        list2.add("SUBHASH");
        System.out.println(list);
        /* 
       // System.out.println(list2);

        //Get operation-o(1)
        
        int element=list.get(2);
        System.out.println(element);

        //remove element or delete  o(n);
        list.remove(2);
        System.out.println(list);

        //set element at Index o(n);
        list.set(2,5);
        System.out.println(list);
   

        //contain element- element are existed in the arraylist 
        
         System.out.println( list.contains(7));
         System.out.println( list.contains(1));

*/


//Size of an arraylist
/* 
System.out.println(list.size());

//print the arrayList
for(int i=0;i<list.size();i++){
    System.out.print(list.get(i)+" ");
}
   System.out.println();

   //print Reverse of an Arraylist
   for(int i=list.size()-1;i>=0;i--){
    System.out.print(list.get(i)+"  ");
   }
   System.out.println();
    }
*/
    //find maximum Element in Arraylist
    int max=Integer.MIN_VALUE;
    for(int i=0;i<list.size();i++){
        if(max<list.get(i)){
            max=list.get(i);

        }
     
    }
    System.out.println("max elemement in the Array list="+max);
    
}
}
