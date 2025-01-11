import java.util.*;

class RemoveDuplication {
    public static void main(String args[]) {
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = src.nextLine();
        System.out.println("Original String: " + str);
        //1st:Method
        StringBuilder sb1=new StringBuilder();
        str.chars().distinct().forEach(c->sb1.append((char)c));
        System.out.println(sb1);
        
        //2nd methods
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int idx=str.indexOf(ch,i+1);
            if(idx==-1){
                sb2.append(ch);
            }
        }
        System.out.print(sb2);
        System.out.println();
        
        //3rd Approch -> convert arrays and removed
        
        char arr[]=str.toCharArray();
        StringBuilder sb3=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            boolean repated=false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    repated=true;
                    break;
                }
            }
            if(!repated){
                sb3.append(arr[i]);
            }
        }
        System.out.println(sb3);
        
       StringBuilder sb4 = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();
        
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i)); 
        }
        
        for (Character c : set) {
            sb4.append(c); 
        }
        
        System.out.println("String with unique characters: " + sb4);
    }
}
