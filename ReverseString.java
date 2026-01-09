package Interview_Question;

public class ReverseString {
    public static void main(String[] args) {
         String s = "bapu";
       String rev = "";
       char [] ch = s.toCharArray();
       for(int i=ch.length-1;i>=0;i--){
           rev = rev + s.charAt(i);
       }
       System.out.print("Reverse String : "+rev);
    }
}
