import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        
        List <Integer> zero_or_five = new ArrayList();
        for(int i = l ; i <= r ; i++){
            //Integer.toString
            // 정규표현식 match

            if(Integer.toString(i).matches("^[50]*$")){
                System.out.println(i);
                zero_or_five.add(i);
            }
        }
        if(zero_or_five.size() ==0){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[zero_or_five.size()];
        for(int i = 0; i < zero_or_five.size() ; i++){
            //원시값 전환 get(index).intValue()
            answer[i] = zero_or_five.get(i).intValue();
        }
        return answer;
    }
}