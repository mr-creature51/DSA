public class alpabate {
	public static void main(String[] args) {
	    
       char letters[] = { 'A', 'r', 'z' };
        char target = 'b';
        char result = nextGreatestAlphabet(letters, target);
 
    
        System.out.println(result);
               
        }
         static char nextGreatestAlphabet(char alphabets[],
                                     char target)
    {
      int n = alphabets.length;
      if(target >=alphabets[n-1])
        return alphabets[0];
 
        int start = 0, end = alphabets.length - 1;
      
        int ans = -1;
     
        while (start <= end)
        {
            
            int mid = (start + end) / 2;
            if (alphabets[mid] > target)
            {
                end = mid - 1;
                ans = mid;
            }
            else
                start = mid + 1;
        }
 
        // Return the smallest element
        return alphabets[ans];
    }
    
   
         
	}
}
