import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        //String substring이면 인덱스 따라 잘라버리고 문자 반환가능
        List <String> strTemp = new ArrayList<>();
        for(String str : intStrs){
            String temp = str.substring(s,s+l);
            // System.out.println(temp);
            if(k < Integer.parseInt(temp)){
                strTemp.add(temp);
            }
        }
        int[] answer = new int[strTemp.size()];
        int i = 0;
        for(String strInt : strTemp){
            answer[i] = Integer.parseInt(strInt);
            i++;
        }
        return answer;
    }
}