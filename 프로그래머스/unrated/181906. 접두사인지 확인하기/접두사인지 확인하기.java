import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        List<String> str_temp = new ArrayList<>();
        for(int i = 0 ; i < my_string.length() ; i++){
            str_temp.add(my_string.substring(0,i));
        }
        if(str_temp.contains(is_prefix)){
            return answer = 1;
        }
        return answer;
    }
}