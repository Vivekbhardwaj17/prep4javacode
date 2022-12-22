package gfgSolutions;

public class EvenSubsetsSum {
    public static void main(String[] args) {
       int count =  countSumSubsets(new int[]{2,3,4,5,6},5);
        System.out.println(count);
    }
    static int countSumSubsets(int arr[],int n)
    {
        int count =0;
        int totalSubstring = (int)Math.pow(2,n);
        for(int i=0;i<totalSubstring;i++){
            int locSetSum = 0;
            for(int j=0;j<arr.length;j++){
                if((i&(1<<j))> 0 ){
                    locSetSum+=arr[j];
                }
            }
            if(locSetSum%2==0 && locSetSum >0)
                count++;

        }
        return count;
    }
}
