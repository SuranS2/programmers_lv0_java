import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // List로 다 박을까나.
        List<Integer> answer_temp = new ArrayList<>();
        for(int i = n ; i < num_list.length ; i++ ){
            answer_temp.add(num_list[i]);
        }
        for(int i = 0 ; i < n ; i++ ){
            answer_temp.add(num_list[i]);
        }
        
        int index = 0 ;
        int[] answer = new int[num_list.length];
        for(int value : answer_temp){
            answer[index++] = value;
        }
        return answer;
    }
}