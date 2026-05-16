class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character , Character> closeToOpen = new HashMap<>();
        
        
        for(char c : s.toCharArray()){
            if(c == '{'){
                stack.push('}');
                }
            else if(c == '['){
                stack.push(']');
                }
            else if(c == '('){
                stack.push(')');
            }else if( stack.isEmpty() || stack.pop() != c){
                return false;
            }
            
            
            }
            if(!stack.isEmpty()) return false;
            return true;
    }
}
            
    

    

                
            

        
         
       


    



        
    

