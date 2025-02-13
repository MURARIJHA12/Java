//Remove duplication element in this arrays 

import java.util.*;
class Remove{
    public static void main(String [] args){
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the Size of an Arrays:");
        int n=src.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the Element of an arrays:");
        //store the elemnt of an arrays
        for(int i=0;i<n;i++){
            arr[i]=src.nextInt();
            
        }
        System.out.println("Orognal Element of an arrays:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        //remove duplication element of an arrays
        //create new arr
        int arr1[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            
            boolean isDuplication=false;
            
            for(int j=i+1;j<n;j++){

                if(arr[i]==arr[j]){

                    isDuplication=true;
                    break;

                }

            }
            if(!isDuplication){

                arr1[k]=arr[i];

                k++;
            }

        }
        System.out.println("\n Remove duplication element of an arrays:");
        for(int i=0;i<k;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
