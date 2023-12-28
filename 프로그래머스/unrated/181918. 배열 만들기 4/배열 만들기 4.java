import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        //스택구조 사용 자바에선 스택을 지원해줌 util에서
        //push, pop, peek, empty, seach
        //스택 선언
        List <Integer> stk = new ArrayList();
        int i = 0;
        while(i<arr.length){
            if(stk.size() == 0){
                stk.add(arr[i]);
                i++;
            }
            if(stk.get(stk.size()-1) < arr[i]){
                stk.add(arr[i]);
                i++;
            }else{
                //.del 아닌 .remove
                stk.remove(stk.size()-1);
            }
            // System.out.println(i);
            // System.out.println(stk.size());
            // System.out.println(stk);
        }
        // System.out.println(stk);
        
        //Integer[] array = stack.toArray(new Integer[stack.size()]);
        int[] stkArray = new int[stk.size()];
        //Arrays.stream(a).mapToInt(Integer::intValue).toArray(); 
        //스택 변환이 어려워서 List 사용하기로 함
        for(i = 0 ; i < stk.size(); i++){
            stkArray[i] = stk.get(i).intValue();
        }
        return stkArray;
    }
}