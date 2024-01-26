class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        int i = idx;
        while(true){
            if(arr[i] == 1){
                answer = i;
                return answer;
            }
            i++;
            if(arr.length <= i){
                break;
            }
        }
        
        answer = -1;
        return answer;
    }
}