import java.util.*;
public class GridWays {
    public static int gridways(int i,int j,int r,int c){
        //base case
        if(i==r-1 &&j==c-1){//count for last cell
            return 1;
        }
        else if(i==r||j==c){//boundary cross condition
            return 0;

        }
        int w1=gridways(i+1,j,r,c);
        int w2=gridways(i, j+1, r, c);
        return w1+w2;
    }
    
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);
        System.out.println("Enter the Size of row");
        int r=src.nextInt();
        System.out.println("Enter the Size of col");
        int c=src.nextInt();
       
        System.out.println(gridways(0,0,r,c));
    }
}
