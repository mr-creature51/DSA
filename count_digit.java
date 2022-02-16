import java.util.Scanner;

public class count_digit {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        int n = 2250;

        int ans = 0;
        while(n!=0) {
            n = n % 10;
            s = n / 10;
            ans = Math.pow(10, 5 - 1);
            
        }
        System.out.println(ans);
    }
}
