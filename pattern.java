//question-1
/*
*
* *
* * *
* * * *

*/
/* 
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int size,i,j;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an array pattern");
        size=src.nextInt();
        for(i=0;i<size;i++){
            for(j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}
*/

//question.2
/* 
* * * * *
* * * *
* * *
* *
*
*/
/* 
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int size,i,j;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an array pattern");
        size=src.nextInt();
        for(i=size;i>=1;i--){
            for(j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}

*/


//question 3
/* 
         *
      *  * 
   *  *  *
*  *  *  *
*/
/* 
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int size,i,j,k;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an array pattern");
        size=src.nextInt();
        for(i=1;i<=size;i++){
            for(j=i;j<size;j++){
             System.out.print(" ");
            }

            for(k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}

*/


//question-4
/* 

* * * * *
  * * * *
    * * *
      * *
        *
        
        */

      
        /* 


import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int size,i,j,k;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an array pattern");
        size=src.nextInt();
        for(i=1;i<=size;i++){
            for(j=1;j<i;j++){
             System.out.print(" ");
            }

            for(k=i;k<=size;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
    */



    //question-5


    /* 
    * * * * * 
    * * * * * 
    * * * * * 
    * * * * * 
    * * * * * 

    */

  /* 
    import java.util.Scanner;
    public class pattern {
        public static void main(String[] args) {
            int size,i,j,k;
            Scanner src=new Scanner(System.in);
            System.out.print("Enter the size of an array pattern");
            size=src.nextInt();
            for(i=0;i<size;i++){
                for(j=0;j<size;j++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }
        }
        
    }
    
    */


   //question -6

   /* 
   
   *  *  *  *   * 
   *            *
   *            *
   *            *
   *  *   *  *  *
   
   */

   /* 

import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int size,i,j,k;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an array pattern");
        size=src.nextInt();
        for(i=1;i<=size;i++){  
            for(j=1;j<=size;j++){ 
                if(i==1 || j==1 || i==size || j==size){ 
                    System.out.print("* ");
                } else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
        
    }
    
}

*/


//question-7 

/* 
         *
       * * *
    *  * * * *
*   *  * * *  *  *

*/
   /* 
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int size,i,j,k;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an array pattern");
        size=src.nextInt();
        for(i=1;i<size;i++){
            for(j=size;j>i;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }
    
}
    */

   
    
    //question-8:
    /* 
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5

    */

 /*     
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int size,i,j,k;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an array pattern");
        size=src.nextInt();
        for(i=1;i<=size;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
    
}

*/

//Question-9:
/* 
1
2 2 
3 3 3 
4 4 4 4
5 5 5 5 5
*/


/* 
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int size,i,j,k;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an array pattern");
        size=src.nextInt();
        for(i=1;i<=size;i++){
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }
    
}

*/

//question-10
/* 
1 
2  3 
4  5  6
7  8  9  10
11 12 13 14 15

*/
/* 
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int size,i,j,count=0;
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the size of an array pattern");
        size=src.nextInt();
        for(i=1;i<=size;i++){
            for(j=1;j<=i;j++){
                count ++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
        
    }
    
}

    */

    //question:11-
/* 
    A
    A B
    A B C 
    A B C D E 
    A B C D E F

    */
    /* 
    public class pattern {
        public static void main(String[] args) {
            char i, j;
            for(i='A'; i<='F'; i++) {
                for(j='A'; j<=i; j++) {
                    System.out.print(j+" ");
                }
                System.out.print("\n");
            }
        }
    }

    */


    //Question-12:
    /* 

    A 
    B B 
    C C C 
    D D D D
    E E E E E

    */
/* 
     public class pattern {
        public static void main(String[] args) {
            char i, j;
            for(i='A'; i<='F'; i++) {
                for(j='A'; j<=i; j++) {
                    System.out.print(i+" ");
                }
                System.out.print("\n");
            }
        }
    }

    */

   // Question-13:

    /* 
    A 
    B C
    D E F 
    G H I J 
    K L M N O 

    */
    /* 
    public class pattern {
        public static void main(String[] args) {
            char i, j;
            char count=65;
            for(i=65; i<=69; i++) {
                for(j=65; j<=i; j++) {
                    
                    System.out.print(count+" ");
                    count++;
                }
                System.out.print("\n");
            }
        }
    }

    */

    //question-14:dimand shape;
    /* 

            * 
         *  *  *
     *   *  *   *  *
         *  *  * 
            * 

            */
      
            /* 

            public class pattern {
                public static void main(String[] args) {
                    int i, j,k;
                    
                    for(i=1;i<5;i++){
                        for(j=5;j>i;j--){
                            System.out.print(" ");
                        }
                        for(k=1;k<=(2*i-1);k++){
                            System.out.print("*"+" ");
                        }
                        System.out.println();
                    }
                }
            }

            */


           // Question -15: half dimand;

            /* 
            *
            * *
            * * * 
            * * * *
            * * * * * 
            * * * * 
            * * * 
            * * 
            *
            */
            
 
            
            public class pattern {
                public static void main(String[] args) {
                    int i, j,k;
                    
                    for(i=1;i<4;i++){
                        for(j=1;j<=i;j++){
                            System.out.print("*"+" ");
                        }
                        System.out.println();
                    }
                    for(i=1;i<=5;i++){
                        for(j=5;j>=i;j--){
                            System.out.print("*"+" ");
                        }
                        System.out.print("\n");
                    }
                }
            }

