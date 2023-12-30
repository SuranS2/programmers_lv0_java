class Solution {
    public int solution(String number) {
        int answer = 0;
        String[] split_number = number.split("");
        for(String num : split_number){
            answer += Integer.parseInt(num);
        }
        answer = answer%9;
        return answer;
    }
}