class Solution {
    public string find_chars(String string1, String string2) {
        

			for(int i=0; i < string2.length; i++){
					string1 +=string2.CharAt(i);
				}
			
			return string1;
         
    }
}
