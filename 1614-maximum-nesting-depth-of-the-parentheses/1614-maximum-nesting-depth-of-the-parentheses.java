class Solution {
    public int maxDepth(String s) {
        int level = 0;
        int max = 0;

        for(char ch: s.toCharArray()){
            if(ch=='('){
                level++;
            }
            
            if(level > max){
                max = level;
            }

            if(ch==')'){
                level--;
            }
        }

        return max;
    }
}