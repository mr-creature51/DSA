public class binary_search {

        public static void main(String[] args) {
            
        //     int[] arr = { -1,-2, 3, 4, 4, 6, 7, 8, 9, 11, 55, 64, 88, 98 };
        //  // int[] arr = {  0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13 ,14 };
        int[] arr = {1,4,7,8,8,11,11,11,11,12,13};
        int target = 11;
         
            
            int ans= binarystart(arr, target);
                    
            int an= binaryend(arr, target);
            System.out.println(ans);
               System.out.println(an);
                System.out.println((an-ans)+1);
               
        }
    
        static int binarystart( int[]arr , int target){
            int start = 0;
            int end = arr.length;
              int point1 =-1;
            while(start <= end){
    
               int mid = start+ (end- start)/2;
               
                if( target < arr[mid]){
                    end = mid-1;
                }
                else if (target > arr[mid]) {
                    start  = mid+1;
    
                } else {
                    point1 = mid;
                   end= mid  -1;
                    
                }
                
            
    
            }
            
         
            // System.out.println("the elemet is not in the array");
             return point1;
        }
    
                static int binaryend( int[]arr , int target){
            int start = 0;
            int end = arr.length;
              int point2 =-1;
            while(start <= end){
    
               int mid = start+ (end- start)/2;
               
                if( target < arr[mid]){
                    end = mid-1;
                }
                else if (target > arr[mid]) {
                    start  = mid+1;
    
                } else {
                    point2 = mid;
                   start= mid  +1;
                    
                }
                
                
    
            }
            
         
            // System.out.println("the elemet is not in the array");
             return point2;
    
    }
        
        
        
    }
