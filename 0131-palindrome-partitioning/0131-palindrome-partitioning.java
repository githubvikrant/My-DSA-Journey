class Solution {
    List<List<String>> result = new ArrayList<>();
    int n;
    public List<List<String>> partition(String s) {
        n = s.length();
        recur(s,0,new ArrayList<>());
        return result;
    }

    public void recur(String s,int partIndex,List<String> sublist){
        //base case
        if(partIndex == n){
            result.add(new ArrayList<>(sublist));
            return;
        }
        //explore
        for(int end=partIndex;end<n;end++){
            if(isPalindrome(s,partIndex,end)){
                //add in list
                sublist.add(s.substring(partIndex,end+1));
                //explore
                recur(s,end+1,sublist);
                //backtrack
                sublist.remove(sublist.size()-1);
            }
        }
    }

    public boolean isPalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}