package gfgSolutions;

import java.util.Arrays;

public class SpecialCount {
    public static void main(String[] args) {
        countSpecials(new int[]{1, 4, 1, 4, 4, 1},6,2);
    }
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        Arrays.sort(a);
        int count=0;
        int ans =0;
        int prev = a[0];
        boolean flag=false;
        for(int i:a){
            if(count>=f){
                ans++;
                flag = true;
                count=0;
            }
            if(prev!=i){


                prev = i;
                flag = false;
            }
             if(!flag) count++;
        }
        if(count>=f){
            ans++;
            flag = true;
            count=0;
        }
        System.out.println(ans);
    }
}