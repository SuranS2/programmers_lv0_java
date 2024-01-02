class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuffer answer = new StringBuffer("");
        int i = 0;
        for(int[] part : parts){
            // System.out.println(my_strings[i]);
            answer.append(my_strings[i].substring(part[0],part[1]+1));
            // 엑...왜 +1이지?
            // System.out.println(answer);
            i++;
            
        }
        return answer.toString();
    }
}