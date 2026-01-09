package Interview_Question;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153 , sum =0 , r=0;
        int temp =n;
        while(n!=0){
            r = n%10;
            sum += r*r*r;
            n = n/10;
        }
        if(sum == temp){
         System.out.println(temp + " is an Armstrong Number");
        }
    }
}
