package section9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body>{
    public int h,w;
    Body(int h, int w){
        this.h = h;
        this.w = w;
    }
    // 내림차순
    @Override
    public int compareTo(Body o) {
        return o.h-this.h;
    }
}
public class Solution1 {
    public int solution(ArrayList<Body> arr, int i){
        int cnt = 0;
        Collections.sort(arr);
        int max = Integer.MIN_VALUE;
        for(Body o : arr){
            if(o.w > max){
                max = o.w;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Solution1 T = new Solution1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Body(h,w));
        }
        System.out.println(T.solution(arr,n));
    }
}
