import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List <Integer> arr_index = new ArrayList<>();
        
        int index = 0;
        for(int value : arr){
            if(value==2){
                // System.out.printf("인덱스값 %d\n", index);
                arr_index.add(index);
            }
            index++;
        }
        // System.out.println(arr_index);
        if(arr_index.size()==0){
            int[] answer = {-1};
            return answer;
            
        }
        else{
            int[] answer = new int[arr_index.get( arr_index.size()-1 ) - arr_index.get(0) + 1];
            int j = 0 ;
            for(int i = arr_index.get(0) ; i <= arr_index.get( arr_index.size()-1 ) ; i++ ){
                // System.out.println(i);
                // System.out.printf("arr[i] 값 %d\n", arr[i]);
                //answer는 0부터 채워야함.
                answer[j++] = arr[i];
            }
            return answer;
        }
        // int[] answer = {-1};
        // return answer;

    }
}