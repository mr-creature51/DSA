import java.util.Scanner;
import javax.swing.text.StyledEditorKit.ForegroundAction;

// find a index in the element 

public class find_min_and_max {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -89, 4, 56, 3, -1, 47, 5 };

        int ans = min(arr);
        System.out.println(ans);

    }

    static int min(int[] arr) {
        int an = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (an < arr[i]) {
                an = arr[i];
            }
        }
        return an;
    }
    
}