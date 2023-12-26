import java.util.*;
class Solution {
    public int[] solution(int n) {
        
        List <Integer> collatz = new ArrayList();
        collatz.add(n);
        
        while(true){
            if(n%2 == 0){
                n = n/2;
                collatz.add(n);
            }
            if(n==1){
                break;
            }
            if(n%2 == 1){
                n = 3*n+1;
                collatz.add(n);
            }
        }
        int[] answer = new int[collatz.size()];
        for(int i = 0 ; i < collatz.size() ; i++){
            answer[i] = collatz.get(i).intValue();
        }
        return answer;
    }
}