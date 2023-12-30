class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuffer answer = new StringBuffer("");
        String[] split_string = my_string.split("");
        // System.out.println(split_string.length);
        for(int[] query : queries){
            StringBuffer temp = new StringBuffer("");
            for(int i = query[1] ; query[0] <= i ; i-- ){
                // System.out.println(split_string[i]);
                temp.append(split_string[i]);
            }
            
            String[] split_temp = temp.toString().split("");
            for(int i = query[0] ; i <= query[1] ; i++ ){
                // System.out.println(split_string[i]);
                split_string[i] = split_temp[i-query[0]];
            }
            // 왜 바운더리 아웃 뜨네, split_temp가 사이즈가 더 작음 시작부분 인덱스 빼면 될듯?
        }
        for(String s : split_string){
            answer.append(s);
        }
        return answer.toString();
    }
}