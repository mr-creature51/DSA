import java.util.Scanner;
import javax.swing.text.StyledEditorKit.ForegroundAction;

// find a index in the element 

public class read_index {
    public static void main(String[] args) {
        
        int[] arr= { 1,2,3,4,5,6,7,8,9};
        int target = 6;
        // int start = 3;
        // int end = 8;
        int ans = ls(arr, target, 3,8);
         

        System.out.println(ans);
    }

    static int ls(int[] arr, int target , int start, int end) {
        if (arr.length == 0) {
            return -11;
        }
        
        for (int i = start; i <= end; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }

        }
        
        return 45;

    }
}