package Interview_Question;

public class Fibonacci_Series {
    public static void main(String[] args) {
        int a =0 , b=1, temp=0 , range = 8;
        for(int i=1;i<=range;i++){
            System.out.print(a+" ");
            temp = a+b;
            a = b;
            b=temp;
        }
    }
}
