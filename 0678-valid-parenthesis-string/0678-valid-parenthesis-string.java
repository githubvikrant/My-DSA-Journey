class Solution {
    public boolean checkValidString(String s) {
        int minOpen = 0; // Minimum possible open brackets
        int maxOpen = 0; // Maximum possible open brackets
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                minOpen++;
                maxOpen++;
            } else if (c == ')') {
                minOpen--;
                maxOpen--;
            } else { // c == '*'
                minOpen--; // If we treat '*' as ')'
                maxOpen++; // If we treat '*' as '('
            }
            
            // If the max possible open brackets drops below 0, it's invalid (too many ')')
            if (maxOpen < 0) return false;
            
            // minOpen can't be negative (we can't have negative open brackets, treat extra '*' as empty string)
            minOpen = Math.max(minOpen, 0); 
        }
        
        return minOpen == 0;
    }
}