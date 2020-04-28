//solve using bfs and a queue
class Solution {
    public List<String> letterCasePermutation(String S) {
        
        if(S.length() == 0){ return new LinkedList<>();}
        
        Queue<String> queue= new LinkedList<>();
        queue.offer(S);
        
        for(int x = 0; x < S.length(); x++){
            
            if(Character.isDigit(S.charAt(x))){continue;}
            
               int size = queue.size();
               
               for(int y = 0; y < size; y++){
                   
                   String temp = queue.poll();
                   
                   char[] c = temp.toCharArray();
                   
                   c[x] = Character.toLowerCase(c[x]);
                   queue.offer(String.valueOf(c));
                   
                   c[x] = Character.toUpperCase(c[x]);
                   queue.offer(String.valueOf(c));
                   
               }
             
        }
        
        return(new LinkedList<>(queue));
              
    }
}