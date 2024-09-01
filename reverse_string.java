//pre defined method

//1.StringBuffer() method;

/* 
public class reverse_string{
    public static void main(String[] args) {
        StringBuffer r=new StringBuffer("Murari Jha");
        System.out.println(r.reverse());
    }
}
*/
//2-  StringBuiLder
/* 
public class reverse_string{
    public static void main(String[] args) {
        StringBuilder r=new StringBuilder("Murari Jha");
        System.out.println(r.reverse());
    }
}
    */

//user defined method
 
public class reverse_string {
    public static void main(String[] args) {
        int l,i;
        String a="MURARI JHA";
        String b="";
        l=a.length();
        for(i=l-1;i>=0;i--){
            b=b+a.charAt(i);
        }
        System.out.println("reverse of String="+b);
    }
    
}
    
