import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        // 하드코딩 하는중. 리팩토링 필요*******
        int answer = 0;

        // 4개가 같을 경우 1번
        if(a == b && b==c && c==d){
            return 1111*a;
        }
        // 3개가 같을 경우 2번
        if(a==b && b==c){
            //타입캐스팅 필요 math double임
            return (int)Math.pow(10*a+d,2);
        }else if(a==b && b==d){
            return (int)Math.pow(10*a+c,2);
        }else if(b==c && c==d){
            return (int)Math.pow(10*b+a,2);
        }else if(a==c && c==d){
            return (int)Math.pow(10*a+b,2);
        }
        //4개가 다를경우 5번
        if(a!=b && a!=c && a!=d && b!=c && b!=d && c!=d){
            int min_num = a;
            if(b < min_num){
                min_num = b;
            }
            if(c < min_num){
                min_num = c;
            }if(d < min_num){
                min_num = d;
            }
            return min_num;
        }
        if(a == b && c == d){
            int absolute_num = a-c ;
            if(absolute_num < 0){
                absolute_num = -1*absolute_num;
            }
            return (a + c)*absolute_num;
        }else if(a == c && b == d){
            int absolute_num = a-b ;
            if(absolute_num < 0){
                absolute_num = -1*absolute_num;
            }
            return (a + b)*absolute_num;
        }else if(a == d && c == d){
            int absolute_num = a-c ;
            if(absolute_num < 0){
                absolute_num = -1*absolute_num;
            }
            return (a + c)*absolute_num;
        }else if(b == c && a == d){
            int absolute_num = b-a ;
            if(absolute_num < 0){
                absolute_num = -1*absolute_num;
            }
            return (b + a)*absolute_num;
        }
        
        if(a==b){
            return c*d;
        }else if(a==c){
            return b*d;
        }else if(a==d){
            return b*c;
        }else if(b==c){
            return a*d;
        }else if(b==d){
            return a*c;
        }else if(c==d){
            return a*b;
        }
        
        return answer;
    }
}