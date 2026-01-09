package Interview_Question;

public class Palindrom {
    public static void main(String[] args) {
        int n = 123321 , rev = 0, r = 0, palindrom = 0;
        palindrom = n;
        while(n!=0){
            r = n%10;
            rev = rev * 10+r;
            n = n/10;
        }
        if(rev == palindrom){
            System.out.print(rev+" Is Palindrome !");
        }else{
            System.out.print(rev+" Is Not Palindrome !");
        }
    }
}
