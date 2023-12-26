import java.util.*;
class Solution {
    public int[] solution(int start_num, int end_num) {
        
        List <Integer> answer_temp = new ArrayList();
        for(int i = start_num ; i <= end_num ; i++){
            answer_temp.add(i);
        }
        int[] answer = new int[answer_temp.size()];
        for(int i = 0 ; i < answer_temp.size() ; i++){
            answer[i] = answer_temp.get(i).intValue();
        }
        return answer;
    }
}