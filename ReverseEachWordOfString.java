package Interview_Question;

public class ReverseEachWordOfString {
    public static void main(String[] args) {
          String s = "bapu shantaram rane";String rev = "";
      String str[]=s.split(" ");
      for(String nstr : str){
          char ch[] = nstr.toCharArray();
          for(int i=ch.length-1;i>=0;i--){
              rev = rev + nstr.charAt(i);
          }
          System.out.print(rev);
          rev = " ";
      }
    }
}
