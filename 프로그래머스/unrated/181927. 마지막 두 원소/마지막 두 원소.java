import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        
        List <Integer> answer_temp = new ArrayList();
        for(int num : num_list){
            answer_temp.add(num);
        }
        
        //걍 리스트 추가하면 되겠네 List
        // 변환은 asList
        // int[] 배열로 박아야함
        // 원시타입은 수동 혹은 stream 써서 집어넣어야함
        
        //인덱스값도 0부터 시작이라 last_length는 size - 1값이어야함
        int last_length = answer_temp.size()-1;
        if (answer_temp.get(last_length) > answer_temp.get(last_length-1) ){
            answer_temp.add(answer_temp.get(last_length) - answer_temp.get(last_length-1));
        }
        else if(answer_temp.get(last_length)  <=  answer_temp.get(last_length-1) ){
            answer_temp.add(answer_temp.get(last_length)*2);
        }
       
        int[] answer = new int[answer_temp.size()];
        for(int i = 0 ; i < answer_temp.size() ; i++){
            answer[i] = answer_temp.get(i);
        }
        return answer;
    }
}