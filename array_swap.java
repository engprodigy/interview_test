class Solution {
    public int array_swap(int arr[], int N) {
        
            int swap_point = arr.length-N;
			
			for(int i=0; i < arr.length; i++){
				
			if(swap_point < arr.length){
				arr[i] = arr(swap_point);
			        swap_point++;
	                   }else{
						   
				  arr[i] = arr[i-(N+1)];
					   }
				
				i++;
			}	
			
			return arr ;
         
    }
}
