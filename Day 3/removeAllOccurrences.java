
//Link:- https://leetcode.com/problems/remove-all-occurrences-of-a-substring/

class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            int i = s.indexOf(part);
            s = s.substring(0,i)+s.substring(part.length()+i,s.length());
        }
        return s;
    }
}
