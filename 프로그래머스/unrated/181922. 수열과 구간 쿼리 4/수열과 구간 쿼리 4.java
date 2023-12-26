class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        // int[] answer = {};
        for(int [] query : queries){
            for(int i = 0 ; i < arr.length ; i++){
                if(query[0] <= i && i <= query[1]){
                    if(i%query[2] == 0){
                        arr[i] +=1;
                    }
                }
            }
            // for( int num : arr){
            //     System.out.print(num);
            // }
            // System.out.println();
        }
        return arr;
    }
}