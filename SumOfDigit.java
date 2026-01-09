package Interview_Question;

public class SumOfDigit {
    public static void main(String[] args) {
         int n = 12345 , sum = 0 , r=0;
        while(n!=0){
            r = n%10;
            sum +=r;
            n = n/10;
        }
        System.out.print("Sum Of Digit: "+sum);
    }
}
