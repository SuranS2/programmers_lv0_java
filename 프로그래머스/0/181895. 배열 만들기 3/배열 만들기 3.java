import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int[][] intervals) {
        // int[] answer = {};
        List<Integer> answer_temp = new ArrayList<>();
        for(int [] interval : intervals){
            for( int i = interval[0] ; i <= interval[1] ; i++){
                answer_temp.add(arr[i]);    
            }
        }
        return answer_temp;
    }
}