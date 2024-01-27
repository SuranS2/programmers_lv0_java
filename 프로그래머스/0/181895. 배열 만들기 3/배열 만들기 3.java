import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        List<Integer> answer_temp = new ArrayList<>();
        for(int [] interval : intervals){
            for( int i = interval[0] ; i <= interval[1] ; i++){
                answer_temp.add(arr[i]);    
            }
        }
        int idx = 0;
        int[] answer = new int[answer_temp.size()];
        for(int value : answer_temp){
            answer[idx++] = value;
        }
        return answer;
    }
}