//input by the user in the 1-D arrays
/* 

import java.util.Scanner;
import java.util.Arrays;
class array{
    public static void main(String[] args) {
        int i,n;
        Scanner src=new Scanner(System.in);
        System.out.print("Enter the Size of an array="+" ");
        n=src.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=src.nextInt();
        }
        System.out.print("Array element are=");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        

    }
}
    */

    // Question- search element in the array present times


    /* 
    import java.util.*;
    class array{
        public static void main(String args[]){
            int i,n,search,count=0;
            Scanner src=new Scanner(System.in);
            System.out.print("Enter the array Size=");
            n=src.nextInt();
            int arr[]=new int[n];
            System.out.print("Enter the Element of an array=");
            for(i=0;i<n;i++){
                arr[i]=src.nextInt();

            }
            System.out.print("array elemnt are="+" ");
            for(i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println("\n Enter the search element in the Arrays=");
            search=src.nextInt();
            for(i=0;i<n;i++){
                if(search==arr[i]){
                    count++;
                }
            }
            System.out.println(count);

        }
    }

    */

    //Question-3: Reverse in arrays
  /* 
    import java.util.Scanner;
    import java.util.Arrays;
    class array{
        public static void main(String[] args){
            int i,n;
            Scanner src=new Scanner(System.in);
            System.out.println("Enter the Size of an array=");

            n=src.nextInt();
            int arr[]=new int[n];
            for(i=0;i<n;i++){
                arr[i]=src.nextInt();
            }
            System.out.print("Orignal arrays are=");
            for(i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.print("\nReverse of an array=");
            for(i=n-1;i>=0;i--){
                System.out.print(arr[i]+" ");
            }
            

        }
    }
  */

  // question 4: shotting an array

  /* 

  import java.util.*;
  class array{
    public static void main(String args[]){
        int i,j,temp,n;
        Scanner src=new Scanner(System.in);
        System.out.print("Enter the Size of an array=");
        n=src.nextInt();
        int arr[]=new int[n];

        for(i=0; i<n; i++){

         arr[i]=src.nextInt();

        }
        System.out.println("Orignal arrays are=");

        for(i=0; i<n; i++){
            System.out.println(arr[i]);
        }
        //logic of Shorting in an array;

        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Shorting in an Array=");
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
  }

  */


  //Question 5 find the greatest  element in the Array

  /* 

  import java.util.*;

class array {
    public static void main(String[] args) {
        int i, n;
        Scanner src = new Scanner(System.in);

        System.out.print("Enter the Size of an array = ");
        n = src.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (i = 0; i < n; i++) {
            arr[i] = src.nextInt();
        }

        System.out.print("Original array is = ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        
        int max = arr[0];
        for (i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element in the array is = " + max);

        
    }
}

*/



//Question-6 second Smallest element in the arrays

/*

import java.util.*;
class array{
    public static void main(String[] args) {
        int n,i,j,temp;
        Scanner src=new Scanner(System.in);
        System.out.print("Enter the Size of an array=");
        n=src.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=src.nextInt();
        }
        System.out.println("Orignal array are=");
        for(i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("\n 2nd smallest element in the array"+ arr[1]);
        // for(i=0;i<n;i++){
        //     System.out.print(arr[1]+" ");
        // }

    }
}
    */



              //         2-D arrays

             //input by the users in 2-D array

             
             /* 
               import java.util.*;

               class array{
                public static void main(String[] args) {
                    int i,j,row,col;
                    Scanner src=new  Scanner(System.in);
                    System.out.print("Enter the no of row="+" ");
                    row=src.nextInt();
                    System.out.print("Enter the no of colums="+" ");
                    col=src.nextInt();
                    int arr[][]=new int[row][col];
                    for(i=0;i<row;i++){
                        for(j=0;j<col;j++){
                            arr[i][j]=src.nextInt();
                        }
                    }
                    System.out.print("element of two dimansonal array="+" ");
                    for(i=0;i<row;i++){
                        System.out.println();
                        for(j=0;j<col;j++){
                            System.out.print(arr[i][j]+"  ");
                        }
                        
                    }
                }
               }

               */

               //Question -  transformation of Matrix;

               /*
import java.util.*;
class array{
    public static void main(String[] args) {
        int i,j,row,col;
        Scanner src=new Scanner(System.in);
        System.out.print("Enter the Size of row");
        row=src.nextInt();
        System.out.print("Enter the Size of col");
        col=src.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter the Element of an array");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                arr[i][j]=src.nextInt();
            }
        }
        System.out.print("Orignal arrays are=");
        for(i=0;i<row;i++){
            System.out.println();
            for(j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
        }

        int arr1[][]=new int[row][col];
        for(j=0;j<col;j++){
        for(i=0;i<row;i++)
            {
                arr1[j][i]=arr[i][j];
            }
        }
        System.out.println("\nTransformation of matrix=");
        for(i=0;i<row;i++){
            System.out.println();
            for(j=0;j<col;j++){
                System.out.print(arr1[i][j]+" ");
            }
        }
        

    }
}
    */

    