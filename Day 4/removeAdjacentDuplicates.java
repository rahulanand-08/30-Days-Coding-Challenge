//Link:- https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

class Solution {
    public String removeDuplicates(String s) {
        if(s.length() == 1)
            return s;
        Stack<Character> stk=new Stack<>();
        for(char c: s.toCharArray()){
            if(stk.isEmpty())
                stk.push(c);
            else if(stk.peek() == c)
               stk.pop(); 
            else
                stk.push(c);
        }
        StringBuilder ret = new StringBuilder();
        for(char c: stk)
        {
          ret.append(c);  
        }   
        return ret.toString();
    }
}
