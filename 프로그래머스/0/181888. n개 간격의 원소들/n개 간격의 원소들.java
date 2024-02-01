import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        List<Integer> answer_temp = new ArrayList<>();
        for( int i = 0 ; i < num_list.length ; i=i+n ){
            answer_temp.add(num_list[i]);
        }
        System.out.println(answer_temp);
        int[] answer = new int[answer_temp.size()];
        int index = 0;
        
        for( int value : answer_temp ){
            answer[index++] = value;
        }
        return answer;
    }
}