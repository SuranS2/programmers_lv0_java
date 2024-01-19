import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        // int a = (int) 'a'; // 강제 형변환하면 문자 값이 나옴
        // int A = (int) 'A';
        // System.out.println(A);
        // a 97 z 122 A 65 -65
        //String.valueOf
        // System.out.println(a);
        // int z = (int) 'z';
        // System.out.println(z);
        int Z = (int) 'Z';
        System.out.println(Z-65);
        int A = (int) 'A';
        System.out.println(A-65);
        int a = (int) 'a';
        System.out.println(a);
        int z = (int) 'z';
        System.out.println(z);
        
        char[] char_temp = my_string.toCharArray();
        for(char ch : char_temp){
            System.out.println(ch);
            int ch_int = (int) ch;
            // System.out.println(ch_int);
            
            if(97 <= ch_int){
                ch_int = ch_int - 71;
            }else{
                ch_int = ch_int - 65;
            }
            
            answer[ch_int] ++; 
        }
        
        return answer;
    }
}