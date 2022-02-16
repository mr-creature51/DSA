public class infinte_array {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int target = 12;
        int ans = binarystart(arr, target);
        System.out.println(ans);

    }




static int binarystart( int[]arr , int target , int start , int end){

    int start = 0;
    int end = 1;
    int point = 0;
    while(target >= arr[end]){
         point= start;
         end = end *2;
    }
    
    while(start <= end){

       int mid = start+ (end- start)/2;
       
        if( target < arr[mid]){
            end = mid-1;
        }
        else if (target > arr[mid]) {
            start  = mid+1;

        } else {
            return mid;
}
 return -1;

}
 

// public class Main
// {

//     private static int binarySearch(int[] a, int target) {
//         int start = 0;
//         int end = 1;

//         // First try to find the lower and upper bounds before applying binary search
//         while (target > a[end]) {
//             start = end;
//             end *= 2;
//         }

//         while (start <= end) {
//             int mid = (start + end) / 2;

//             if (target == a[mid]) {
//                 return mid;
//             } else if (target < a[mid]) {
//                 end = mid - 1;
//             } else {
//                 start = mid + 1;
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//      int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
//         int target = 12;
//         int ans = binarySearch(a, target);
//         System.out.println(ans);

//     }
// }
