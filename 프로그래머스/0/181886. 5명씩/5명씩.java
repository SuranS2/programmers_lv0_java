import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        
        List<String> answer_temp = new ArrayList<>();
        for(int i = 1 ; i < names.length+1 ; i++){
            if((i-1)%5 == 0){
                answer_temp.add(names[i-1]);
            }  
        }
        String[] answer = new String[answer_temp.size()];
        int index = 0;
        for(String value : answer_temp){
            answer[index++] = value;
        }
        
        return answer;
    }
}