class Solution {
    public int solution(int[] num_list) {
        int answer_odd = 0;
        int answer_even = 0;
        for(int i = 0; i < num_list.length ; i++){
            if( i%2 == 0){
                answer_odd += num_list[i];
            }else{
                answer_even += num_list[i];
            }
        }
        if( answer_odd > answer_even ){
            return answer_odd;
        }else{
            return answer_even;
        }
    }
}