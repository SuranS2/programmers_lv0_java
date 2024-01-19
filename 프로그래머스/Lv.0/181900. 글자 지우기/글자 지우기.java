import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuffer answer = new StringBuffer("");
        // ***Arrays.asList() 배열 => 리스트***
        
        // UnsupportedOperationException 에러 new로 초기화해주고 값 집어넣어야함
        // List <String> cutted_str = Arrays.asList(my_string.split("")); 
        
        String[] str_temp = my_string.split("");
        
        // System.out.println(cutted_str);
        // System.out.println(cutted_str.size());
        int index = 0;
        for( int i : indices){
            // System.out.println(cutted_str.get(i));
            str_temp[i] = "";

        }
        
        List <String> cutted_str = new ArrayList<>(Arrays.asList(str_temp));
        cutted_str.remove("");
        for( int i = 0 ; i < cutted_str.size() ; i++){
            answer.append(cutted_str.get(i));
        }
        return answer.toString();
    }
}