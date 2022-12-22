package gfgSolutions;

import java.util.Arrays;

public class SpecialCount {
    public static void main(String[] args) {
        countSpecials(new int[]{1, 4, 1, 4, 4, 1 ,5 ,5 ,5, 1, 1},11,3);
    }
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        Arrays.sort(a);
        int locCount=1;
        int ans=0;
        for(int i=1;i<a.length;i++){
            if(a[i-1]==a[i]){
                locCount++;
            }

            else {
                if (locCount == f) {
                    ans++;
                }
                locCount = 1;
            }
        }
        if(locCount == f)
            ans++;

        System.out.println(ans);
    }
}