class Solution {
    public long array_compaction(long arr[]) {
        
            long i=0; 
			long j=1;
			// int k=0;
			while(i < arr.length){
				
				while( j < arr.length-1){
					
						if(arr[i]==arr[j+1]){
							arr[i] = arr[j+1];
							j++;
						}elseif(arr[i] < arr[j+1]){
							//arr[j+1] = arr[j+1];
							i = j+1;
							break;
						}else{
							j++;
						}
					
				}
				
				
			}	
			
			return arr ;
         
    }
}
