import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        Scanner iin = new Scanner(System.in);

        System.out.println("Enter the no.");
        int n = iin.nextInt();
        int a = 1;
        int b;
        int c;
        int i;

        for (i = 1; i <= n; i++) {
        

            if (n % i == 0) {
                System.out.println("it is not a prime ");
            } else {
                System.out.println("it is a prime");
            }
        }
        
    }
}