package Interview_Question;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345 , rev = 0,r=0;
        while(n!=0){
            r = n%10;
            rev = rev*10 + r;
            n = n/10;
        }
        System.out.println("Reversed Number: " + rev);
    }
}
