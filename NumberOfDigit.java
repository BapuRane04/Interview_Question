package Interview_Question;

public class NumberOfDigit {
    public static void main(String[] args) {
        int n = 12345 , count = 0;
        while(n!=0){
             n = n/10;
             count ++;
        }
        System.out.print("Number Of Digit: "+count);
    }
}
