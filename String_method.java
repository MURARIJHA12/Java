public class String_method {
    public static void main(String[] args) {
        String a="MURARI";
        String b="kumar";


        System.out.println(a.toLowerCase()); 
        System.out.println(b.toUpperCase());
        
         System.out.println(b.concat(a)); 
         System.out.println(b.length());
         
         String c="   Subhash  ";
         String d=" ";
         System.out.println(c.trim());
         System.out.println(d.isEmpty());

         System.out.println(b.charAt(2));
         System.out.println(a.indexOf(3));

         System.out.println(b.equals(a));
         System.out.println(b.replace('r','e'));
         

    }
    
}
