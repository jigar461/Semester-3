public class Lab_19_93 {
    static int[] insertionSort(int[] arr){
        for(int i=0;i<=arr.length-1;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,10,1,8,2};
        int[] ans = insertionSort(arr);
        for(int e : ans){
            System.out.print(e+" ");
        }
    }
}
