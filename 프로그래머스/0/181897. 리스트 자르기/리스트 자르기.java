import java.util.*;

class Solution {
    public List<Integer> solution(int n, int[] slicer, int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        switch(n){
                case 1 :
                    //0번 ~ slicer 인덱스 1번
                    for(int i = 0 ; i <= slicer[1] ; i++){
                        answer.add(num_list[i]);
                    }
                    break;
                case 2 :
                    //slicer 인덱스 0번 ~ 마지막
                    for(int i = slicer[0] ; i < num_list.length ; i++){
                        answer.add(num_list[i]);
                    }
                    break;
                case 3 :
                    //slicer 인덱스 a번 ~ slicer 인덱스 b번
                    for(int i = slicer[0] ; i <= slicer[1] ; i++){
                        answer.add(num_list[i]);
                    }
                    break;
                case 4 :
                    //slicer 인덱스 a번 ~ slicer 인덱스 b번 c간격
                    for(int i = slicer[0] ; i <= slicer[1] ; i=i+slicer[2]){
                        answer.add(num_list[i]);
                    }
                    break;
                default : 
                    return answer;
        }
        return answer;
    } 
}
