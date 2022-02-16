
public class rotation
{
	public static void main(String[] args) {
		int[] arr= {4,5,6,7,0,1,2};
	int	target = 6;
		int ans = rotation1(arr , target);
		System.out.println(ans);
	}
	
	static int rotation1(int[] arr , int[] target){
	    int start= 0;
	    int end = arr.length-1;
        while (start <= end) {
            
            int mid = start + (start + end) / 2;
	      
	        if(arr[mid]== target){
	            return mid;
	        }
	        else if(arr[start]<= arr[mid]){
	            if(target>= arr[start] && target<= arr[mid]){
	                end = mid -1;
	            }
	            else{start =mid +1; }
	        }
	        
	        else{
	                  if(target>= arr[mid] && target<= arr[end]){
	                start = mid +1;
	            }
	            else{end=mid -1; }
	        }
	        }
	        	System.out.println("not present");
	return -11;
	}
	

}