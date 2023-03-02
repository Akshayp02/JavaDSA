public class RepitedNum {

    public static void main(String[] args) {
        // Q. Finr the Number how many times 7 is repited in following series

        int n = 1785757879;
        int count = 0;

        while(n>0){
            int rem = n%10;
            if(rem == 7){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
