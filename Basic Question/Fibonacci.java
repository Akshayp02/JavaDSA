import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
///
        //Q. Find The Fibonacci Of N th NUmber
        int  n = sc.nextInt();

        int a = 0;
        int b = 1;

        int count = 2 ;
        while(count <= n){
            int temp = b ;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println("The Fibonacci of "+ n +" is " + b);
    }
}
