import java.util.*;

class Solution {
    public String[] solution(String my_string) {

        
        List<String> str_temp = new ArrayList<>();
        //string은 length()
        for(int i = 0 ; i < my_string.length()  ; i++){
            str_temp.add(my_string.substring(i , my_string.length()));
        }
        //Collections.sort() 기본적으로 오름차순!
        Collections.sort(str_temp);
        // System.out.println(str_temp);
        // toArray 쓸 때 내부에서 배열속성 지정 필요
        String[] answer = str_temp.toArray(new String[str_temp.size()]);
        return answer;
    }
}