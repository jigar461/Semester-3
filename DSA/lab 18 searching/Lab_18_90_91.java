public class Lab_18_90_91 {
    static int linearSearch(int x,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x)return i;
        }
        return -1;
    }
    static int binarySearch(int x,int[] arr,int left, int right){
        // int left = 0;
        // int right = arr.length-1;
        int mid = (left+right)/2;
        while(left <= right){
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] > x){
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
            mid = (left+right)/2;
        }
        if(left>right){
            return -1;
        }
        return mid;
    }
    public static void main(String[] args) {
        // int[] arr = {0,5,8,10,7,20,15};
        // System.out.println(linearSearch(2,arr));
        int[] arr2 = {0,5,14,17,20,22,25};
        int r = arr2.length-1;
        System.out.println(binarySearch(25, arr2,0,r));
    }
}
