import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        
        String[] answer = {};
        // Arrays.copyOfRange(arr, position, arr.length);
        
        int index = 0;
        while(index < str_list.length){
            if(str_list[index].equals("l")){
                if(Arrays.copyOfRange(str_list, 0, index).length == 0){
                    return answer;
                }else{
                    return Arrays.copyOfRange(str_list, 0, index);
                }
            }else if(str_list[index].equals("r")){
                if(Arrays.copyOfRange(str_list, index+1, str_list.length).length == 0){
                    return answer;
                }else{
                    return Arrays.copyOfRange(str_list, index+1, str_list.length);
                }
            }
            index++;
        }
        return answer;
    }
}