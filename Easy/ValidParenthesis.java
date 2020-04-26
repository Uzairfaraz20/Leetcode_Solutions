class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        Stack<Character> stack = new Stack<>();
        
        if(len == 0){return true;}
        
        for(int x = 0; x < len; x++){
            
            if(s.charAt(x)==('(') || s.charAt(x)==('[') || s.charAt(x)==('{')){
                stack.push(s.charAt(x));
            } 
            
            else{
                // ")" case
                if(s.charAt(x)==(')') && !stack.isEmpty() && stack.peek()==('(') ){
                    stack.pop();
                }else
                
                //"]" case
                if(s.charAt(x)==(']') && !stack.isEmpty() && stack.peek()==('[')){
                    stack.pop();
                } else
                
                //"}" case
                if(s.charAt(x)==('}') && !stack.isEmpty() && stack.peek()==('{')){
                    stack.pop();
                } 
                
                else{
                    return false;
                }
                
            }
            
        }
        
        return stack.isEmpty();
        }
    }
