import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
     
        List<Integer> arr_temp = new ArrayList<>();
        for(int arr_value : arr){
                arr_temp.add(arr_value);
        }
        //query_value 값 % 2가 아닌 순서 index값의 %2로 해야함! 문제 잘 읽고 코드짜기!
        int query_index = 0;
        for(int query_value : query){
            if( query_index % 2 == 0 ){
                for(int i = arr_temp.size()-1 ; query_value < i ; i--){
                    arr_temp.remove(i);
                }
            }else{
                for(int i = 0 ;  i < query_value ; i++){
                    arr_temp.remove(0);
                }
            }
            query_index++;
            // System.out.println(arr_temp);
        }
        int index = 0;
        int[] answer = new int[arr_temp.size()];
        for(int arr_value : arr_temp){
            answer[index++] = arr_value;
        }
        return answer;
    }
}