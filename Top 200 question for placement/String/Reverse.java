import java.util.*;
class Main{
    public static void main(String args[]){
        // System.out.println("Hello Murari");
        
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=src.nextLine();
        System.out.println(str);
        int length=str.length();
        //convert String to an arrays:
        char arr[]=str.toCharArray();
        //reverse of an string 
        System.out.println("Revesre of an String:");
        for(int i=length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}