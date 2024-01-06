import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String[] str_temp = my_string.split("");
        StringBuffer temp = new StringBuffer();
        for(int i = 0; i < s ; i++){
            temp.append(str_temp[i]);
        }
        for(int i = e ; s <= i ; i--){
            temp.append(str_temp[i]);
        }
        for(int i = e+1 ; i < str_temp.length ; i++){
            temp.append(str_temp[i]);
        }
        String answer = temp.toString();
        return answer;
    }
}