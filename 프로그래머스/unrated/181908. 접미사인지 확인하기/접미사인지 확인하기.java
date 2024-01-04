import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        List<String> str_temp = new ArrayList<>();
        //string은 length()
        for(int i = 0 ; i < my_string.length()  ; i++){
            str_temp.add(my_string.substring(i , my_string.length()));
        }
        //접미사 배열 문제 활용
        if(str_temp.contains(is_suffix)){
            System.out.println("포함");
            answer = 1;
        }
        return answer;
    }
}