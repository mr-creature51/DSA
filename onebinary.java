public class onebinary {
    public static void main() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13 };
        int target = 7;
        int ans = binary(arr, target);
        System.out.println(ans);
    }
        
    static int binary(int[] arr, int[] target) {
        int start = 0;
        int end = arr.length - 1;

        int mid = start + (start + end) / 2;
        while (start <= end) {
            if (target >= mid) {
                start = mid + 1;
            } else if (target <= mid) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
