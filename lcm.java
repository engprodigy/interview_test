class Solution {
    public int lcm(int arr[]) {
        
            Arrays.sort(arr);
			int max = arr[arr.length-1];
			boolean tracker = true;
			
			
			for(int i=1; i <= arr[arr.length-2]; i++){ 
			    int x = max*i;
			     
			    for(int j=0; j < arr.length-1; j++){
				
			         if (x%arr[j] != 0 ){
				        tracker = false;
						break;
	                 }
			    }
				if(tracker == true){
				
				  int lcm = x;
				  break;
					
				}
				
			}	
			
			
         
    }
}
