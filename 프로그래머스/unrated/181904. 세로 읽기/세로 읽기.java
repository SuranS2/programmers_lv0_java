class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuffer answer = new StringBuffer("");
        String[] temp = my_string.split("");
        
        int i = c;
        while(i <= my_string.length() ){
            answer.append(temp[i-1]);
            i+= m;
        }
        return answer.toString();
    }
}