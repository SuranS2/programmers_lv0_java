class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuffer answer = new StringBuffer("");
        String[] setString = my_string.split("");
        for(int i : index_list){
            answer.append(setString[i]);
        }
        return answer.toString();
    }
}