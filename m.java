import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class m {
  public static void main(String[] args) {

    System.out.println("Enter the no.");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    in.close();

    // String str = Integer.toHexString(n);

    // System.out.println("hexa no."+ str ) ;
    int rem;
    String ans = "";
    String ar[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

    while (n > 0) {
      rem = n % 10;

      ans = ar[rem] + ans;
      n = n / 10;

    }

    System.out.println(ans);
  }
  
}
