import java.lang.reflect.Array;

public class count_no {
    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896 };

    
        if (arr.length == 0) {
            return -1;
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int digit = 0;
        
            while (arr[i] != 0) {
                arr[i] = arr[i] / 10;
                digit++;

            }
            
            
        if(digit % 2 == 0) {
             ans++;
        }
        }


            return ans++;
        
    }
}
