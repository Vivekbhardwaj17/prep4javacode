package gfgSolutions;

public class SwapElements {
    public static void main(String[] args) {
        int[] arr=  {1,3,4,5,6};
        swapElements(arr,5);
        for (int i: arr) {
            System.out.println(i);
        }
    }
    public static void swapElements(int[] arr, int n)
    {
        // Code here
        for(int i=0;i<arr.length-2;i++){
            int loc = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = loc;
        }
    }
}
