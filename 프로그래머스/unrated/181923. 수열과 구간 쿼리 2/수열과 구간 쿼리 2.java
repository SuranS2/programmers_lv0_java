import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {

        List <Integer> answer_temp = new ArrayList(); 
        //향상된 for문 써보기
        int small = 0;
        for(int[] query : queries){
            small = 1000001;
            // [s,e,k] 꼴이니까 query 순서에서 나오는거는 값 고정
            // 향상for문은 i값을 못받음 따로 i값 입력할거면 기본for문 필요
            for(int i = 0 ; i < arr.length ; i++){
                if( query[0] <= i && i <= query[1]){
                    if(arr[i] > query[2]){
                        if(small > arr[i]){
                            small = arr[i];
                        }
                    } 
                }
            }
            if(small == 1000001){
                    small = -1;
                }
            //add(원소);
            answer_temp.add(small);
            // for(int element : query){
            //     System.out.println(element);
            //     // 0 4 2 순서대로 출력됨
            //     arr[element];
            // }
        }
        //Object[] cannot be converted to int[]
        //primitive 원시 타입 데이터들은 toArray가 안됩니다.
        //for문 혹은 스트림 등
        //https://velog.io/@deannn/Java-int%ED%98%95-ArrayList-%EB%B0%B0%EC%97%B4-%EB%B3%80%ED%99%98
        int[] answer = new int[answer_temp.size()];
        for(int i = 0; i<answer_temp.size() ; i++){
            answer[i] = answer_temp.get(i);
        }
        return answer;
    }
}