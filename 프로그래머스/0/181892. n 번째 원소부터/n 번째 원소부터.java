import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> answer_temp = new ArrayList<>();
        for(int i = n-1 ; i < num_list.length ; i++){
            answer_temp.add(num_list[i]);
        }
        int[] answer = new int[answer_temp.size()];
        int index = 0;
        for(int value : answer_temp){
            answer[index++] = value;
        }
        
        return answer;
    }
}