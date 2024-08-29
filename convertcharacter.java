import java.util.*;
public class convertcharacter {
    public static void main(String args[]){
        char ch,ch2,ch3;
        Scanner src=new Scanner(System.in);
        System.out.println("enetr the charchter=");
        ch=src.next().charAt(0);
        if(ch>='a'&&ch<='z'){
            ch2=Character.toUpperCase(ch);
            System.out.println("conver upper case in charcter="+ch2);
        }
        else{
            ch3=Character.toLowerCase(ch);
            System.out.println("conver in charcter in lower case"+ch3); 
        }

    }
}
