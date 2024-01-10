import java.util.*;

class Solution {
    public List<Integer> solution(int n, int k) {
        int[] answer = {};
        List<Integer> answer_temp = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++){
            if(i%k==0){
                answer_temp.add(i);
            }
        }
        Collections.sort(answer_temp);
        return answer_temp;
    }
}