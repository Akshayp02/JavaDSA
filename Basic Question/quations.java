import java.util.Scanner;

public class quations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Q. Print a largest Number
//
//        int max = a;
//        if(b > max){
//            max = b;
//        }
//        if(c > max){
//            max = c;

//        int max = 0;
//        if(a > b){
//            max=a;
//        }else{
//         max=b;
//        }
//        if(c > max){
//            max = c;
//        }
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }

}
