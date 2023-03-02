public class revirceNo {
    public static void main(String[] args) {
        int n = -4567;
        int ans = 0 ;
        int count = 0;
        while(n!=0){
            int rem = n % 10;
//            System.out.println(rem);
            n /= 10;
            ans = ans * 10 + rem;
            count++;
        }
        System.out.println(ans);
    }
}
